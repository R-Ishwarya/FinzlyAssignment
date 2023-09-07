package POJO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class Update {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee emp=new Employee();
		emp.setEmployeeid(8);
		emp.setEmployeename("ishwarya");
		emp.setEmployeepassword("Rishu@2001");
		session.update(emp);
		System.out.println("Data saved successfully");
		tr.commit();
		session.close();
}

}
