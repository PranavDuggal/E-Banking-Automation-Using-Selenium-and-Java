package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.BalenceEnquiry;

public class TC_BalanceEnquiry_009 extends BaseClass{
	
	@Test
	public void Balenceenquiry() throws InterruptedException, IOException{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		BalenceEnquiry be = new BalenceEnquiry(driver);
		be.clickBalenceEnquiry();
		logger.info("Enter Account No");
		be.Custaccno("92542");
		be.Balencesubmit();
		
		logger.info("Account Holder can see his Balence");
		logger.info("Enter Account No");
		Thread.sleep(3000);
	}

}
