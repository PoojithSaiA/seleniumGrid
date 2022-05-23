package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Google2 {

	@Test
	public void check() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.43.234:4444"),cap);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("sai");
	}
}
