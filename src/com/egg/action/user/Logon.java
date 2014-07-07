package user;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import domain.User;
import exception.PasswordIncorrectException;
import exception.UserNameNotExistException;

/**
 * 登陆Action
 * 
 * @author Billy
 * 
 */
public class Logon
{
	private UserService service;

	private User domain;

	private String errMsg;

	public String show()
	{
		return "success";
	}

	public String execute() throws Exception
	{
		User user = null;
		try
		{
			user = service.logon(domain);
		}
		catch(UserNameNotExistException e1)
		{
			errMsg = "1";// 用户名或邮箱不存在
		}
		catch(PasswordIncorrectException e2)
		{
			errMsg = "2";// 密码错误
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}

		/* 将用户详情加入Session中 */
		Map<String , Object> session = ActionContext.getContext().getSession();
		session.put("user" , user);

		return "success";
	}

	/**
	 * @return the service
	 */
	public UserService getService()
	{
		return service;
	}

	/**
	 * @param service
	 *            the service to set
	 */
	public void setService(UserService service)
	{
		this.service = service;
	}

	/**
	 * @return the domain
	 */
	public User getDomain()
	{
		return domain;
	}

	/**
	 * @param domain
	 *            the domain to set
	 */
	public void setDomain(User domain)
	{
		this.domain = domain;
	}

	/**
	 * @return the errMsg
	 */
	public String getErrMsg()
	{
		return errMsg;
	}

	/**
	 * @param errMsg
	 *            the errMsg to set
	 */
	public void setErrMsg(String errMsg)
	{
		this.errMsg = errMsg;
	}
}
