package com.automatedtester.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.base.Base;
import com.project.base.GlobalVariables;
import com.project.poclasses.Chapter1Page;
import com.project.poclasses.HomePage;

public class TC003_Chapter1_ValidateButtonLoadPage_POM {
	WebDriver driver;
	Base base;
	HomePage home;
	Chapter1Page chapter1;
	
	@BeforeTest
	public void beforeTest() {
		base = new Base(driver);
		driver = base.chromedriverConnection();
		home = new HomePage(driver);
		chapter1 = new Chapter1Page(driver);
	}

	@Test
	public void TC003() {
		
		//STEP1
		base.launchBrowser(GlobalVariables.SELENIUM_MAIN_URL);
		
		//STEP2
		home.clickChapter1();
		
		//STEP3
		chapter1.clickLoadTextButton();
		
		//STEP4
		chapter1.verifyTextInsertedBox();
	}

	@AfterTest
	public void afterTest() {
		chapter1.closeBrowser();
	}

}
