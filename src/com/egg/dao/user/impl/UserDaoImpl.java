package user.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import user.UserDao;

import domain.User;

/**
 * 用户DaoImpl
 * 
 * @author Billy
 * 
 */
public class UserDaoImpl implements UserDao
{

	private HibernateTemplate dao;

	public void insertUser(User user) throws Exception
	{
		dao.save("domain.User" , user);
	}

	@SuppressWarnings("unchecked")
	public List<User> getUser(User user) throws Exception
	{

		String[] paras = new String[]
		{"user_id" , "user_name" , "email"};
		String[] values = new String[]
		{user.getUser_id().toString() , user.getUser_name() , user.getEmail()};

		return dao.findByNamedParam("from portal_user_t" , paras , values);
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserByName(String name) throws Exception
	{
		return dao
				.find("from domain.User where user_name = " + name);
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserByEmail(String email) throws Exception
	{
		return dao.findByNamedParam("from portal_user_t" , "email" , email);
	}

	/**
	 * @return the dao
	 */
	public HibernateTemplate getDao()
	{
		return dao;
	}

	/**
	 * @param dao
	 *            the dao to set
	 */
	public void setDao(HibernateTemplate dao)
	{
		this.dao = dao;
	}
}
