package test;

import java.util.List;

import domain.Fault;

public class FaultAction {

	private FaultService service;

	private Fault fault;

	public String execute() {
		List<Fault> list = service.execute(fault);

		System.out.println(list);

		return "success";
	}

	/**
	 * @return the service
	 */
	public FaultService getService() {
		return service;
	}

	/**
	 * @param service
	 *            the service to set
	 */
	public void setService(FaultService service) {
		this.service = service;
	}

	/**
	 * @return the fault
	 */
	public Fault getFault() {
		return fault;
	}

	/**
	 * @param fault
	 *            the fault to set
	 */
	public void setFault(Fault fault) {
		this.fault = fault;
	}
}
