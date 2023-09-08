package POJO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import POJO.employee_management;
public class Save {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		employee_management emp=new employee_management();
		emp.setId(10);
		emp.setFirst_name("divya");
		emp.setLast_name("R");
		emp.setD_o_b(02);
		emp.setEmail("divya2001@gamil.com");
		emp.setDepartment("developer");
		emp.setSalary(10000);
		session.save(emp);
		System.out.println("Data saved successfully");
		tr.commit();
		session.close();
		}

}
