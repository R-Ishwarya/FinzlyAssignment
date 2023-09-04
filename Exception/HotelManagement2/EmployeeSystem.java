package Hotelmanagement2;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class EmployeeSystem {
	private Map<String,List<Employee>> empCategory = new HashMap<>();
	private int employeeIdCounter=1;
	
	public Employee hireEmployee(String category,String name,double salary) throws EmployeeException
	{
		category = category.toLowerCase();
		Employee newEmployee;
		switch(category)
		{
		case "front desk":
			newEmployee= new FrontEmployee(employeeIdCounter++,name,salary);
			break;
		case "house keeping":
			newEmployee= new HouseKeeping(employeeIdCounter++,name,salary);
			break;
		case "kitchen staff":
			newEmployee= new KithchenEmployee(employeeIdCounter++,name,salary);
			break;
		case "maintenance":
			newEmployee= new MaintenanceEmployee(employeeIdCounter++,name,salary);
			break;
		default:
			throw new IllegalArgumentException("Invalid Employee Category.");		
		}
        if (empCategory.containsKey(category.toLowerCase())) {
            for (Employee employee : empCategory.get(category)) {
                if (employee.getEmployeeName().equalsIgnoreCase(name)) {
                    throw new EmployeeException("Employee with the same name already exists in this category.");
                }
            }
        } 
        else 
        {
            empCategory.put(category, new ArrayList<>());
        }
        empCategory.get(category).add(newEmployee);
		return newEmployee;
	}
	
	public List<Employee> getEmployeesByCategory(String category) {
        return empCategory.getOrDefault(category.toLowerCase(), new ArrayList<>());
    }
	

}

}
