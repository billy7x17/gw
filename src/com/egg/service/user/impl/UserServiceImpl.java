package user.impl;

import java.util.List;

import user.UserDao;
import user.UserService;
import util.DES3;
import util.StringUtil;

import domain.User;
import exception.PasswordIncorrectException;
import exception.UserNameNotExistException;

/**
 * 用户业务操作Impl
 * 
 * @author Billy
 * 
 */
public class UserServiceImpl implements UserService
{

	private UserDao dao;

	public int register(User user) throws Exception
	{

		int flag = 0;
		List<User> userListByName = null;
		List<User> userListByEmail = null;
		try
		{
			userListByName = dao.getUserByName(user.getUser_name());

			userListByEmail = dao.getUserByEmail(user.getEmail());
		}
		catch(Exception e)
		{
			flag = 3;
			throw e;
		}

		/* 用户名重名 */
		if(null != userListByName && !userListByName.isEmpty())
		{
			flag = 1;
		}

		/* 邮箱已被注册 */
		if(null != userListByEmail && !userListByEmail.isEmpty())
		{
			flag = 2;
		}

		/* 如果各个条件都允许，注册用户 */
		if(flag == 0)
		{
			/* 密码加密 */
			String p = user.getPassword();

			user.setPassword(DES3.encrypt(p));

			try
			{
				dao.insertUser(user);
			}
			catch(Exception e)
			{
				flag = 3;
				throw e;
			}
		}

		return flag;
	}

	public User logon(User user) throws Exception
	{
		User resUser = null;

		/* 判空：是否是上层出错 */
		if(null == user || StringUtil.isNull(user.getUser_name()) || null == user.getPassword())
		{
			throw new Exception("Fuck Upstair!!!");
		}

		List<User> userListByName = dao.getUserByName(user.getUser_name());

		List<User> userListByEmail = dao.getUserByEmail(user.getUser_name());

		/* 密码加密 */
		String p = user.getPassword();
		user.setPassword(DES3.encrypt(p));

		List<User> userList = dao.getUser(user);

		/* 用户名或邮箱均不存在 */
		if(( null == userListByName || userListByName.isEmpty() ) && ( null == userListByEmail || userListByEmail.isEmpty() ))
		{
			throw new UserNameNotExistException();
		}

		/* 用户名或密码错误 */
		if(null == userList || userList.isEmpty())
		{
			throw new PasswordIncorrectException();
		}

		/* 查询结果多于1个 */
		if(userList.size() > 1)
		{
			throw new Exception("Multiple Results Exception");
		}

		/* 没有抛异常则选择结果集中的唯一结果 */
		resUser = userList.get(0);
		return resUser;
	}

	/**
	 * @return the dao
	 */
	public UserDao getDao()
	{
		return dao;
	}

	/**
	 * @param dao
	 *            the dao to set
	 */
	public void setDao(UserDao dao)
	{
		this.dao = dao;
	}

}
