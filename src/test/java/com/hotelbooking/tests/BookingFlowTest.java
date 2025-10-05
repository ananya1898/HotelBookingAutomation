package com.hotelbooking.tests;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.hotelbooking.base.BaseTest;

public class BookingFlowTest extends BaseTest {

	@Test
	public void testHotelBookingFlow() throws InterruptedException {

		// 1. Fill name and email fields
		driver.findElement(By.id("name")).sendKeys("Testing Name");
		driver.findElement(By.id("email")).sendKeys("test@test.com");

		// 2. Click a button that triggers alert
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();

		// 3.Handling the alert
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert says: " + alert.getText());
		alert.accept();

		//4. Handling multiple windows
		String mainWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//button[text()='Popup Windows']")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String w: windows) {
			if(!w.equals(mainWindow)){
				driver.switchTo().window(w);
				//Using class & text
				driver.findElement(By.xpath("//span[@class='DocSearch-Button-Placeholder' and text()='Search']"));				
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWindow);

	}

}