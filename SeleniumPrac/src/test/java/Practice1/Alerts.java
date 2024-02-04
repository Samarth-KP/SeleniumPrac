package Practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Alert With Ok
		WebElement el1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].scrollIntoView();", el1);
		Thread.sleep(2000);
		el1.click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text: "+alert.getText());
		Thread.sleep(3000);
		alert.accept();
		
		//Alert With Ok and Cancel
		WebElement el2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		el2.click();
		Thread.sleep(2000);
		driver.quit();
		WebElement el3 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		el3.click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println("Alert text: "+alert1.getText());
		Thread.sleep(3000);
		alert1.accept();
		
		
	}
}