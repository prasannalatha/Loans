package com.enspire.loans;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ASSPendingfordisbursement {
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
	  public void ASSDisbursementTest () throws InterruptedException {
		 WebElement Loans =cd.findElement(By.xpath("//*[@id='homemanuid-268']/a/span"));
			Loans.click();
			WebElement ASSLoans =cd.findElement(By.xpath("//*[@id='submenu_268']/li[1]/ul/li[4]/a"));
			ASSLoans.click();
			Thread.sleep(20000);
			Select drpLoanstatus = new Select(cd.findElement(By.name("LoanStatus")));
			drpLoanstatus.selectByIndex(2);
			cd.findElement(By.xpath("//*[@id='home']/div[1]/div/div/div[13]/button[1]")).click();
			Thread.sleep(10000);
			cd.findElement(By.xpath("//*[@id='home']/div[3]/div[4]/div[10]/a/i")).click();
			Thread.sleep(5000);
			Select drpEMIstartfrom = new Select (cd.findElement(By.name("EMI_Start_From")));
			drpEMIstartfrom.selectByIndex(1);
			Thread.sleep(5000);
			cd.findElement(By.xpath("//*[@id=\"other_details\"]/div[3]/div[1]/div/div[2]/div/span[1]/span[1]/span/span[2]/b")).click();
			Thread.sleep(5000);
			WebElement from = cd.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			from.sendKeys("Loan Recovery");
	        Thread.sleep(3000);
			from.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
			
			cd.findElement(By.xpath("//*[@id=\"other_details\"]/div[3]/div[1]/div/div[3]/div/span[1]/span[1]/span/span[2]/b")).click();
			Thread.sleep(5000);
			WebElement from1 = cd.findElement(By.xpath("/html/body/span/span/span[1]/input")); 
			from1.sendKeys("Loan Disbursal Amount");
	        Thread.sleep(3000);
	        from1.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
			
			cd.findElement(By.xpath("//*[@id=\"other_details\"]/div[3]/div[1]/div/div[5]/div/span[1]/span[1]/span/span[2]/b")).click();
			Thread.sleep(5000);
			WebElement from2 = cd.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			from2.sendKeys("Employee Loan Amount");
	        Thread.sleep(3000);
	        from2.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
			
			cd.findElement(By.xpath("//*[@id=\"other_details\"]/div[3]/div[1]/div/div[6]/div/span[1]/span[1]/span/span[2]/b")).click();
			Thread.sleep(5000);
			WebElement from3 = cd.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			from3.sendKeys("Employee EMI Amount");
	        Thread.sleep(3000);
	        from3.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
			
			cd.findElement(By.xpath("//*[@id=\"other_details\"]/div[3]/div[1]/div/div[7]/div/span[1]/span[1]/span/span[2]/b")).click();
			Thread.sleep(5000);
			WebElement from4 = cd.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			from4.sendKeys("processing fee");
	        Thread.sleep(3000);
	        from4.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
			
			cd.findElement(By.xpath("//*[@id=\"other_details\"]/div[3]/div[1]/div/div[9]/div/span[1]/span[1]/span/span[2]/b")).click();
			Thread.sleep(5000);
			WebElement from5 = cd.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			from5.sendKeys("Interest");
	        Thread.sleep(3000);
	        from5.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
			
			cd.findElement(By.xpath("//*[@id=\"other_details\"]/div[3]/div[1]/div/div[10]/div/span[1]/span[1]/span/span[2]/b")).click();
			Thread.sleep(5000);
			WebElement from6 = cd.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			from6.sendKeys("Taxable amount");
	        Thread.sleep(3000);
	        from6.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
			
			cd.findElement(By.xpath("//*[@id=\"other_details\"]/div[3]/div[1]/div/div[11]/div/span[1]/span[1]/span/span[2]/b")).click();
			Thread.sleep(5000);
			WebElement from7 = cd.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			from7.sendKeys("Tax Exemption Amount");
	        Thread.sleep(3000);
	        from7.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
			
	        Select drpwaiveoffprincipal = new Select(cd.findElement(By.name("WaiveOff_Principle_Wage_Type")));
	        drpwaiveoffprincipal.selectByIndex(1);
	        Thread.sleep(5000);
	      	Select drpwaiveoffinterest = new Select(cd.findElement(By.name("WaiveOff_Interest_Wage_Type")));
	      	drpwaiveoffinterest.selectByIndex(2);
			
	        
	        Select drppaymenttype = new Select (cd.findElement(By.name("paymeentType_0")));
	        drppaymenttype.selectByIndex(6);
	        cd.findElement(By.name("Reference_ID_0")).sendKeys("001");
	        cd.findElement(By.xpath("//*[@id=\"other_details\"]/div[3]/div[2]/div[1]/table/tbody/tr[1]/td[5]/div/span/button/i")).click();
	        Thread.sleep(5000);
	      
	        List <WebElement> dates=  cd.findElements(By.cssSelector("td[class='text-center ng-scope']"));
	        for (int i=0; i<dates.size(); i++)
	        {
	        	String value = dates.get(i).getText();
	        	if (value.equalsIgnoreCase("21"))
	        	{
	        		dates.get(i).click();
	        		break;
	        }
	        }
	       
	        cd.findElement(By.name("comment_0")).sendKeys("Processing fee");
	        cd.findElement(By.xpath("//*[@id=\'other_details\']/div[3]/div[2]/div[2]/button")).click();
	                                 
	        cd.findElement(By.xpath("//*[@id='other_details']/div[3]/div[2]/div[1]/table/tbody/tr[2]/td[2]/label[2]/span")).click();
	        Select droppaymenttype1=new Select (cd.findElement(By.name("paymeentType_1")));
	        droppaymenttype1.selectByIndex(2);
	        cd.findElement(By.name("Reference_ID_1")).sendKeys("002");
	        cd.findElement(By.xpath("//*[@id=\"other_details\"]/div[3]/div[2]/div[1]/table/tbody/tr[2]/td[5]/div/span/button/i")).click();
	        Thread.sleep(5000);
	        
	        List <WebElement> dates1=  cd.findElements(By.cssSelector("td[class='text-center ng-scope']"));
	        for (int i=0; i<dates1.size(); i++)
	        {
	        	String value = dates1.get(i).getText();
	        	if (value.equalsIgnoreCase("21"))
	        	{
	        		dates1.get(i).click();
	        		break;
	        }
	        }
	        
	        cd.findElement(By.name("amount_1")).sendKeys("300000");
	        cd.findElement(By.name("comment_1")).sendKeys("Loan Amount");
	        cd.findElement(By.name("disburse_comments")).sendKeys("Disbursing loan");
	        cd.findElement(By.xpath("//*[@id=\"other_details\"]/div[5]/button[2]/span[2]")).click();
	        Thread.sleep(5000);
	        cd.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
	  }
	 

	  @AfterMethod
	  public void teardown() {
			cd.close();
			cd.quit();
		  }
}
	 
