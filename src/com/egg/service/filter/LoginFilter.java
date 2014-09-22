package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <b>Application describing: 登录过滤器</b> <br>
 * 
 * @author <a href="mailto:billy7x17@gmail.com">Billy </a>
 * @version 1.0.0 2014-9-19 上午9:36:53
 */
public class LoginFilter implements Filter
{

	@Override
	public void destroy()
	{

	}

	@Override
	public void doFilter(ServletRequest arg0 , ServletResponse arg1 , FilterChain arg2) throws IOException , ServletException
	{
		HttpServletRequest req = (HttpServletRequest)arg0;
		HttpServletResponse resp = (HttpServletResponse)arg1;

		String contextPath = req.getContextPath();

		String uri = req.getRequestURI();

		if(uri.endsWith("/"))
		{
			resp.sendRedirect(contextPath + "/welcome.shtml");
			return;
		}

		arg2.doFilter(req , resp);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException
	{

	}

}
