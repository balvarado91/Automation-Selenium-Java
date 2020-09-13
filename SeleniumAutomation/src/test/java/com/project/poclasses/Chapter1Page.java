package com.project.poclasses;

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
}
