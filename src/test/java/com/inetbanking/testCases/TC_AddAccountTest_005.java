package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddAccountPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddAccountTest_005 extends BaseClass{
	
	@Test
	public void addAccount() throws InterruptedException, IOException{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddAccountPage addacc = new AddAccountPage(driver);
		
		addacc.clickAddNewAccount();
		
		logger.info("Create Account");
		
		addacc.custId(customerId);
		logger.info("Enter Customer Id");
		
		addacc.accounttype("Savings");
		addacc.initialdeposits("10000");
		logger.info("Enter Deposit Amount");
		addacc.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("Account Created....");
		logger.info("Test Case Passed....");
		Thread.sleep(3000);
		
		
		}
}