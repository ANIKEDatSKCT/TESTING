package com.testNG.Report;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Day7task5 {
	
	WebDriver dr;
  @Test(groups= {"SmokeTest"})
  public void TeastCase_01() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  dr = new ChromeDriver();
	  
	  dr.get("https://www.godaddy.com/en-in");
	  dr.manage().window().maximize();
	  Thread.sleep(3000);
	  String title=dr.getTitle();
	  String ctitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  Assert.assertEquals(title, ctitle);
	  Thread.sleep(3000);
	  String url = "https://www.godaddy.com/en-in";
	  String curl = dr.getCurrentUrl();
	  Assert.assertEquals(url, curl);	  
  }
  
  @Test(groups= {"Regression TestCase"})
  
  public void TestCase_02() throws InterruptedException
  {
	  
	  
	  dr.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
	  try
	  {
		  dr.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]")).click();
		  Thread.sleep(3000);
		  dr.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
		  Thread.sleep(3000);
		  dr.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a")).click();
	  }
	  catch(NoSuchElementException e)
	  {
		  System.out.println("page Time out");
	  }
	 
	 
}
  
}
  

