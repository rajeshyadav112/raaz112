package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class wholepageScreenShot {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enther the value of a:");
		
		int a=sc.nextInt();
		
		System.out.println("pleaee enter the value of b:");
		
		int b=sc.nextInt();
		
		int c=a+b;
		
		System.out.println("The sum of a and b is "+c);
		  
		  
		  
		  
	}

}
 