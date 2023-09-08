package POJO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
//import POJO.HibernateConfig;
import POJO.book;
public class Displaybooks {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(book.class);
		List<book> l = criteria.list();
		
		for (book entity : l) {
            System.out.println(entity);
        }
		System.out.println("Data saved successfully");
		session.close();
	}

}
