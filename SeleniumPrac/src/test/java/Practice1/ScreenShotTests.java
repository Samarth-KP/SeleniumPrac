package Practice1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotTests {

	@Test
	public void screenshotTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Sam");
		File file = searchbox.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("searchbox1.png"));
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
