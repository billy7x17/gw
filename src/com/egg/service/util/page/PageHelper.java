/*******************************************************************************
 * @(#)PageHelper.java Oct 26, 2007
 *
 * Copyright 2007 Neusoft Group Ltd. All rights reserved.
 * Neusoft PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package util.page;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * @author <a href="mailto:hegq@neusoft.com">puras.he </a>
 * @version $Revision 1.1 $ Oct 26, 2007 11:55:57 AM
 */
public final class PageHelper {
    private PageHelper() {
    }

    private static Log log = LogFactory.getLog(PageHelper.class);

    @SuppressWarnings("unchecked")
    public static String getPageBar(Page page) {
        String firstUrl = "";
        String prevUrl = "";
        String nextUrl = "";
        String lastUrl = "";
        String numPage = "";
        String jumpPage = "";

        boolean isHasParam = true;

        if (null == page.getParam() || "".equals(page.getParam())) {
            isHasParam = false;
        }

        if (page.getTotalPageCount() > 1 && page.getCurPage() != 1) {
            firstUrl = page.getUrl() + "?page=1";
            if (isHasParam) {
                firstUrl += "&" + page.getParam();
            }
        }

        if (page.hasPreviousPage()) {
            prevUrl = page.getUrl() + "?page=" + (page.getCurPage() - 1);
            if (isHasParam) {
                prevUrl += "&" + page.getParam();
            }
        }

        if (page.hasNextPage()) {
            nextUrl = page.getUrl() + "?page=" + (page.getCurPage() + 1);
            if (isHasParam) {
                nextUrl += "&" + page.getParam();
            }
        }

        if (page.getTotalPageCount() > 1 && page.getCurPage() < page.getTotalPageCount()) {
            lastUrl = page.getUrl() + "?page=" + page.getTotalPageCount();
            if (isHasParam) {
                lastUrl += "&" + page.getParam();
            }
        }

        numPage = getNumPage(page.getPageSize(), page.getCNum());
        jumpPage = getJumpPage(page.getTotalPageCount(), page.getCurPage());

        Map root = new HashMap();

        root.put("start", new Integer(page.getStartOfPage()));
        root.put("pageSize", new Integer(page.getPageSize()));
        root.put("total", new Integer(page.getTotalCount()));
        root.put("page", new Integer(page.getCurPage()).toString());
        root.put("totalPageCount", new Integer(page.getTotalPageCount()));
        root.put("url", page.getUrl());
        root.put("param", page.getParam());
        root.put("firstUrl", firstUrl);
        root.put("prevUrl", prevUrl);
        root.put("nextUrl", nextUrl);
        root.put("lastUrl", lastUrl);
        root.put("numPage", numPage.toString());
        root.put("jumpPage", jumpPage.toString());
        root.put("numParam", page.parseParam(page.getParam(), Page.PAGE_SIZE_PREFIX));

        Configuration config = new Configuration();

        config.setClassForTemplateLoading(PageHelper.class, "");
        config.setEncoding(Locale.getDefault(), "GBK");

        StringWriter out = new StringWriter();

        Template template;
        try {
            template = config.getTemplate(page.getPageTemplate());
            template.setEncoding("GBK");
            template.process(root, out);
        } catch (IOException e) {
            log.error(e.getMessage());
        } catch (TemplateException e) {
            log.error(e.getMessage());
        }

        return out.toString();
    }

    private static String getNumPage(int pageSize, int cNum) {
        StringBuffer sb = new StringBuffer();
        final int defaultPageSize = 10;
        for (int i = 1; i <= cNum; i++) {
            int tmp = i * defaultPageSize;
            sb.append("<option value='").append(tmp).append("'");
            if (tmp == pageSize) {
                sb.append(" selected ");
            }
            sb.append(">").append(tmp).append("</option>");
        }
        return sb.toString();
    }

    private static String getJumpPage(long totalPageCount, int curPage) {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= totalPageCount; i++) {
            sb.append("<option value='").append(i).append("'");
            if (i == curPage) {
                sb.append(" selected ");
            }
            sb.append(">").append(i).append("</option>");
        }
        return sb.toString();
    }

}
