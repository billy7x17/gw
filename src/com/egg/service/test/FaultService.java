package test;

import java.util.ArrayList;
import java.util.List;

import domain.Fault;

public class FaultService {

	private FaultDao dao;

	public List<Fault> execute(Fault fault) {
		dao.insertFault(fault);

		List<Fault> list = new ArrayList<Fault>();

		list = dao.getAllFaults();

		return list;
	}

	/**
	 * @return the dao
	 */
	public FaultDao getDao() {
		return dao;
	}

	/**
	 * @param dao
	 *            the dao to set
	 */
	public void setDao(FaultDao dao) {
		this.dao = dao;
	}

}
