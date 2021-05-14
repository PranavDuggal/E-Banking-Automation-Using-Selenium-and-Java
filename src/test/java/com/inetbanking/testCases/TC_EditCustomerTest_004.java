package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_004 extends BaseClass {

	@Test
	public void editCustomer() throws InterruptedException, IOException{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		EditCustomerPage editcust = new EditCustomerPage(driver);
		
		editcust.clickEditCustomer();
		
		
		
		editcust.custId(customerId);
		logger.info("Enter Customer Id");
		editcust.editsubmit();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).clear();
		editcust.custaddress("1102 Sector 24");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).clear();
		editcust.custcity("Chandigarh");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")).clear();
		editcust.custstate("UT");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).clear();
		editcust.custpinno("160047");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")).clear();
		editcust.custtelephoneno("987890091");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")).clear();
		String email=randomestring()+"@gmail.com";
		editcust.custemailid(email);
		editcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("Details Updated");
		
		boolean res=driver.getPageSource().contains("Customer details updated Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"editCustomer");
			Assert.assertTrue(false);
		}
		
		
	}
	
	
}
