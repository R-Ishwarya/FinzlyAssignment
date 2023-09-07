package com.ishwarya.Springproject;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
@RestController
public class FirstController {
	@RequestMapping("name")
	String getName()
	{
		return "Ishwarya";
	}
	@RequestMapping("department")
	int getId()
	{
		return 6;
	}
	@RequestMapping("array")
	ArrayList<Integer> getarray()
	{
		ArrayList<Integer> list=new ArrayList();
		list.add(1);
		list.add(2);
		return list;
		
	}
	@RequestMapping("map")
	HashMap<String,String> getmap()
	{
		HashMap<String,String> list=new HashMap();
		list.put("Ishwarya","01");
		list.put("Aarthy","02");
		return list;	
	}
	@RequestMapping("info")
	ArrayList<Integer> getinfo() throws Exception
	{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mySQL://localhost:3306/Management?", "root", "Rishu@2001");
    Statement statement = con.createStatement();
    //PreparedStatement preparedStatement =con.prepareStatement(  "INSERT INTO employee (employeeid, employeename, employeepassword) VALUES (?, ?, ?)");
    ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
    ArrayList<Integer> list = new ArrayList<>();

    while(resultSet.next()){
    	int id=resultSet.getInt("employeeid");
    	list.add(id);
	}
    return list;
	

}
}
