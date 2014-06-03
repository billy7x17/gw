package hibernate.hibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{

	private static SessionFactory factory;

	static
	{
		Configuration cf = new Configuration().configure();

		factory = cf.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory()
	{
		return factory;
	}

	public static Session getSession()
	{
		return factory.openSession();
	}
}
