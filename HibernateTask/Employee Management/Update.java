package POJO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import POJO.HibernateConfig;

public class Update {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		employee_management emp=new employee_management();
		emp.setId(1);
		emp.setFirst_name("R");
		emp.setLast_name("ishu");
		emp.setD_o_b(12);
		emp.setEmail("ishuvenki2001@gamil.com");
		emp.setDepartment("IT");
		emp.setSalary(100000);
		session.update(emp);
		System.out.println("Data saved successfully");
		tr.commit();
		session.close();
}

}
