package problem4;
import java.util.*;
public class hospital {
	private int patientId;
    private String name;
    private int age;
    public hospital(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public int getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
    public static void main(String[] args) {
        Map<Integer, hospital> patients = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean check=true;
        while (check) {
            System.out.println("***Hospital Management System***");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient Details");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. List All Patients");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter patient name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int patientAge = scanner.nextInt();
                    patients.put(patientId, new hospital(patientId, patientName, patientAge));
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    System.out.print("Enter patient ID to view details: ");
                    int viewPatientId = scanner.nextInt();
                    if (patients.containsKey(viewPatientId)) {
                        System.out.println("Patient Details:");
                        System.out.println(patients.get(viewPatientId));
                    } else {
                        System.out.println("Patient with ID " + viewPatientId + " not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter patient ID to search: ");
                    int searchPatientId = scanner.nextInt();
                    if (patients.containsKey(searchPatientId)) {
                        System.out.println("Patient found:");
                        System.out.println(patients.get(searchPatientId));
                    } else {
                        System.out.println("Patient with ID " + searchPatientId + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("List of Patients:");
                    for (hospital patient : patients.values()) {
                        System.out.println(patient);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    check=false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
