package com.automatedtester.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC002_Chapter1_ValidateText {
  @BeforeTest
  public void beforeTest() {
  }
  
  @Test
  public void TC002() {
	  //STEP 1 for reports
	  Reporter.log("Launch automatedtester app");
	  System.setProperty("webdriver.chrome.driver", "/Users/Brj/GitFolder/Automation-Selenium-Java/SeleniumAutomation/drivers/Chrome/chromedriver");	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://book.theautomatedtester.co.uk/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
      //STEP 2
      Reporter.log("Click Link Chapter 1");
      driver.findElement(By.xpath("//a[contains(text(), 'Chapter1')]")).click();
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='radiobutton']")));
	  
	  //STEP 3
	  Reporter.log("Select \"Selenium Core\" from dropdown");
	  Select dd_selenium = new Select(driver.findElement(By.xpath("//select[@id='selecttype']")));
	  dd_selenium.selectByValue("Selenium IDE");
	  
	  //STEP 4
	  Reporter.log("Validating Selenium IDE title");
	  driver.get("http://book.theautomatedtester.co.uk/chapter1");
	  String ActualTitle = driver.getTitle();
	  String ExpectedTitle = "Selenium: Beginners Guide";
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  System.out.println("Assert Passed!!"); 
	  
	  //STEP 5
	  Reporter.log("Navigate Home page clicking \"Home Page\" link");
	  driver.findElement(By.xpath("//a[contains(text(), \"Home\")]")).click();
	     
	  //STEP 6
	  Reporter.log("Close Browser");
	  driver.close();
  }

  @AfterTest
  public void afterTest() {
  }

}
