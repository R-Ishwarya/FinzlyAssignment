package POJO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import POJO.employee_management;
public class Delete {
	public static void main(String[] args) {
	SessionFactory sf= HibernateConfig.getSessionFactory();
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	employee_management emp=new employee_management();
	emp.setId(3);
	session.delete(emp);
	System.out.println("Data saved successfully");
	tr.commit();
	session.close();

}
}