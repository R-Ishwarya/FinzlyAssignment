package POJO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import POJO.book;
public class Delete {
	public static void main(String[] args) {
	SessionFactory sf= HibernateConfig.getSessionFactory();
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	book bk=new book();
	bk.setISBN(10);
	session.delete(bk);
	System.out.println("Data saved successfully");
	tr.commit();
	session.close();

}
}
