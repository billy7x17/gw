package domain;

import java.sql.Timestamp;

/**
 * 浏览记录域
 * 
 * @author Billy
 * 
 */
public class Record
{
	private Integer record_id;
	private Integer user_id;
	private Integer goods_id;
	private Integer store_id;
	private Timestamp create_time;

	/**
	 * @return the record_id
	 */
	public Integer getRecord_id()
	{
		return record_id;
	}

	/**
	 * @param record_id
	 *            the record_id to set
	 */
	public void setRecord_id(Integer record_id)
	{
		this.record_id = record_id;
	}

	/**
	 * @return the user_id
	 */
	public Integer getUser_id()
	{
		return user_id;
	}

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(Integer user_id)
	{
		this.user_id = user_id;
	}

	/**
	 * @return the goods_id
	 */
	public Integer getGoods_id()
	{
		return goods_id;
	}

	/**
	 * @param goods_id
	 *            the goods_id to set
	 */
	public void setGoods_id(Integer goods_id)
	{
		this.goods_id = goods_id;
	}

	/**
	 * @return the store_id
	 */
	public Integer getStore_id()
	{
		return store_id;
	}

	/**
	 * @param store_id
	 *            the store_id to set
	 */
	public void setStore_id(Integer store_id)
	{
		this.store_id = store_id;
	}

	/**
	 * @return the create_time
	 */
	public Timestamp getCreate_time()
	{
		return create_time;
	}

	/**
	 * @param create_time
	 *            the create_time to set
	 */
	public void setCreate_time(Timestamp create_time)
	{
		this.create_time = create_time;
	}

}
