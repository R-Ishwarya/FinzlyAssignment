package POJO;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	@Entity
	public class Employee  {
		int employeeid;
		private String employeename;
		private String employeepassword;
		@Id
		public int getEmployeeid() {
			return employeeid;
		}
		public void setEmployeeid(int employeeid) {
			this.employeeid = employeeid;
		}
		public String getEmployeename() {
			return employeename;
		}
		public void setEmployeename(String employeename) {
			this.employeename = employeename;
		}
		public String getEmployeepassword() {
			return employeepassword;
		}
		public void setEmployeepassword(String employeepassword) {
			this.employeepassword = employeepassword;
		}
		@Override
		public String toString() {
			return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeepassword="
					+ employeepassword + "]";
		}

	}
