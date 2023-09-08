package POJO;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class employee_management {
	private int id;
	private String first_name;
	private String last_name;
	private int d_o_b;
	private String email;
	private String department;
	private int salary;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getD_o_b() {
		return d_o_b;
	}
	public void setD_o_b(int d_o_b) {
		this.d_o_b = d_o_b;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", d_o_b=" + d_o_b
				+ ", email=" + email + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
}
