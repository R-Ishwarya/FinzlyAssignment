package POJO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class Load {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		//System.out.println("ishu1");
		Session session = sf.openSession();
		//System.out.println("ishu2");
		Transaction tr = session.beginTransaction();
		//System.out.println("ishu3");
		employee_management e = session.load(employee_management.class, 1);
		//System.out.println("ishu4");
		System.out.println(e);
		tr.commit();
		
		session.close();
	}

}
