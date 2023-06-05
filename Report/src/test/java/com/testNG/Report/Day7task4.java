package com.testNG.Report;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7task4 {
	
	
	WebDriver dr;
  @Test(dependsOnMethods= {"beforeTest"})
  public void Task() throws InterruptedException {
	

	  Thread.sleep(4000);
	  dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  Thread.sleep(3000);
	  dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	  dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  
  }
  @Test
  public void beforeTest() throws InterruptedException 
  
  { 
	  WebDriverManager.chromedriver().setup();
	  dr = new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(5000);
  }
  

  @Test
  public void afterTest() throws InterruptedException {
	  Thread.sleep(10000);
	  dr.quit();
}
}
