package user.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import user.UserDao;
import util.StringUtil;

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

		StringBuffer sql = new StringBuffer("from domain.User where 1=1 ");

		if(!StringUtil.isNull(user.getUser_name()))
		{
			sql.append(" and user_name = ?");
		}
		if(!StringUtil.isNull(user.getPassword()))
		{
			sql.append(" and password = ?");
		}

		return dao.find(sql.toString() , new String[]
		{user.getUser_name() , user.getPassword()});
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserByName(String name) throws Exception
	{
		List<User> result = dao.find("from domain.User where user_name = ?" , name);

		return result;
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserByEmail(String email) throws Exception
	{
		return dao.find("from domain.User where email = ?" , email);
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
