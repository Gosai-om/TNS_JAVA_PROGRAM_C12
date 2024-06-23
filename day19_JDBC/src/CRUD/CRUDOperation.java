package CRUD;

import java.sql.*;
import java.util.Scanner;

import javax.sql.*;


public class CRUDOperation {
	static Statement st;
	Connection cn;
	
	public CRUDOperation()
	{
		cn = DatabaseConnection1.getConnection();
		try 
		{
			st = cn.createStatement(); // create null statement
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void insertData(Integer stud_id, String sname, String stream)
	{
		String iquery = "insert into stud values(" + stud_id + ",'" + sname + "','"+ stream+ "')";
		try 
		{
			int result = st.executeUpdate(iquery); // executing Query
			if(result > 1)
			{
				System.out.println("Inserted sucessfully....");
			}
		}
		catch(SQLIntegrityConstraintViolationException sq)
		{	
			System.out.println("Please enter unique number for student id");
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inserted sucessfully");
	}
	
	public static void deleteData(int stud_id)
	{
		String dquery = "delete from stud where s_id="+stud_id+"";
		int r;
		try 
		{
			r = st.executeUpdate(dquery);
			if(r>0)
			{
				System.out.println("Deleted Sucessfully....");
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updateData(String sname,String stream,int stud_id)
	{	
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		String uquery = "update stud set s_name= '"+sname+"',s_stream='"+stream+"' where s_id= "+stud_id+"";
		try {
			int r = st.executeUpdate(uquery);
			if(r>0){
				System.out.println("Updated Sucessfully....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getData()
	{
		String squery = "select * from stud";
		try 
		{
			ResultSet r = st.executeQuery(squery); // executeQuery is used only for select statement to print the output over here
			System.out.println(r); 
			while(r.next())
			{
				System.out.println(r.getInt(1)+ " " +r.getString(2)+" " + r.getString(3));
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

