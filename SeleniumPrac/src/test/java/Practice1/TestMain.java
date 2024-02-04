package Practice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestMain {
	WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		driver = new ChromeDriver();
	}
	@Test
	public void validateRegistrationPage()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String ExpectedTitle="Register";
		Assert.assertEquals(driver.getTitle(),ExpectedTitle);
		//AssertJUnit.assertEquals(driver.getTitle(), ExpectedTitle);
	}
	@AfterClass
	public void closebrowser()
	{
		
	}
}
