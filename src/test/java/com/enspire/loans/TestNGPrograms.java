package com.enspire.loans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPrograms {
	WebDriver cd = null;
	@BeforeMethod ()
	public void setUP() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\practice.Aut\\DriverFiles\\chromedriver.exe");
	        cd = new ChromeDriver();
	        String url = "http://dev.enspirehr.com/AssetAngular/#/login";
	        cd.get(url);
	        Thread.sleep(10000);
	        cd.manage().window().maximize();
	        cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        Thread.sleep(20000);
	        cd.findElement(By.id("username")).sendKeys("32");
			cd.findElement(By.id("userpwd")).sendKeys("123456");
			cd.findElement(By.xpath("//*[@ng-form='loginform']//button")).click();
	  }
	@Test 
	public void MSSApproveloantest () throws InterruptedException {
		
		WebElement Loans =cd.findElement(By.xpath("//*[@id='homemanuid-268']/a/span"));
		Loans.click();
		WebElement MSSLoans =cd.findElement(By.xpath("//*[@id='submenu_268']/li[1]/ul/li[2]/a"));
		MSSLoans.click();
		WebElement Checkbox =cd.findElement(By.xpath("//*[@id='home']/div[3]/div[1]/div[1]/div/div[1]/label/span"));
		Checkbox.click();
		WebElement Actions =cd.findElement(By.xpath("//*[@id='home']/div[2]/div/div[2]/div/button"));
		Actions.click();
		//WebElement Approve =cd.findElement(By.xpath("//a[contains(text(),'Approve')]"));
		WebElement Approve =cd.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/ul/li[1]/a/span"));
		Approve.click();
		Thread.sleep(10000);
		WebElement alert =cd.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
		alert.click();
		
	}
	
	@AfterMethod
	  public void teardown() {
		cd.close();
		cd.quit();
	  }
}
