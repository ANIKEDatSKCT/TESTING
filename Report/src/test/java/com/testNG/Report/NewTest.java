package com.testNG.Report;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver dr;
  @Test
  public void facebook() {
	  dr.findElement(By.name("email")).sendKeys("Student@gmail.com");
	  dr.findElement(By.name("pass")).sendKeys("Student123");
	  dr.findElement(By.name("login")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  dr=new ChromeDriver();
	  dr.get("https://www.facebook.com");
	  dr.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  dr.quit();
	  
	  
  }

}
