package excelutils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenExcel {
	
	

	    public static void main(String[] args) throws IOException {
	        //WebDriver driver = new ChromeDriver();
	       // driver.get("https://example.com/login");

	        Excelutil excel = new Excelutil("C:\\Users\\hp\\eclipse-workspace\\11weekdaysbatch\\src\\test\\resources\\excelsheet\\dataexcel.xlsx");
	        int rowCount = excel.getRowCount("Sheet1");

	        for (int i = 1; i <= rowCount; i++) {
	            String username = excel.getCellData("Sheet1", i, 0);
	            String password = excel.getCellData("Sheet1", i, 1);

	           // driver.findElement(By.id("username")).sendKeys(username);
	           // driver.findElement(By.id("password")).sendKeys(password);
	          //  driver.findElement(By.id("login")).click();

	              System.out.print(username);
	              System.out.print(password);
	              
	            // Perform additional checks or assertions here

	            // Reset for the next iteration
	           // driver.navigate().refresh();
	        }

	        excel.closeWorkbook();
	       // driver.quit();
	    }
	}



