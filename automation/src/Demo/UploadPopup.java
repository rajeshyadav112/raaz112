package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup {

	public static void main(String[] args) throws IOException {
		WebDriver  driver =new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=Cj0KCQjwm66pBhDQARIsALIR2zCb1FELUNED_OrB0ckbA3DWcm8ee8Toq4wGuYzJiaZXYnDAKXMWO2waAmmoEALw_wcB&gclsrc=aw.ds");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Runtime.getRuntime().exec("./autoIt/ag.exe");
		
		

	}

}
