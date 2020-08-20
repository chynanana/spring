package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumTest {

	private WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "X:\\QA\\HTML work\\Drivers\\Chrome\\chromedriver.exe");

//	        ChromeOptions opts = new ChromeOptions();
//	        opts.setHeadless(true);

		driver = new ChromeDriver();
//	        driver.manage().window().setSize(new Dimension(1920, 1080));
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://google.com");

//		assertEquals("Google", driver.getTitle());
	}

	@After
	public void tearDown() {
		driver.close();
	}
}
