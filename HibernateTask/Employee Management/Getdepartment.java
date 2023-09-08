package POJO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
//import com.common.HibernateConfig;
import POJO.employee_management;
public class Getdepartment {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(employee_management.class);
		criteria.add(Restrictions.or(Restrictions.eq("department","Developer") , Restrictions.eq("department","tester")));
		List<employee_management> l = criteria.list();
		System.out.println(l);
		System.out.println("Data saved successfully");
		session.close();
	}
}
