package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;
	By SeachBox = By.name("q");
	
	public GoogleSearchPage(WebDriver driver1)
	{
		System.out.println(driver);
		this.driver=driver1;
		System.out.println(driver);
	}
	
	
}
