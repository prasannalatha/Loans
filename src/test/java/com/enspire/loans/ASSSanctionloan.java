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

public class ASSSanctionloan {
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
	  public void ASSSanctionloanTest () throws InterruptedException {
		 WebElement Loans =cd.findElement(By.xpath("//*[@id='homemanuid-268']/a/span"));
			Loans.click();
			WebElement ASSLoans =cd.findElement(By.xpath("//*[@id='submenu_268']/li[1]/ul/li[4]/a"));
			ASSLoans.click();
			WebElement viewicon=cd.findElement(By.xpath("//*[@id='home']/div[3]/div[4]/div[10]/a/i"));
			viewicon.click();
			//cd.findElement(By.name("Loan_Amount")).sendKeys("100000");
			Select drpTenure = new Select(cd.findElement(By.name("Loan_Tenure")));
			drpTenure.selectByVisibleText("1 Year");
			Select drpinteresttype= new Select(cd.findElement(By.name("Loan_Interest_Type")));
			drpinteresttype.selectByIndex(2);
			cd.findElement(By.name("Loan_Interest_Rate")).sendKeys("5");
			cd.findElement(By.name("Loan_Processing_Fee_amount")).sendKeys("2");
			cd.findElement(By.name("Loan_Lock_Period")).sendKeys("0");
			cd.findElement(By.name("Loan_Minimum_Partial_Payment")).sendKeys("5000");
			cd.findElement(By.name("Loan_Partial_Payment_Charge_Amount")).sendKeys("2");
			cd.findElement(By.name("Loan_PreCloser_Change_Amount")).sendKeys("2");
			cd.findElement(By.xpath("//*[@id=\"collapseTwos\"]/div/div[1]/div[20]/button")).click();
			cd.findElement(By.name("Reject_Comments")).sendKeys("Sanction loan");
			cd.findElement(By.xpath("//*[@id='collapseTwos']/div/div[6]/button[2]")).click();
			Thread.sleep(5000);
			cd.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	  }
	 

	  @AfterMethod
	  public void teardown() {
			cd.close();
			cd.quit();
		  }
}