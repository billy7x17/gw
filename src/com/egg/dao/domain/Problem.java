package domain;

import java.sql.Timestamp;

public class Problem {

	private String report_time_to_show;

	private String report_person; // 上报人

	private String school_to_show;

	private String fault_type_to_show;

	private String fault_description; // 故障描述

	private String solution_to_show;

	private String result;// 问题结果

	private String problem_status_to_show;

	private String guid; // 主键

	private Timestamp report_time; // 上报时间

	private String school; // 学校ID

	private Integer fault_type; // 故障类型编号

	private String fault_description_to_show; // 故障描述省略

	private String result_to_show;// 问题结果省略

	private Integer solution; // 解决方案编号

	private Integer problem_status; // 问题状态编号

	private Timestamp last_change_time; // 最后更新时间

	private Timestamp start_time;// 起始时间(查询条件)

	private Timestamp end_time;// 结束时间(查询条件)

	private String start_time_to_show;
	private String end_time_to_show;

	/**
	 * @return the guid
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * @param guid
	 *            the guid to set
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * @return the report_time
	 */
	public Timestamp getReport_time() {
		return report_time;
	}

	/**
	 * @param report_time
	 *            the report_time to set
	 */
	public void setReport_time(Timestamp report_time) {
		this.report_time = report_time;
	}

	/**
	 * @return the report_person
	 */
	public String getReport_person() {
		return report_person;
	}

	/**
	 * @param report_person
	 *            the report_person to set
	 */
	public void setReport_person(String report_person) {
		this.report_person = report_person;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school
	 *            the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the fault_type
	 */
	public Integer getFault_type() {
		return fault_type;
	}

	/**
	 * @param fault_type
	 *            the fault_type to set
	 */
	public void setFault_type(Integer fault_type) {
		this.fault_type = fault_type;
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
	 * @return the problem_status
	 */
	public Integer getProblem_status() {
		return problem_status;
	}

	/**
	 * @param problem_status
	 *            the problem_status to set
	 */
	public void setProblem_status(Integer problem_status) {
		this.problem_status = problem_status;
	}

	/**
	 * @return the last_change_time
	 */
	public Timestamp getLast_change_time() {
		return last_change_time;
	}

	/**
	 * @param last_change_time
	 *            the last_change_time to set
	 */
	public void setLast_change_time(Timestamp last_change_time) {
		this.last_change_time = last_change_time;
	}

	/**
	 * @return the start_time
	 */
	public Timestamp getStart_time() {
		return start_time;
	}

	/**
	 * @param start_time
	 *            the start_time to set
	 */
	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}

	/**
	 * @return the end_time
	 */
	public Timestamp getEnd_time() {
		return end_time;
	}

	/**
	 * @param end_time
	 *            the end_time to set
	 */
	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}

	public Integer getSolution() {
		return solution;
	}

	public void setSolution(Integer solution) {
		this.solution = solution;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * @return the report_time_to_show
	 */
	public String getReport_time_to_show() {
		return report_time_to_show;
	}

	/**
	 * @param report_time_to_show
	 *            the report_time_to_show to set
	 */
	public void setReport_time_to_show(String report_time_to_show) {
		this.report_time_to_show = report_time_to_show;
	}

	/**
	 * @return the school_to_show
	 */
	public String getSchool_to_show() {
		return school_to_show;
	}

	/**
	 * @param school_to_show
	 *            the school_to_show to set
	 */
	public void setSchool_to_show(String school_to_show) {
		this.school_to_show = school_to_show;
	}

	/**
	 * @return the fault_type_to_show
	 */
	public String getFault_type_to_show() {
		return fault_type_to_show;
	}

	/**
	 * @param fault_type_to_show
	 *            the fault_type_to_show to set
	 */
	public void setFault_type_to_show(String fault_type_to_show) {
		this.fault_type_to_show = fault_type_to_show;
	}

	/**
	 * @return the solution_to_show
	 */
	public String getSolution_to_show() {
		return solution_to_show;
	}

	/**
	 * @param solution_to_show
	 *            the solution_to_show to set
	 */
	public void setSolution_to_show(String solution_to_show) {
		this.solution_to_show = solution_to_show;
	}

	/**
	 * @return the problem_status_to_show
	 */
	public String getProblem_status_to_show() {
		return problem_status_to_show;
	}

	/**
	 * @param problem_status_to_show
	 *            the problem_status_to_show to set
	 */
	public void setProblem_status_to_show(String problem_status_to_show) {
		this.problem_status_to_show = problem_status_to_show;
	}

	/**
	 * @return the start_time_to_show
	 */
	public String getStart_time_to_show() {
		return start_time_to_show;
	}

	/**
	 * @param start_time_to_show
	 *            the start_time_to_show to set
	 */
	public void setStart_time_to_show(String start_time_to_show) {
		this.start_time_to_show = start_time_to_show;
	}

	/**
	 * @return the end_time_to_show
	 */
	public String getEnd_time_to_show() {
		return end_time_to_show;
	}

	/**
	 * @param end_time_to_show
	 *            the end_time_to_show to set
	 */
	public void setEnd_time_to_show(String end_time_to_show) {
		this.end_time_to_show = end_time_to_show;
	}

	/**
	 * @return the fault_description_to_show
	 */
	public String getFault_description_to_show() {
		return fault_description_to_show;
	}

	/**
	 * @param fault_description_to_show
	 *            the fault_description_to_show to set
	 */
	public void setFault_description_to_show(String fault_description_to_show) {
		this.fault_description_to_show = fault_description_to_show;
	}

	/**
	 * @return the result_to_show
	 */
	public String getResult_to_show() {
		return result_to_show;
	}

	/**
	 * @param result_to_show
	 *            the result_to_show to set
	 */
	public void setResult_to_show(String result_to_show) {
		this.result_to_show = result_to_show;
	}

}
