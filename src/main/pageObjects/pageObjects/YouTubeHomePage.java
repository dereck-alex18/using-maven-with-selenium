package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import foundation.BasePage;

public class YouTubeHomePage extends BasePage {

	public YouTubeHomePage(WebDriver driver) {
		super(driver);
	}

	public YouTubeHomePage enterVideoName(String videoName) {
		driver.findElement(By.cssSelector("div#search-input input")).sendKeys(videoName);
		return this;
	}

	public VideoListPages searchVideo() {
		driver.findElement(By.id("search-icon-legacy")).click();
		return new VideoListPages(driver);

	}

}
