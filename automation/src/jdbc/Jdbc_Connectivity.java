package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Connectivity {

	public static void main(String[] args) throws SQLException {
	    
	    
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","raaz.112");
		if(conn.isClosed())
			{
			System.out.println("connection closed");
			}
		else {
			System.out.println("connected");
		}
		Statement state = conn.createStatement();
		//String s="create table stu(id int(10),name varchar(20),age int(10))";
		//state.executeUpdate(s);
		//String s="insert into stu values(102,'RAAZ',30)";
		//state.executeUpdate(s);
		String s="SELECT* from stu";
		ResultSet rs = state.executeQuery(s);
		while(rs.next()) {
			System.out.println(	rs.getInt("id"));
			System.out.println(	rs.getString("name"));
			System.out.println(	rs.getInt("age"));
		}
		rs.close();
		conn.close();
		System.out.println("executed");
		      
	}

}
