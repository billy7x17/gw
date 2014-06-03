package domain;

import java.sql.Timestamp;

public class Solution {

	private Integer solution_id;// 解决方案ID

	private String solution_name;// 解决方案名称

	private String solution_description;// 解决方案描述

	private String solution_description_to_show;// 解决方案描述省略

	private Timestamp solution_update_time;// 最后更新时间

	private String solution_update_time_to_show;

	/**
	 * @return the solution_id
	 */
	public Integer getSolution_id() {
		return solution_id;
	}

	/**
	 * @param solution_id
	 *            the solution_id to set
	 */
	public void setSolution_id(Integer solution_id) {
		this.solution_id = solution_id;
	}

	/**
	 * @return the solution_name
	 */
	public String getSolution_name() {
		return solution_name;
	}

	/**
	 * @param solution_name
	 *            the solution_name to set
	 */
	public void setSolution_name(String solution_name) {
		this.solution_name = solution_name;
	}

	/**
	 * @return the solution_description
	 */
	public String getSolution_description() {
		return solution_description;
	}

	/**
	 * @param solution_description
	 *            the solution_description to set
	 */
	public void setSolution_description(String solution_description) {
		this.solution_description = solution_description;
	}

	/**
	 * @return the solution_update_time
	 */
	public Timestamp getSolution_update_time() {
		return solution_update_time;
	}

	/**
	 * @param solution_update_time
	 *            the solution_update_time to set
	 */
	public void setSolution_update_time(Timestamp solution_update_time) {
		this.solution_update_time = solution_update_time;
	}

	/**
	 * @return the solution_update_time_to_show
	 */
	public String getSolution_update_time_to_show() {
		return solution_update_time_to_show;
	}

	/**
	 * @param solution_update_time_to_show
	 *            the solution_update_time_to_show to set
	 */
	public void setSolution_update_time_to_show(
			String solution_update_time_to_show) {
		this.solution_update_time_to_show = solution_update_time_to_show;
	}

	/**
	 * @return the solution_description_to_show
	 */
	public String getSolution_description_to_show() {
		return solution_description_to_show;
	}

	/**
	 * @param solution_description_to_show
	 *            the solution_description_to_show to set
	 */
	public void setSolution_description_to_show(
			String solution_description_to_show) {
		this.solution_description_to_show = solution_description_to_show;
	}

}
