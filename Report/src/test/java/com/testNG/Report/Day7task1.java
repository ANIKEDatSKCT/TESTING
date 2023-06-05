package com.testNG.Report;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Day7task1 {
	WebDriver wd;

  @Test
  public void facebook() {
	 
	  String title=wd.getTitle();
	  Assert.assertEquals( "Guest Registration Form - User Registration",title);
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  wd=new ChromeDriver();
	  wd.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
