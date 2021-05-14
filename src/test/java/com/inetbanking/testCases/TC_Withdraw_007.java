package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.Withdraw;

public class TC_Withdraw_007 extends BaseClass{
	@Test
	public void Amountwithdraw() throws InterruptedException, IOException{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		Withdraw with = new Withdraw(driver);
		
		with.clickwithdraw();
		
		logger.info("Enter Account Details");
		
		with.Accno("92542");
		logger.info("Enter Account Number");
		with.Amount("5000");
		logger.info("Enter Amount to withdraw");
		with.Desc("Amazon online shopping Fee");
		logger.info("Enter Description");
		
		with.Accsubmit();
		logger.info("Amount Withdrawn");
		logger.info("Test Case Passed");
		Thread.sleep(3000);
	}

}


