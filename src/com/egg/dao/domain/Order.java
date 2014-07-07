package domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 订单域(包括直销与竞标)
 * 
 * @author Billy
 * 
 */
public class Order {
	private Integer order_id;
	private BigDecimal order_price;
	private Integer order_person;
	private Integer order_type;
	private Integer order_status;
	private Integer order_goods;
	private Timestamp create_time;

	/**
	 * @return the order_id
	 */
	public Integer getOrder_id() {
		return order_id;
	}

	/**
	 * @param order_id
	 *            the order_id to set
	 */
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	/**
	 * @return the order_price
	 */
	public BigDecimal getOrder_price() {
		return order_price;
	}

	/**
	 * @param order_price
	 *            the order_price to set
	 */
	public void setOrder_price(BigDecimal order_price) {
		this.order_price = order_price;
	}

	/**
	 * @return the order_person
	 */
	public Integer getOrder_person() {
		return order_person;
	}

	/**
	 * @param order_person
	 *            the order_person to set
	 */
	public void setOrder_person(Integer order_person) {
		this.order_person = order_person;
	}

	/**
	 * @return the order_type
	 */
	public Integer getOrder_type() {
		return order_type;
	}

	/**
	 * @param order_type
	 *            the order_type to set
	 */
	public void setOrder_type(Integer order_type) {
		this.order_type = order_type;
	}

	/**
	 * @return the order_status
	 */
	public Integer getOrder_status() {
		return order_status;
	}

	/**
	 * @param order_status
	 *            the order_status to set
	 */
	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}

	/**
	 * @return the order_goods
	 */
	public Integer getOrder_goods() {
		return order_goods;
	}

	/**
	 * @param order_goods
	 *            the order_goods to set
	 */
	public void setOrder_goods(Integer order_goods) {
		this.order_goods = order_goods;
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
}
