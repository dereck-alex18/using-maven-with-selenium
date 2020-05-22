package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import foundation.BasePage;

public class VideoListPages extends BasePage {

	public VideoListPages(WebDriver driver) {
		super(driver);
	}

	public VideoPage clickOnVideo() {
		driver.findElement(By.cssSelector("a[title*='It was a good day']")).click();
		return new VideoPage(driver);
	}

}
