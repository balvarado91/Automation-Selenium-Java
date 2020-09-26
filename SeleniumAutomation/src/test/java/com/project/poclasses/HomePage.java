package com.project.poclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.base.Base;

public class HomePage extends Base{
	
	/**
	 * 
	 * Constructor Base Class
	 * @param locator
	 */
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	// Objects
	By link_chapter1 = By.xpath("//a[contains(text(), 'Chapter1')]");

	
	/**
	 * Click Chapter 1
	 * @author brayan.alvarado
	 */
	
	public void clickChapter1() {
		reporterLog("Click Chapter 1");
		waitForElementPresent(link_chapter1);
		click(link_chapter1);
	}
	
}
