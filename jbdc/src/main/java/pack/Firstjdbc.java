package pack;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Firstjdbc {
public static void main(String[] args) throws SQLException {
	//1st step
	Driver dr=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(dr);
	//2nd step
	String dburl="jdbc:mysql://localhost:3306/admin?user=root&password=madhu";
	
	Connection con= DriverManager.getConnection(dburl);
	//3 step
	Statement statement = con.createStatement();
	//4th step
//	int res= statement.executeUpdate("insert into employee values(101,'hari',92928371)");
//	int res= statement.executeUpdate("delete from employee where id=101");
	int res= statement.executeUpdate("update employee set password=987465372 where id=11");
	System.out.println("number of rowsn updated" +res);
	//5th step
	statement.close();
	con.close();
	
}
}