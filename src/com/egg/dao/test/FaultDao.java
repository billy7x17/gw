package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import domain.Fault;
import hibernate.template.HAction;
import hibernate.template.HibernateTemplate;

public class FaultDao extends HibernateTemplate {
	
	public void insertFault(final Fault fault) {
		executeUpdte(new HAction() {
			@Override
			public Object execute(Session session) {
				session.save(fault);
				return fault;
			}
		});
	}

	public void deleteFault(final Fault fault) {
		executeUpdte(new HAction() {
			@Override
			public Object execute(Session session) {
				session.delete(fault);
				return null;
			}
		});
	}

	public void updateFault(final Fault fault) {
		executeUpdte(new HAction() {
			@Override
			public Object execute(Session session) {
				session.update(fault);
				return null;
			}
		});
	}

	public Fault searchFaultById(final Fault fault) {
		return (Fault) executeQuery(new HAction() {
			@Override
			public Object execute(Session session) {
				return session.get("Fault", fault.getFault_id());
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Fault> getAllFaults() {
		return (List<Fault>) executeQuery(new HAction() {
			@Override
			public Object execute(Session session) {
				
				Query query = session.createQuery("from Fault");
				
				return query.list();
			}
		});
	}
}
