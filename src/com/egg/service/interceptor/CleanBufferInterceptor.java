package interceptor;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 
 * <b>Application describing: 清理页面缓存拦截器</b> <br>
 * <b>Copyright:</b>Copyright &copy; 2014 东软 移动互联网事业部版权所有。<br>
 * <b>Company:</b>Neusoft<br>
 * 
 * @author <a href="mailto:li-zr@neusoft.com">Zongrui.Li </a>
 * @version Revision 1.0 2014-4-30 上午11:31:05
 */
public class CleanBufferInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = -2590489368054901893L;

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		/**
		 * 清理缓存
		 */
		HttpServletResponse resp = ServletActionContext.getResponse();
		resp.setContentType("application/String; charset=utf-8");
		resp.setHeader("pragma", "no-cache");
		resp.setHeader("cache-control", "no-cache");

		return actionInvocation.invoke();
	}
}
