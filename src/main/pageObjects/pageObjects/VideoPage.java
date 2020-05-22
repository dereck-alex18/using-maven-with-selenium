package pageObjects;

import org.openqa.selenium.WebDriver;

import foundation.BasePage;

public class VideoPage extends BasePage {
	
	public VideoPage(WebDriver driver) {
		super(driver);
	}

	public VideoPage playVideo() {
		return this;
	}
}
