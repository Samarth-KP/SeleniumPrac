package utilities;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public static String captureScreenshot(WebDriver driver, String screenshotName)
	{
		//Generate timestamp
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		
		//Convert WebDriver object to TakesScreenshot 
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//capture screenshot as file object
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		//Define destination path
		String destination ="./Screenshots/"+screenshotName + "_" + timestamp + ".png";
		
		//Screenshots/Googletest_20240208_07264.png
		
		try {
			//Copy file to destination 
			FileUtils.copyFile(source, new File(destination));
			System.out.println("Screenshot captured and saved to: " +destination);
		}
		catch (IOException e)
		{
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
		return destination;
	}
}
