package com.project.poclasses;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.base.Base;

public class Chapter1Page extends Base {

	public Chapter1Page(WebDriver driver) {
		super(driver);
	}
	
	By radio_unique = By.xpath("//input[@id='radiobutton']");
	By sdd_selenium = By.xpath("//select[@id='selecttype']");
	By link_homePage = By.xpath("//a[contains(text(), \"Home\")]");
	By click_loadTextButton = By.xpath("//input[@id='secondajaxbutton']");
	By verify_textBox = By.xpath("//*[@class='belowcenter']");
	
	public void clickRadio() {
		reporterLog("Click Radio");
		waitForElementPresent(radio_unique);
		click(radio_unique);
	}
	
	/**
	 * Select dropdown by value in chapter1
	 * @author brayan.alvarado
	 */
	
	public void selectTypeSelenium(String seleniumValue) {
		reporterLog("Select " +seleniumValue+"from dropdown");
		waitForElementPresent(sdd_selenium);
		selectByValueDropdown(sdd_selenium, seleniumValue);
		implicitlyWait(2);
	}
	
	public void navigateHomePage() {
		reporterLog("Navigate Home Page");
		
	}
	
	public void clickLoadTextButton() {
		reporterLog("Click Load Text Button");
		waitForElementPresent(click_loadTextButton);
		click(click_loadTextButton);
	}
	
	public void verifyTextInsertedBox() {
	    
	    waitForElementPresent(verify_textBox);
	    //verify_textBox.equals(reporterLog("I have been added with a timeout");
		
	}
	
	public void assertText() {
		reporterLog("Assert that this text is on the page");
	}
}
