package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Deposits;
import com.inetbanking.pageObjects.LoginPage;

public class TC_Deposits_006 extends BaseClass {
	
	
	@Test
	public void Amountdeposits() throws InterruptedException, IOException{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		Deposits dep = new Deposits(driver);
		
		dep.clickDeposit();
		
		logger.info("Enter Account Details");
		
		dep.Accno("92542");
		logger.info("Enter Account Number");
		dep.Amount("4440000");
		logger.info("Enter Amount to be Deposited");
		dep.Desc("Savings");
		logger.info("Enter Description");
		
		dep.Accsubmit();
		logger.info("Amount Deposited");
		logger.info("Test Case Passed");
		Thread.sleep(3000);
	}

}
