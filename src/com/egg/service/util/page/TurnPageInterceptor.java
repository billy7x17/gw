/*******************************************************************************
 * @(#)TurnPageUrlInterceptor.java Oct 29, 2007
 *
 * Copyright 2007 Neusoft Group Ltd. All rights reserved.
 * Neusoft PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package util.page;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * @author <a href="mailto:hegq@neusoft.com">puras.he </a>
 * @version $Revision 1.1 $ Oct 29, 2007 11:23:34 AM
 */
public class TurnPageInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	private static Log log = LogFactory.getLog(TurnPageInterceptor.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#destroy()
	 */
	public void destroy() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#init()
	 */
	public void init() {
	}

	/*
	 * (non-Javadoc)
	 * @seecom.opensymphony.xwork2.interceptor.Interceptor#intercept(com.opensymphony.xwork2.
	 * ActionInvocation)
	 */
	@SuppressWarnings("unchecked")
	public String intercept(ActionInvocation invo) throws Exception {
		HttpServletRequest request = (HttpServletRequest) invo
				.getInvocationContext().get(ServletActionContext.HTTP_REQUEST);

		String url = request.getRequestURI();
		String param = "";

		if ("get".equalsIgnoreCase(request.getMethod())) {
			param = request.getQueryString();

			if (log.isDebugEnabled()) {
				log.debug("URL ==>" + url);
				log.debug("Param ==>" + param);
				log.debug("Method ==>" + request.getMethod());
			}

		} else if ("post".equalsIgnoreCase(request.getMethod())) {
			StringBuffer params = new StringBuffer();
			Enumeration paramNames = request.getParameterNames();
			while (paramNames.hasMoreElements()) {
				String name = (String) paramNames.nextElement();
				Object obj = request.getParameter(name);
				String value = "";
				if (obj instanceof String) {
					value = (String) obj;
				} else {
					value = obj.toString();
				}
				params.append(name + "=" + value + "&");
			}

			param = params.toString();
			if (param.endsWith("&")) {
				param = param.substring(0, param.length() - 1);
			}
			
			if (log.isDebugEnabled()) {
				log.debug("URL ==>" + url);
				log.debug("Param ==>" + param);
				log.debug("Method ==>" + request.getMethod());
			}
		}

		ActionContext.getContext().getParameters().put("url", url);
		ActionContext.getContext().getParameters().put("param", param);

		return invo.invoke();
	}

}
