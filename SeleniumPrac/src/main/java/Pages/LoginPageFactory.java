package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;
	//creating parameterized constructor to initialize WebDriver reference
	public LoginPageFactory(WebDriver driver)
	{
		this.driver = driver;
		//this initElement method will create all WebElements
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	@CacheLookup //to store the element in cache memory
	WebElement username;
	
	//using How class
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement password;
	
	public void login_misapp(String un, String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
	}
}
