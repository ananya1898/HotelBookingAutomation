package com.hotelbooking.base;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	protected WebDriver driver;
	protected WebDriverWait wait;

	@BeforeEach
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		wait = new WebDriverWait(driver, Duration.ofMillis(2000));
	}

	@AfterEach
	public void teardown() {
		driver.quit();
	}

}