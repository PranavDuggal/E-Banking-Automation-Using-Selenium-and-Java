package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FundTransfer {
	
	WebDriver ldriver;

	public FundTransfer(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
		}
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[10]/a")
	@CacheLookup
	WebElement lnkFundtransfer;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "payersaccount")
	WebElement Payersaccountnumber;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "payeeaccount")
	WebElement Payeeaccountnumber;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "ammount")
	WebElement Amount;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "desc")
	WebElement Description;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "AccSubmit")
	WebElement btnSubmit;
	
	public void clickfundtransfer() {
		lnkFundtransfer.click();
			
	}
	
	public void Payersaccno(String pano) {
		Payersaccountnumber.sendKeys(pano);
		
	}
	
	public void Payeeaccno(String Payeeano) {
		Payeeaccountnumber.sendKeys(Payeeano);
		
	}
	
	public void Transferamount(String ta) {
		Amount.sendKeys(ta);
		
	}
	
	public void Description(String des) {
		Description.sendKeys(des);
		
	}
	
	public void Fundsubmit() {
		btnSubmit.click();
	}

}
