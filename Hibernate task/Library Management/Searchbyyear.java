package POJO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

//import com.common.HibernateConfig;
import POJO.book;
public class Searchbyyear {
	private static String publication_year;

	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		String propertyName = "year";
		if (propertyName != null && !propertyName.isEmpty()) {
		Criteria criteria = session.createCriteria(book.class);
		criteria.add(Restrictions.between(propertyName,1, 2006));
		List<book> l = criteria.list();
		System.out.println(l);
		System.out.println("Data saved successfully");
		session.close();
		}
		else
		{
			System.out.println("Invalid property");
		}
	}

}
