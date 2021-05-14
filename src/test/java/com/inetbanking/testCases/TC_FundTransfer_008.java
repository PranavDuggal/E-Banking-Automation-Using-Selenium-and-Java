package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.FundTransfer;
import com.inetbanking.pageObjects.LoginPage;

public class TC_FundTransfer_008 extends BaseClass{
	
	@Test
	public void Fundtransfer() throws InterruptedException, IOException{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		FundTransfer ft = new FundTransfer(driver);
		
		ft.clickfundtransfer();
		
		logger.info("Enter Payee and Payers Account Details");
		
		ft.Payersaccno("92542");
		logger.info("Enter Payers Account No");
		ft.Payeeaccno("92546");
		logger.info("Enter Payee Account No");
		ft.Transferamount("2000");
		logger.info("Enter Amount to send");
		ft.Description("Tution Fees");
		logger.info("Enter Description");
		
		logger.info("Amount Transferred to Payee");
		logger.info("Test Case passed");
		Thread.sleep(3000);
		
	}

}
