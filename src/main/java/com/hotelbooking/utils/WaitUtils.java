package com.hotelbooking.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	public static WebElement waitForVisible(WebDriver driver, By locator, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(seconds));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
