package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage/");
		driver.findElement(By.xpath("//input[@value='m']")).click();
		driver.findElement(By.id("fname")).clear();
		//driver.findElement(By.cssSelector("#fname")).sendKeys("Sam"));
		driver.findElement(By.id("fname")).sendKeys("Sam");
		driver.findElement(By.id("lname")).clear();
		driver.findElement(By.id("lname")).sendKeys("KP");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

}