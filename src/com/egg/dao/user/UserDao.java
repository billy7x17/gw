package user;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import domain.User;

/**
 * 用户DB操作
 * 
 * @author Billy
 * 
 */
public interface UserDao
{

	/**
	 * 新增用户
	 * 
	 * @param user
	 * @throws Exception
	 */
	public void insertUser(User user) throws Exception;

	/**
	 * 查询符合条件的用户
	 * 
	 * @param user
	 * @return 用户list
	 * @throws Exception
	 */
	public List<User> getUser(User user) throws Exception;

	/**
	 * 按用户登录名查询用户
	 * 
	 * @param name
	 * @return 最多只有一个元素的list
	 * @throws Exception
	 */
	public List<User> getUserByName(String name) throws Exception;

	/**
	 * 按邮箱查询用户
	 * 
	 * @param email
	 * @return 最多只有一个元素的list
	 * @throws Exception
	 */
	public List<User> getUserByEmail(String email) throws Exception;

}
