package POJO;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
//import com.common.HibernateConfig;
import POJO.book;
public class Searchbyauthor {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(book.class);
		criteria.add(Restrictions.eq("author","Divya"));
		List<book> l = criteria.list();
		System.out.println(l);
		System.out.println("Data saved successfully");
		session.close();
	}

}
