package com.hotelbooking.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hotelbooking.base.BaseTest;
import com.hotelbooking.pages.AlertPage;
import com.hotelbooking.pages.HomePage;

public class AlertsTest extends BaseTest{

	private HomePage home;
	private AlertPage alert;

	@BeforeEach
	public void initPages() {
		home = new HomePage(driver);
		alert = new AlertPage(driver);
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
}
