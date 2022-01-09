package com.enspire.loans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProcessEMIs {
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
	        cd.findElement(By.id("username")).sendKeys("ADMIN0001");
			cd.findElement(By.id("userpwd")).sendKeys("123456");
			cd.findElement(By.xpath("//*[@ng-form='loginform']//button")).click();
			Thread.sleep(30000);
	 }
			@Test
			  public void ProcessEMIstest () throws InterruptedException{
				WebElement Loans =cd.findElement(By.xpath("//*[@id='homemanuid-268']/a/span"));
				Loans.click();
				WebElement ASSLoans =cd.findElement(By.xpath("//*[@id='submenu_268']/li[1]/ul/li[4]/a"));
				ASSLoans.click();
				Thread.sleep(20000);
				Select drpLoanstatus = new Select(cd.findElement(By.name("LoanStatus")));
				drpLoanstatus.selectByIndex(3);
				cd.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div/div/div[13]/button[1]")).click();
				Thread.sleep(5000);
				cd.findElement(By.xpath("//*[@id=\'home\']/div[2]/div/div[2]/button[2]")).click();
				Alert alt = cd.switchTo().alert();
				alt.accept();
				Thread.sleep(5000);
				cd.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
				Select drpLoanstatus1 = new Select(cd.findElement(By.name("LoanStatus")));
				drpLoanstatus1.selectByIndex(4);
				cd.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div/div/div[13]/button[1]")).click();
				Thread.sleep(5000);
				cd.findElement(By.xpath("//*[@id=\"home\"]/div[3]/div[4]/div[10]/a/i")).click();
				cd.findElement(By.xpath("//*[@id=\"myTab\"]/li[4]/a")).click();
				cd.findElement(By.name("RepaymentAmountNm")).sendKeys("10000");
				cd.findElement(By.xpath("//*[@id=\"makePayment\"]/div[3]/div[5]/div[1]/div[2]/div/div/span/button")).click();
				Select drppaymenttype = new Select (cd.findElement(By.name("PaymentTypeNm")));
				drppaymenttype.selectByIndex(1);
				cd.findElement(By.name("referenceIDNm")).sendKeys("001");
				cd.findElement(By.name("remarksNm")).sendKeys("Partial payment");
				cd.findElement(By.xpath("//*[@id='makePayment']/div[3]/div[5]/div[1]/div[14]/button")).click();
				cd.findElement(By.xpath("//*[@id=\"makePayment\"]/div[5]/button")).click();
				Thread.sleep(10000);
				cd.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
				cd.findElement(By.xpath("//*[@id='makePayment']/div[3]/div[2]/label/span")).click();
				Select drppaymenttype1 = new Select (cd.findElement(By.name("PaymentTypeNm")));
				drppaymenttype1.selectByIndex(1);
				cd.findElement(By.name("referenceIDNm")).sendKeys("001");
				cd.findElement(By.name("remarksNm")).sendKeys("preclosureloan");
				cd.findElement(By.xpath("//*[@id='makePayment']/div[5]/button")).click();
				Thread.sleep(10000);
				cd.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
			}
			@AfterMethod
			  public void teardown() {
					cd.close();
					cd.quit();
				  }
			}

