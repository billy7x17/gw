package interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * <b>Application describing: 字符集转换struts拦截器</b> <br>
 * <b>Copyright:</b>Copyright &copy; 2014 东软 移动互联网事业部版权所有。<br>
 * <b>Company:</b>Neusoft<br>
 * 
 * @author <a href="mailto:li-zr@neusoft.com">Zongrui.Li </a>
 * @version Revision 1.0 2014-5-19 上午10:40:28
 */
public class EncodingInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = -6711281623381972890L;

	@Override
	public String intercept(ActionInvocation inv) throws Exception {

		ServletActionContext.getRequest().setCharacterEncoding("UTF-8");
		ServletActionContext.getResponse().setCharacterEncoding("UTF-8");

		return inv.invoke();
	}

}
