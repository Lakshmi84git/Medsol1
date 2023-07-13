package com.medol1.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAdvancePayments {
WebDriver ldriver;
	
	public BillingAdvancePayments(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Billings']")
	WebElement Billings;
	
	@FindBy(xpath="//a[normalize-space()='Advance Payments']")
	WebElement AdvancePayments;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement NewAdvancePayment;
	
	@FindBy(xpath="//span[@id='select2-advancePaymentPatientId-container']")
	WebElement selectpatient;
	
	@FindBy(xpath="//input[@id='amount']")
	WebElement amount;
	
	@FindBy(xpath="//button[@id='advancedPaymentSave']")
	WebElement advancedPaymentSave;
	
	
	
	public void clickonbillings()
	{
		Billings.click();
	}
	
	public void AdvancePayments()
	{
		AdvancePayments.click();
	}
	
	public void NewAdvancePayment()
	{
		NewAdvancePayment.click();
	}
	
	public void selectpatient()
	{
		selectpatient.click();
		//selectpatient.sendKeys("M 1");
		//selectpatient.sendKeys(Keys.ENTER);
		
	}
	
	public void amount()
	{
		amount.click();
		amount.sendKeys("150");
		amount.sendKeys(Keys.ENTER);
	}

	public void advancedPaymentSave()
	{
		advancedPaymentSave.click();
	}
}
