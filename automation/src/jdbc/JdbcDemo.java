package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JdbcDemo {

	
	static WebDriver driver=null;
	public static void main(String[] args) throws SQLException, InterruptedException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","raaz.112");
		
		 System.out.println(con.isClosed());
		 
		 Statement rs = con.createStatement();
		 
		 String display="select * from student";
		ResultSet mahakal = rs.executeQuery(display);
		 
		     while(mahakal.next()) {
		    	 
		    System.out.println(	 mahakal.getInt(1));
			 
		    	  	String username = mahakal.getString(2);
		    	 
		    	
		    driver=new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.get("//opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    Thread.sleep(3000);
		    driver.findElement(By.name("username")).sendKeys(username);
		    
		    
		    	 
		     }
		     
		     con.close();
		     mahakal.close();
	}

}
