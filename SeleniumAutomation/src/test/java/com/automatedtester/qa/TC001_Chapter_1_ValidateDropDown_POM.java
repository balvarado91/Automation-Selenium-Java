package com.automatedtester.qa;

import org.testng.annotations.Test;

import com.project.base.Base;
import com.project.base.GlobalVariables;
import com.project.poclasses.Chapter1Page;
import com.project.poclasses.HomePage;

import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC001_Chapter_1_ValidateDropDown_POM {

	WebDriver driver;
	Base base;
	HomePage home;
	Chapter1Page chapter1;
	String valueSeleniumType;
	
	
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		base = new Base(driver);
		driver = base.chromedriverConnection();
		home = new HomePage(driver);
		chapter1 = new Chapter1Page(driver);
		
		//Get Data from JSON file
		this.valueSeleniumType = base.getJSONValue(this.getClass().getSimpleName(), "seleniumType");
	}

	@Test
	public void TC001() throws IOException {
		
		//STEP 1
		base.launchBrowser(GlobalVariables.SELENIUM_MAIN_URL);
		
		//STEP2
		home.clickChapter1();
		
		//STEP3
		chapter1.clickRadio();
		
		//STEP4
		chapter1.selectTypeSelenium("Selenium Code");
		
		//STEP5
		chapter1.navigateHomePage();
	}

	@AfterTest
	public void afterTest() {
		chapter1.closeBrowser();
	}

}
