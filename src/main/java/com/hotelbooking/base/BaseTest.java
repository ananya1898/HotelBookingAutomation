package com.hotelbooking.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected WebDriver driver;

	@BeforeEach
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@AfterEach
	public void teardown() {
		driver.quit();
	}

}