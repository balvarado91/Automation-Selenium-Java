package com.automatedtester.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC003_Chapter1_ValidateButtonLoadPage {
  @BeforeTest
  public void beforeTest() {
  }
  @Test
  public void TC003() {
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
      
      //STEP 3
      Reporter.log("Click on load text to page button");
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='secondajaxbutton']")));
      driver.findElement(By.xpath("//input[@id='secondajaxbutton']")).click();
      
      //STEP 4
      driver.findElement(By.xpath("//*[@class='belowcenter']"));
      String actualString = driver.findElement(By.xpath("//*[@class='belowcenter']")).getText();
      assertTrue(actualString.contains("I have been added with a timeout"));
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
