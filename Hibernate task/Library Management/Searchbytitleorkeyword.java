package POJO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
//import com.common.HibernateConfig;
import POJO.book;
public class Searchbytitleorkeyword {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(book.class);
		criteria.add(Restrictions.or(Restrictions.eq("title","The story") , Restrictions.like("title","%"+"story"+"%")));
//		criteria.add(Restrictions.or(Restrictions.eq("title","Lord of the Rings") , Restrictions.like("title","%"+"of"+"%")));
//		criteria.add(Restrictions.or(Restrictions.eq("title","Lord of the Rings") , Restrictions.like("title","%"+"r"+"%)));
		List<book> l = criteria.list();
		System.out.println(l);
		System.out.println("Data saved successfully");
		session.close();
	}

}
