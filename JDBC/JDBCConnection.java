package demo;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Scanner;
public class JDBCConnection {

	public static void main(String[] args) throws Exception {
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(
        "jdbc:mySQL://localhost:3306/Management?", "root", "Rishu@2001");
        Statement statement = con.createStatement();
        PreparedStatement preparedStatement =con.prepareStatement(  "INSERT INTO employee (employeeid, employeename, employeepassword) VALUES (?, ?, ?)");
        Scanner scanner = new Scanner(System.in);
        boolean check=true;
        while (check) {
            
            
            System.out.println("CRUD Operations:");
            System.out.println("1. Create (Insert) using Statement");
            System.out.println("2. Create (Insert) using PreparedStatement");
            System.out.println("3. Read (Select)");
            System.out.println("4. Update using Statement");
            System.out.println("5. Update using PreparedStatement");
            System.out.println("6. Delete using Statement");
            System.out.println("7. Delete using PreparedStatement");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:{

                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                        
                    scanner.nextLine(); 
                      
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                        
                    System.out.print("Enter employee password: ");
                    String password = scanner.nextLine();

                    String query = "INSERT INTO employee (employeeid,employeename,employeepassword) VALUES(" + id+",'"+name+"','"+password+"')";
                    statement.executeUpdate(query);
                    
                    System.out.println("Record inserted successfully using Statement.");

                }
                    break;

                case 2:{

                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                        
                    scanner.nextLine(); 

                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                        
                    System.out.print("Enter employee password: ");
                    String password = scanner.nextLine();

                    preparedStatement = con.prepareStatement(  "INSERT INTO employee (employeeid, employeename, employeepassword) VALUES (?, ?, ?)");

                    preparedStatement.setInt(1, id);
                    preparedStatement.setString(2, name);
                    preparedStatement.setString(3, password);

                    preparedStatement.executeUpdate();

                    System.out.println("Record inserted successfully using PreparedStatement.");

                }
                    break;

                case 3:{

                    ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");

                    while(resultSet.next()){

                        System.out.println("ID: "+resultSet.getInt("employeeid")+", Name: "+resultSet.getString("employeename")+
                        ", password: "+resultSet.getString("employeepassword"));
                    }


                }
                    break;

                case 4:{

                    System.out.print("Enter employee ID to update: ");
                    int updateId = scanner.nextInt();
                
                    scanner.nextLine();
                    
                    System.out.print("Enter new employee password: ");
                    String newemployeepassword = scanner.nextLine();

                    String query = "UPDATE employee SET employeepassword=" + newemployeepassword +" WHERE employeeid= "+updateId;

                    statement.executeUpdate(query);

                    System.out.println("Record updated successfully using Statement.");
                
                }
                    break;

                case 5:{

                    System.out.print("Enter employee ID to update: ");
                    int updateId = scanner.nextInt();
                    
                    scanner.nextLine(); 
                    
                    System.out.print("Enter new employee password: ");
                    String newemployeepassword = scanner.nextLine();

                    
                    preparedStatement = con.prepareStatement("UPDATE employee SET employeepassword = ? WHERE employeeid = ?");

                                       
                    preparedStatement.setString(1,newemployeepassword );
                    preparedStatement.setInt(2, updateId);

                    preparedStatement.executeUpdate();

                    System.out.println("Record updated successfully using PreparedStatement.");
                }
                   break;

                case 6:{

                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    
                    String query = "DELETE FROM employee WHERE employeeid = " + deleteId;
                    statement.executeUpdate(query);
                    
                    System.out.println("Record deleted successfully using Statement.");
                   
                }
                     break;
                
                case 7:{

                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    
            
                    preparedStatement = con.prepareStatement( "DELETE FROM employee WHERE employeeid= ?");
                    preparedStatement.setInt(1, deleteId);

                     preparedStatement.executeUpdate();


                    
                    System.out.println("Record deleted successfully using preparedStatement.");


                }
                    break;
                

                case 8:{

                    check=false;
                    System.out.println("Exiting...");

                }
                    break;
            
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
    }
}