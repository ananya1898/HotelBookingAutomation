package com.hotelbooking.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	By nameField = By.id("name");
	By emailField = By.id("email");
	By confimationAlert = By.xpath("//button[text()='Confirmation Alert']");
	By PromptAlert = By.xpath("//button[text()='Prompt Alert']");
	By popupLink = By.linkText("//button[text()='Popup Windows]");
	By tableSection = By.id("HTML1");

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public void enterDetails(String name, String email) {
		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).sendKeys(email);
	}

	public void clickConfirmationAlertButton() {
		driver.findElement(confimationAlert).click();
	}

	public void clickPromptAlertButton() {
		driver.findElement(PromptAlert).click();
	}

	public void clickPopupLink() {
		driver.findElement(popupLink).click();

	}

	public By getStaticTable() {
		return (tableSection);
	}

}
