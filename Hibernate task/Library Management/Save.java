package POJO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Save {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		book bk=new book();
		bk.setISBN(20);
		bk.setAuthor("King");
		bk.setTitle("The story");
		bk.setYear(2001);
		session.save(bk);
		System.out.println("Data saved successfully");
		tr.commit();
		session.close();
		}

}
