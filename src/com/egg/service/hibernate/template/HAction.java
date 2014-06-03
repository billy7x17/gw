package hibernate.template;

import org.hibernate.Session;

public interface HAction {
	public Object execute(Session session);
}
