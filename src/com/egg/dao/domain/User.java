package domain;

import java.sql.Timestamp;

/**
 * 消费者用户域(暂定)
 * 
 * @author Billy
 * 
 */

public class User {
	private Integer user_id;
	private String user_name;
	private String password;
	private String user_nick;
	private String user_head;
	private String user_sex;
	private String email;
	private String mobile;
	private String user_styles;
	private Integer recent_bid;
	private Integer recent_buy;
	private Timestamp create_time;
	private Timestamp update_time;

	/**
	 * @return the user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name
	 *            the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the user_nick
	 */
	public String getUser_nick() {
		return user_nick;
	}

	/**
	 * @param user_nick
	 *            the user_nick to set
	 */
	public void setUser_nick(String user_nick) {
		this.user_nick = user_nick;
	}

	/**
	 * @return the user_head
	 */
	public String getUser_head() {
		return user_head;
	}

	/**
	 * @param user_head
	 *            the user_head to set
	 */
	public void setUser_head(String user_head) {
		this.user_head = user_head;
	}

	/**
	 * @return the user_sex
	 */
	public String getUser_sex() {
		return user_sex;
	}

	/**
	 * @param user_sex
	 *            the user_sex to set
	 */
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the user_styles
	 */
	public String getUser_styles() {
		return user_styles;
	}

	/**
	 * @param user_styles
	 *            the user_styles to set
	 */
	public void setUser_styles(String user_styles) {
		this.user_styles = user_styles;
	}

	/**
	 * @return the recent_bid
	 */
	public Integer getRecent_bid() {
		return recent_bid;
	}

	/**
	 * @param recent_bid
	 *            the recent_bid to set
	 */
	public void setRecent_bid(Integer recent_bid) {
		this.recent_bid = recent_bid;
	}

	/**
	 * @return the recent_buy
	 */
	public Integer getRecent_buy() {
		return recent_buy;
	}

	/**
	 * @param recent_buy
	 *            the recent_buy to set
	 */
	public void setRecent_buy(Integer recent_buy) {
		this.recent_buy = recent_buy;
	}

	/**
	 * @return the create_time
	 */
	public Timestamp getCreate_time() {
		return create_time;
	}

	/**
	 * @param create_time
	 *            the create_time to set
	 */
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}

	/**
	 * @return the update_time
	 */
	public Timestamp getUpdate_time() {
		return update_time;
	}

	/**
	 * @param update_time
	 *            the update_time to set
	 */
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
}
