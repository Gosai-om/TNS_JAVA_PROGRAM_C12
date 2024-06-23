package Connection_Demo;

import java.sql.*;
import javax.sql.*;

public class DatabaseConnection1 {

	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "GOSAIOM";
	private static final String DB_URL = "jdbc:mysql://localhost:3305/tns_work";
	static Connection cn;
	public static void getConnection(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			System.out.println(cn);
		}
		catch(ClassNotFoundException e)   {
			   // TODO Auto-generated catch block  
			e.printStackTrace();
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
