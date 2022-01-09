package com.enspire.loans;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
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
  public void Loansmenutest () throws InterruptedException {
	  WebElement Loans =cd.findElement(By.xpath("//*[@id='homemanuid-268']/a/span"));
		Loans.click();
		WebElement ESSLoans =cd.findElement(By.xpath("//*[@id='submenu_268']/li[1]/ul/li[1]/a"));
		ESSLoans.click();
		WebElement ApplyLoan =cd.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[1]/div[3]/div/span"));
		ApplyLoan.click();
		Thread.sleep(5000);
		cd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div[1]/div/span[1]/span[1]/span/span[2]/b")).click();
		Thread.sleep(5000);
		WebElement from = cd.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		from.sendKeys("Marriage Loan");
        Thread.sleep(3000);
        from.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
        
		cd.findElement(By.id("requiredAmntNm")).sendKeys("300000");
		cd.findElement(By.id("purposeNm")).sendKeys("Test");
		WebElement submit = cd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[3]/button[1]/span"));
		submit.click();
		Thread.sleep(3000);
		cd.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
  }
 

  @AfterMethod
  public void teardown() {
		cd.close();
		cd.quit();
	  }

 
}
