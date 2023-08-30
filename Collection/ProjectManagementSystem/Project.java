package problem5;
import java.util.*;
public class Project {
	    private String projectName;
	    private String description;
	    private Set<String> teamMembers;
	    public Project(String projectName, String description) {
	        this.projectName = projectName;
	        this.description = description;
	        this.teamMembers = new HashSet<>();
	    }
	    public String getProjectName() {
	        return projectName;
	    }
	    public String getDescription() {
	        return description;
	    }
	    public void addTeamMember(String teamMember) {
	        teamMembers.add(teamMember);
	    }
	    public Set<String> getTeamMembers() {
	        return teamMembers;
	    }
	    @Override
	    public String toString() {
	        return "Project Name: " + projectName + ", Description: " + description +
	                ", Team Members: " + teamMembers;
	    }
	 public static void main(String[] args) {
	        Map<String, Project> projects = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);
            boolean check=false;
	        while (check){
	            System.out.println("Project Management System");
	            System.out.println("1. Add Project");
	            System.out.println("2. Assign Team Member to Project");
	            System.out.println("3. View Project Details");
	            System.out.println("4. List All Projects");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int n = scanner.nextInt();
	            scanner.nextLine(); 
	            switch (n) {
	                case 1:
	                    System.out.print("Enter project name: ");
	                    String projectName = scanner.nextLine();
	                    System.out.print("Enter project description: ");
	                    String projectDescription = scanner.nextLine();
	                    projects.put(projectName, new Project(projectName, projectDescription));
	                    System.out.println("Project added successfully!");
	                    break;

	                case 2:
	                    System.out.print("Enter project name: ");
	                    String assignProjectName = scanner.nextLine();
	                    if (projects.containsKey(assignProjectName)) {
	                        System.out.print("Enter team member name: ");
	                        String teamMember = scanner.nextLine();
	                        projects.get(assignProjectName).addTeamMember(teamMember);
	                        System.out.println("Team member assigned to project!");
	                    } else {
	                        System.out.println("Project with name " + assignProjectName + " not found.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter project name to view details: ");
	                    String viewProjectName = scanner.nextLine();
	                    if (projects.containsKey(viewProjectName)) {
	                        System.out.println("Project Details:");
	                        System.out.println(projects.get(viewProjectName));
	                    } else {
	                        System.out.println("Project with name " + viewProjectName + " not found.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("List of Projects:");
	                    for (Project project : projects.values()) {
	                        System.out.println(project);
	                    }
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    check=false;

	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	    }
}
