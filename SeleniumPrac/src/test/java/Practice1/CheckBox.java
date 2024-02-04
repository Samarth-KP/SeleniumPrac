package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']")).click();
		driver.findElement(By.xpath("//input[@id='tree-node-desktop']")).click();
		
	}
}
