package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=Cj0KCQjwwvilBhCFARIsADvYi7JuDMCSyTRdbkT5RyjQvFBCqyN28NimmjG1pDxzPZ9t29OxeQ9qt20aAob4EALw_wcB");
	
		System.out.println(driver.getTitle());

}
}
