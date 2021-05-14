package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Withdraw {
	WebDriver ldriver;

	public Withdraw(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
		}
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[9]/a")
	@CacheLookup
	WebElement lnkWithdraw;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "accountno")
	WebElement Accountnumber;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "ammount")
	WebElement withdrawamount;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "desc")
	WebElement Description;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "AccSubmit")
	WebElement btnSubmit;
	
	public void clickwithdraw() {
		lnkWithdraw.click();
			
	}
	
	public void Accno(String ano) {
		Accountnumber.sendKeys(ano);
		
	}
	
	public void Amount(String Withdrawamount) {
		withdrawamount.sendKeys(Withdrawamount);
		
	}
	
	public void Desc(String des) {
		Description.sendKeys(des);
		
	}
	
	public void Accsubmit() {
		btnSubmit.click();
	}
}
