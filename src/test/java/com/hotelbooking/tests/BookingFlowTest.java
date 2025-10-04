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

		Alert alert = driver.switchTo().alert();
		System.out.println("Alert says: " + alert.getText());
		alert.accept();

		String mainWindow = driver.getWindowHandle();

		driver.findElement(By.linkText("Popup Windows")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String w: windows) {
			if(!w.equals(mainWindow)){
				driver.switchTo().window(w);
				driver.findElement(By.xpath("//*[@id=\"docsearch-1\"]/button/span[1]/span")).sendKeys("hello from new window");
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWindow);

	}

}