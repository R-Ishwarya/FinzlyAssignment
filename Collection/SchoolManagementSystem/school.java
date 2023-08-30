package problem3;
import java.util.*;
public class school {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
        	System.out.println();
            System.out.println("***School Management System***");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display Students");
            System.out.println("4. Display Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            switch (n) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter Student Age: ");
                    int studentAge = scanner.nextInt();
                    System.out.print("Enter Student Roll Number: ");
                    int studentRollNumber = scanner.nextInt();
                    Student student = new Student(studentName, studentAge, studentRollNumber);
                    students.add(student);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Teacher Name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter Teacher Age: ");
                    int teacherAge = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Teacher Subject: ");
                    String teacherSubject = scanner.nextLine();
                    Teacher teacher = new Teacher(teacherName, teacherAge, teacherSubject);
                    teachers.add(teacher);
                    System.out.println("Teacher added successfully!");
                    break;

                case 3:
                    for (Student stu : students) {
                        System.out.println(stu);
                    }
                    break;

                case 4:
                    for (Teacher tch : teachers) {
                        System.out.println(tch);
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

  