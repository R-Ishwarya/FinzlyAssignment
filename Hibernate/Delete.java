package POJO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import POJO.Employee;
public class Delete {
	public static void main(String[] args) {
	SessionFactory sf= HibernateConfig.getSessionFactory();
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	Employee emp=new Employee();
	emp.setEmployeeid(1);
	session.delete(emp);
	System.out.println("Data saved successfully");
	tr.commit();
	session.close();

}
}
