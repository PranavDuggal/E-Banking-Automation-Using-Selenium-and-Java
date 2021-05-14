package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BalenceEnquiry {
	
	WebDriver ldriver;

	public BalenceEnquiry(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
		}
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[10]/a")
	@CacheLookup
	WebElement lnkBalenceEnquiry;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "accountno")
	WebElement accountnumber;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "AccSubmit")
	WebElement btnSubmit;
	
	public void clickBalenceEnquiry() {
		lnkBalenceEnquiry.click();
			
	}
	
	public void Custaccno(String ano) {
		accountnumber.sendKeys(ano);
		
	}
	
	public void Balencesubmit() {
		btnSubmit.click();
	}

}
