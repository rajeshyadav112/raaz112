package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataInputFromDataBase {
    static WebDriver driver=null;
    
    
	public static void main(String[] args) throws SQLException {
		
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","raaz.112");
		
		Statement state = conn.createStatement();
		String s="SELECT* from student";
		ResultSet rs = state.executeQuery(s);
		while(rs.next()) {
				 String data = rs.getString("username");
				String data2 = rs.getString("password");
				
			
		
		
	 
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(data);
		driver.findElement(By.id("pass")).sendKeys(data2);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		}
		rs.close();
		conn.close();

	}

}
	
	


