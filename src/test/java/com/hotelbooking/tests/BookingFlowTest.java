package com.hotelbooking.tests;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.hotelbooking.base.BaseTest;
import com.hotelbooking.pages.AlertPage;
import com.hotelbooking.pages.HomePage;

public class BookingFlowTest extends BaseTest {

	HomePage home = new HomePage(driver);
	AlertPage alert = new AlertPage(driver);

	@Test
	public void testFillingDetails() throws InterruptedException {

		home.enterDetails("Test", "test@test.com");
		
	}

	@Test
	public void testConfirmationAlertButton() throws InterruptedException {
		
		home.clickConfirmationAlertButton();
		alert.acceptAlert();
		home.clickConfirmationAlertButton();
		alert.dismissAlert();
		
	}
	
	@Test
	public void testPromptAlertButton() throws InterruptedException {
		
		home.clickPromptAlertButton();
		alert.enterPromptDetails("test");

		
	}

	// 4. Handling multiple windows
//	String mainWindow = driver.getWindowHandle();
//
//	driver.findElement(By.xpath("//button[text()='Popup Windows']")).click();
//
//	Set<String> windows = driver.getWindowHandles();for(
//	String w:windows)
//	{
//		if (!w.equals(mainWindow)) {
//			driver.switchTo().window(w);
//			// Using class & text
//			driver.findElement(By.xpath("//span[@class='DocSearch-Button-Placeholder' and text()='Search']"));
//			driver.close();
//		}
//	}
//
//	driver.switchTo().window(mainWindow);

}

