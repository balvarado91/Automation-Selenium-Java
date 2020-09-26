package com.project.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * 
 * Class for all actions methods for interactions
 * 
 * @author Brj
 *
 */
public class Base {

	/**
	 * Constructor WebDriver
	 */
	private WebDriver driver;

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver chromedriverConnection() {
		System.setProperty(GlobalVariables.CHROME_WEBDRIVER_NAME, GlobalVariables.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		return driver;
	}

	/**
	 * Launch Browser
	 * 
	 * @author brayan.alvarado
	 * @param url
	 */

	public void launchBrowser(String url) {
		reporterLog("Launch Browser " + url);
		driver.get(url);
		driver.manage().window().maximize();
		implicitlyWait(5);
	}

	/**
	 * Reporter log
	 * 
	 * @author brayan.alvarado
	 */

	public void reporterLog(String log) {
		Reporter.log(log);
	}

	/**
	 * Implicitly Wait
	 * 
	 * @author brayan.alvarado
	 */

	public void implicitlyWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	/**
	 * click Object
	 * 
	 * @author brayan.alvarado
	 * @param locator
	 */

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	/**
	 * Wait for Element Present
	 * 
	 * @author brayan.alvarado
	 * @param locator
	 */

	public void waitForElementPresent(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, GlobalVariables.GENERAL_TIMEOUT);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			// TODO: handle exception
			reporterLog("Time error");
		}
	}

	/**
	 * Select Value from dropdown by Value
	 * 
	 * @author brayan.alvarado
	 * @param locator, value
	 */

	public void selectByValueDropdown(By locator, String value) {
		waitForElementPresent(locator);
		WebElement element = driver.findElement(locator);
		Select dropdown = new Select(element);
		dropdown.selectByValue("Selenium Code");

	}

	/**
	 * Close Browser
	 * 
	 * @author brayan.alvarado
	 * 
	 */

	public void closeBrowser() {
		try {
			reporterLog("Close Browser");
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			reporterLog("Closing Browser is failed");
		}
	}

	/**
	 * Get Data from JSON file (Directly)
	 * 
	 * @author Brayan Alvarado
	 * @param jsonFile, jsonKey
	 * @return jsonValue
	 * @throws FileNotFoundException
	 */
	public String getJSONValue(String jsonFileObj, String jsonKey) throws FileNotFoundException {
		try {
			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
			// Get Data
			String jsonValue = (String) jsonObject.getJSONObject(jsonFileObj).get(jsonKey);
			return jsonValue;
		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}
}
