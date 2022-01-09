package com.enspire.loans;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ESSRequestfordisbursement {
	WebDriver cd = null;
	 @BeforeMethod
	  public void setUP() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\practice.Aut\\DriverFiles\\chromedriver.exe");
	        cd = new ChromeDriver();
	        String url = "http://dev.enspirehr.com/AssetAngular/#/login";
	        cd.get(url);
	        Thread.sleep(10000);
	        cd.manage().window().maximize();
	        cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        Thread.sleep(20000);
	        cd.findElement(By.id("username")).sendKeys("33");
			cd.findElement(By.id("userpwd")).sendKeys("123456");
			cd.findElement(By.xpath("//*[@ng-form='loginform']//button")).click();
			Thread.sleep(30000);
			
	  }
  @Test
  public void Requestfordisbursement () throws InterruptedException {
	  WebElement Loans =cd.findElement(By.xpath("//*[@id='homemanuid-268']/a/span"));
		Loans.click();
		WebElement ESSLoans =cd.findElement(By.xpath("//*[@id='submenu_268']/li[1]/ul/li[1]/a"));
		ESSLoans.click();
		Thread.sleep(5000);
		Select drpFilterByStatus = new Select (cd.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[1]/div[2]/select")));
		drpFilterByStatus.selectByIndex(3);
		Thread.sleep(5000);
		cd.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[3]/div[7]/div/button/i")).click();
		cd.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[3]/div[7]/div/ul/li[3]/a")).click();
		Alert alt = cd.switchTo().alert();
		alt.accept();
		Thread.sleep(5000);
		cd.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
  }
 

  @AfterMethod
  public void teardown() {
		cd.close();
		cd.quit();
	  }

 
}
