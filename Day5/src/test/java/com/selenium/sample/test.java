package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.get("https://demo.opencart.com/");
		wd.manage().window().maximize();
		Thread.sleep(4000);
		wd.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a")).click();
		
		
		
		
	}

}
