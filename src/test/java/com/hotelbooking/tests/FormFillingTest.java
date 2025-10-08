package com.hotelbooking.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hotelbooking.base.BaseTest;
import com.hotelbooking.pages.AlertPage;
import com.hotelbooking.pages.HomePage;

public class FormFillingTest extends BaseTest {

	private HomePage home;

	@BeforeEach
	public void initPages() {
		home = new HomePage(driver);

	}

	@Test
	public void testFillingDetails() throws InterruptedException {
		home.enterDetails("Test", "test@test.com");
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
