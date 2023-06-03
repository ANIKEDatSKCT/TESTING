package com.day6.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\'input-firstname\']")).sendKeys("Student");
		wd.findElement(By.xpath("//*[@id=\'input-lastname\']")).sendKeys("name");
		wd.findElement(By.xpath("//*[@id=\'input-email\']")).sendKeys("Student@gmail.com");
		wd.findElement(By.xpath("//*[@id=\'input-password\']")).sendKeys("Student12345");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		wd.findElement(By.name("newsletter")).click();
		wd.findElement(By.name("agree")).click();
		wd.findElement(By.xpath("//*[@id=\'form-register\']/div/div/button")).click();

		
		
;		

	}

}
