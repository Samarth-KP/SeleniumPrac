package Practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.network.model.RequestWillBeSent;
import org.openqa.selenium.devtools.v120.network.Network;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CDPTest {
	
	ChromiumDriver driver;
	DevTools devTools;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		devTools = driver.getDevTools();
		devTools.createSession();
	}
	
//	@Test
	public void deviceModeTest() {
		Map deviceMetrics = new HashMap() {
			{
				put("width",800);
				put("height",1000);
				put("devuceScaleFactor",50);
				put("mobile",true);
			}
			
		};
		driver.executeCdpCommand("Emulate.setDeviceMetricsOverride", deviceMetrics);
		driver.get("https://www.selenium.dev/");
	}
	
//	@Test
	public void geoLocationTest()
	{
		Map deviceMetrics = new HashMap() {
			{
			put("latitude", 27.664827);
			put("longitude", 81.515755);
			put("accuracy", 100);
		}
	};
	}
	public void captureNWTrafficTest() {
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		devTools.addListener(Network.requestWillBeSent(), new Consumer<RequestWiilBeSent>()
				{
					public void accept(RequestWillBeSent entry) {
						
					}
				}
	}
}
