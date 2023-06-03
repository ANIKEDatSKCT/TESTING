package com.day6.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6task5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		Thread.sleep(4000);
		wd.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		wd.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(4000);
		wd.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		wd.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		Thread.sleep(4000);
		String title=wd.getCurrentUrl();
		System.out.println("The User is navigated back to the "+title);

	}
}
