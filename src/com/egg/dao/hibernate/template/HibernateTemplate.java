package hibernate.template;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public abstract class HibernateTemplate {

	private SessionFactory sessionFactory;

	protected void executeUpdte(HAction action) {
		Transaction tr = null;

		Session session = null;

		try {

			session = sessionFactory.openSession();

			tr = session.beginTransaction();

			action.execute(session);

			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	protected Object executeQuery(HAction action) {

		Session session = sessionFactory.openSession();

		Object object = action.execute(session);

		session.close();

		return object;
	}

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
