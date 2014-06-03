package domain;

import java.sql.Timestamp;

public class Fault {

	private Integer fault_id; // 故障ID

	private String fault_name; // 故障名称

	private String fault_description; // 故障类型描述
	
	private String fault_description_to_show; // 故障类型描述省略

	private Timestamp fault_update_time;// 最后更新时间

	private String fault_update_time_to_show;

	/**
	 * @return the fault_id
	 */
	public Integer getFault_id() {
		return fault_id;
	}

	/**
	 * @param fault_id
	 *            the fault_id to set
	 */
	public void setFault_id(Integer fault_id) {
		this.fault_id = fault_id;
	}

	/**
	 * @return the fault_name
	 */
	public String getFault_name() {
		return fault_name;
	}

	/**
	 * @param fault_name
	 *            the fault_name to set
	 */
	public void setFault_name(String fault_name) {
		this.fault_name = fault_name;
	}

	/**
	 * @return the fault_description
	 */
	public String getFault_description() {
		return fault_description;
	}

	/**
	 * @param fault_description
	 *            the fault_description to set
	 */
	public void setFault_description(String fault_description) {
		this.fault_description = fault_description;
	}

	/**
	 * @return the fault_update_time
	 */
	public Timestamp getFault_update_time() {
		return fault_update_time;
	}

	/**
	 * @param fault_update_time
	 *            the fault_update_time to set
	 */
	public void setFault_update_time(Timestamp fault_update_time) {
		this.fault_update_time = fault_update_time;
	}

	/**
	 * @return the fault_update_time_to_show
	 */
	public String getFault_update_time_to_show() {
		return fault_update_time_to_show;
	}

	/**
	 * @param fault_update_time_to_show
	 *            the fault_update_time_to_show to set
	 */
	public void setFault_update_time_to_show(String fault_update_time_to_show) {
		this.fault_update_time_to_show = fault_update_time_to_show;
	}

	/**
	 * @return the fault_description_to_show
	 */
	public String getFault_description_to_show() {
		return fault_description_to_show;
	}

	/**
	 * @param fault_description_to_show the fault_description_to_show to set
	 */
	public void setFault_description_to_show(String fault_description_to_show) {
		this.fault_description_to_show = fault_description_to_show;
	}

}
