package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddAccountPage {
	
	WebDriver ldriver;

	public AddAccountPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
		}
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[5]/a")
	@CacheLookup
	WebElement lnkAddAccount;
	
	@FindBy(name="cusid")
	@CacheLookup
	WebElement txtCustomerId;
	
	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "selaccount")
	WebElement selectaccount;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "inideposit")
	WebElement initialdeposit;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "button2")
	WebElement btnSubmit;
	
	
	public void clickAddNewAccount() {
		lnkAddAccount.click();
			
	}
	
	public void custId(String id) {
		txtCustomerId.sendKeys(id);
		
	}
	public void accounttype(String atype) {
		selectaccount.click();
	}
	
	public void initialdeposits(String adeposit) {
		initialdeposit.sendKeys(adeposit);
		
	}
	public void custsubmit() {
		btnSubmit.click();
	}
}
