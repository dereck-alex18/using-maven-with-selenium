package foundation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitProcess {
	
	public static WebDriver createBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/dereck/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		
		return driver;
	}

}
