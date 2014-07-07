package domain;

import java.sql.Timestamp;

/**
 * 店铺域
 * @author Billy
 *
 */
public class Store {
	private Integer store_id;
	private String store_name;
	private Timestamp create_time;
	private Timestamp update_time;

	/**
	 * @return the store_id
	 */
	public Integer getStore_id() {
		return store_id;
	}

	/**
	 * @param store_id
	 *            the store_id to set
	 */
	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}

	/**
	 * @return the store_name
	 */
	public String getStore_name() {
		return store_name;
	}

	/**
	 * @param store_name
	 *            the store_name to set
	 */
	public void setStore_name(String store_name) {
		this.store_name = store_name;
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
