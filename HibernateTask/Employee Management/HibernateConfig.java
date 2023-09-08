package POJO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public final class HibernateConfig {
	 public static SessionFactory getSessionFactory() {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(employee_management.class);
			SessionFactory sf = cfg.buildSessionFactory();
			return sf;

		}
		

}
