package domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 商品域
 * @author Billy
 *
 */
public class Goods {
	private Integer goods_id;
	private String goods_name;
	private String goods_icon;
	private BigDecimal goods_price;
	private Integer belong_to_store;
	private Integer sale_type;
	private String goods_desc;
	private Integer is_sold;
	private Timestamp create_time;
	private Timestamp update_time;

	/**
	 * @return the goods_id
	 */
	public Integer getGoods_id() {
		return goods_id;
	}

	/**
	 * @param goods_id
	 *            the goods_id to set
	 */
	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}

	/**
	 * @return the goods_name
	 */
	public String getGoods_name() {
		return goods_name;
	}

	/**
	 * @param goods_name
	 *            the goods_name to set
	 */
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	/**
	 * @return the goods_icon
	 */
	public String getGoods_icon() {
		return goods_icon;
	}

	/**
	 * @param goods_icon
	 *            the goods_icon to set
	 */
	public void setGoods_icon(String goods_icon) {
		this.goods_icon = goods_icon;
	}

	/**
	 * @return the goods_price
	 */
	public BigDecimal getGoods_price() {
		return goods_price;
	}

	/**
	 * @param goods_price
	 *            the goods_price to set
	 */
	public void setGoods_price(BigDecimal goods_price) {
		this.goods_price = goods_price;
	}

	/**
	 * @return the belong_to_store
	 */
	public Integer getBelong_to_store() {
		return belong_to_store;
	}

	/**
	 * @param belong_to_store
	 *            the belong_to_store to set
	 */
	public void setBelong_to_store(Integer belong_to_store) {
		this.belong_to_store = belong_to_store;
	}

	/**
	 * @return the sale_type
	 */
	public Integer getSale_type() {
		return sale_type;
	}

	/**
	 * @param sale_type
	 *            the sale_type to set
	 */
	public void setSale_type(Integer sale_type) {
		this.sale_type = sale_type;
	}

	/**
	 * @return the goods_desc
	 */
	public String getGoods_desc() {
		return goods_desc;
	}

	/**
	 * @param goods_desc
	 *            the goods_desc to set
	 */
	public void setGoods_desc(String goods_desc) {
		this.goods_desc = goods_desc;
	}

	/**
	 * @return the is_sold
	 */
	public Integer getIs_sold() {
		return is_sold;
	}

	/**
	 * @param is_sold
	 *            the is_sold to set
	 */
	public void setIs_sold(Integer is_sold) {
		this.is_sold = is_sold;
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
