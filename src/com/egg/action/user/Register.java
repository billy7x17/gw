package user;

import domain.User;

/**
 * 注册用户Action
 * 
 * @author Billy
 * 
 */
public class Register
{
	private UserService service;

	private User domain;

	private String errMsg;

	public String show() throws Exception
	{
		return "success";
	}

	public String execute() throws Exception
	{
		/* 1-用户名重名 2-邮箱已被注册 */
		Integer flag = service.register(domain);

		errMsg = flag.toString();

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
