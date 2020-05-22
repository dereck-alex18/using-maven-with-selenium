package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;

import foundation.InitProcess;
import pageObjects.YouTubeHomePage;

public class SearchHipHopClip {
	private static WebDriver driver;

	@Before
	public void setUp() {
		driver = InitProcess.createBrowser();
	}

	@Test
	public void searchForItWasAGoodDay() {
		new YouTubeHomePage(driver).enterVideoName("It was a good day").searchVideo();
	}

	@Test
	public void playVideo() {
		new YouTubeHomePage(driver).enterVideoName("It was a good day").searchVideo().clickOnVideo();

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
