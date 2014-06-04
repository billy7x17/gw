package hibernate.template;

import hibernate.hibernateUtil.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class HibernateTemplate
{

	protected void executeUpdte(HAction action)
	{
		Session session = null;
		Transaction tr = null;
		try
		{
			session = HibernateUtil.getSession();

			tr = session.beginTransaction();

			action.execute(session);

			tr.commit();
		}
		catch(Exception e)
		{
			tr.rollback();
		}
		finally
		{
			session.close();
		}

	}

	protected Object executeQuery(HAction action)
	{
		Session session = HibernateUtil.getSession();

		Object object = action.execute(session);

		session.close();

		return object;
	}
}
