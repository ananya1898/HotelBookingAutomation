package com.hotelbooking.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertPage {
	
	WebDriver driver;
	
	public AlertPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public String acceptAlert() {
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		return text;
		
	}
	
	public String dismissAlert() {
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.dismiss();
		return text;
		
	}
	
	public String enterPromptDetails(String input) {

		Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
		alert.accept();
		String text = alert.getText();
		return text;
	
	}
	
	
}
