package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("window.scrollBy(0,1000)","");
		   
		   driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Samarth");
		   driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("samarthkp44@gmail.com");
		   driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("chennai");
		   driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("bangalore");
		   driver.findElement(By.xpath("//button[@id='submit']")).click();
			   System.out.println("Hello");
			   js.executeScript("window.scrollBy(0,1000)","");
		   
	}
}
