package com.telusko;
import java.sql.*; //importing sql package

public class JDBCDemo {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="akhilesh";
		String query="select name from userdetail where id=1";

		Class.forName("com.mysql.cj.jdbc.Driver"); //registering driver
		Connection con = DriverManager.getConnection(url, user, password); //establishing connection
		
		Statement st = con.createStatement(); //creating statement
		ResultSet rs = st.executeQuery(query); //executing query
		
		rs.next(); //to get counter to first element
		String name = rs.getString("name"); //process results
		
		System.out.println(name);
		
		st.close(); 
		con.close();
	}

}
