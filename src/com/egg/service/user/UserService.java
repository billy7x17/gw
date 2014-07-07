package user;

import domain.User;

/**
 * 用户业务操作
 * 
 * @author Billy
 * 
 */
public interface UserService
{
	/**
	 * 用户注册
	 * 
	 * @param user
	 * @return 注册是否成功的状态码 0-成功 1-用户名重名 2-邮箱已被注册 3-程序异常
	 */
	public int register(User user) throws Exception;

	/**
	 * 用户登录(暂时没有论坛  不作单点登录)
	 * @param user 用户名、密码
	 * @return 符合条件的唯一用户
	 * @throws Exception
	 */
	public User logon(User user) throws Exception;
}
