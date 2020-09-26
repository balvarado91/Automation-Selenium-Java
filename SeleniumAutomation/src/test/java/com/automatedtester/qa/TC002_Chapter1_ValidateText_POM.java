package com.automatedtester.qa;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.base.Base;
import com.project.base.GlobalVariables;
import com.project.poclasses.Chapter1Page;
import com.project.poclasses.HomePage;

public class TC002_Chapter1_ValidateText_POM {

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
	public void TC002() throws IOException {
		
		//STEP1
		base.launchBrowser(GlobalVariables.SELENIUM_MAIN_URL);
		
		//STEP2
		home.clickChapter1();
		
		//STEP3
		chapter1.selectTypeSelenium("Selenium IDE");
		
		//STEP4
		chapter1.assertText();
		
		//STEP5
		chapter1.navigateHomePage();
	}

	@AfterTest
	public void afterTest() {
		chapter1.closeBrowser();
	}

}
