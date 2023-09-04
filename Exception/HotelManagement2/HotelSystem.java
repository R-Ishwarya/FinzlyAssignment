package Hotelmanagement2;
import java.util.List;
import java.util.Scanner;
public class HotelSystem {
	public static void main(String[] args) {
	EmployeeSystem employeeManager = new EmployeeSystem();
    Task taskManager = new Task();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("***Hotel Management System***");
        System.out.println("1. Hire Employee");
        System.out.println("2. List Employees by Category");
        System.out.println("3. Assign Task");
        System.out.println("4. List Tasks by Category");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                hireEmployee(employeeManager, scanner);
                break;
            case 2:
                listEmployeesByCategory(employeeManager, scanner);
                break;
            case 3:
                assignTask(taskManager, scanner);
                break;
            case 4:
                listTasksByCategory(taskManager, scanner);
                break;
            case 5:
                System.out.println("Exiting the program.");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}


private static void hireEmployee(EmployeeSystem employeeManager, Scanner scanner) {

   System.out.print("Enter employee category (Front Desk, Housekeeping, Kitchen Staff, Maintenance): ");
    String category = scanner.nextLine().toLowerCase();
    System.out.print("Enter employee name: ");
    String name = scanner.nextLine();
    System.out.print("Enter employee salary: ");
    double salary = scanner.nextDouble();

    try {
        Employee newEmployee = employeeManager.hireEmployee(category, name, salary);
        System.out.println("Employee hired successfully with ID: " + newEmployee.getEmployeeID());
    } catch (EmployeeException e) {
    System.err.println("Error: " + e.getMessage());
    } catch (IllegalArgumentException e) {
    System.err.println("Error: " + e.getMessage());
    }
}
private static void listEmployeesByCategory(EmployeeSystem employeeManager, Scanner scanner) {
    System.out.print("Enter employee category to list (Front Desk, Housekeeping, Kitchen Staff, Maintenance): ");
    String category = scanner.nextLine().toLowerCase();
    List<Employee> employees = employeeManager.getEmployeesByCategory(category);
    if (employees.isEmpty()) {
        System.out.println("No employees found in this category.");
    } else {
        System.out.println("Employees in the " + category + " category:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getEmployeeID() + ", Name: " + employee.getEmployeeName() + ", Salary: " + employee.getSalary());
        }
    }
}

private static void assignTask(Task taskManager, Scanner scanner) {
    System.out.print("Enter employee category to assign a task (Front Desk, Housekeeping, Kitchen Staff, Maintenance): ");
    String category = scanner.nextLine().toLowerCase();
    if (isValidCategory(category)) {
        System.out.print("Enter the task to assign: ");
        String task = scanner.nextLine();

        try {
            taskManager.assignTask(category, task);
            System.out.println("Task assigned successfully to the " + category + " category.");
        } catch (InvalidTaskAssignmentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    } else {
        System.err.println("Error: Invalid employee category.");
    }
}

private static void listTasksByCategory(Task taskManager, Scanner scanner) {
    System.out.print("Enter employee category to list tasks (Front Desk, Housekeeping, Kitchen Staff, Maintenance): ");
    String category = scanner.nextLine();
    List<String> tasks = taskManager.getTasksByCategory(category);
    if (tasks.isEmpty()) {
        System.out.println("No tasks found in this category.");
    } else {
        System.out.println("Tasks assigned to the " + category + " category:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
private static boolean isValidCategory(String category) {
    
    String[] validCategories = {"front desk", "housekeeping", "kitchen staff", "maintenance"};
    
    for (String validCategory : validCategories) {
        if (validCategory.equals(category)) {
            return true;
        }
    }
    return false;
}
}

