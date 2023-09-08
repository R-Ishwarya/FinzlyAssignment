package POJO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Update {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		book bk=new book();
		bk.setISBN(10);
		bk.setAuthor("divya");
		bk.setTitle("R");
		bk.setYear(2007);
		session.save(bk);
		System.out.println("Data saved successfully");
		tr.commit();
		session.close();
	}

}
