package test;

import java.util.List;

import org.apache.log4j.Logger;

import domain.Fault;

public class FaultAction {
	
	private final Logger log = Logger.getLogger("test.FaultAction"); 

	private FaultService service;

	private Fault fault;

	public String execute() {
		
		if (null == fault) {
			fault = new Fault();
			fault.setFault_id(88);
			fault.setFault_name("ssh测试");
			fault.setFault_description("ssh测试测试");
		}
		
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
