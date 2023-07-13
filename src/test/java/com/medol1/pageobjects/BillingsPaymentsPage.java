package com.medol1.pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingsPaymentsPage {
	
WebDriver ldriver;
	
	public BillingsPaymentsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//span[normalize-space()='Billings']")
	WebElement Billings;
	
	@FindBy(xpath="//a[normalize-space()='Payments']")
	WebElement Payments;
	
	@FindBy(xpath="//a[@id='dropdownMenuButton']")
	WebElement dropdownMenuButton;
	
	@FindBy(xpath="//a[normalize-space()='New Payment']")
	WebElement NewPayment;
	
	@FindBy(xpath="//span[@id='select2-accountId-container']")
	WebElement SelectAccount;
	
	@FindBy(xpath="//input[contains(@role,'searchbox')]")
    WebElement searchbox;
	
	@FindBy(xpath="//div//textarea[@class='form-control']")
	WebElement formcontrol;
	
	@FindBy(xpath="//input[@id='pay_to']")
	WebElement pay_to;
	
	@FindBy(xpath="//input[@id='paymentDate']")
	WebElement paymentDate;
	
	@FindBy(xpath="//select[@aria-label='Month']")
	WebElement PaymentMonth;
	
	
	@FindBy(xpath="//input[@aria-label='Year']")
	WebElement PaymentYear;
	


	
	@FindBy(xpath="//div[@class='dayContainer']")
	List<WebElement> txtPaymentDate;
	
	
	@FindBy(xpath="//span[@aria-label='June 26, 2023']")
	List<WebElement> txtpaymentDate1;
	
	
	@FindBy(xpath="//input[@id='amount']")
	WebElement amount;
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement description;
	
	@FindBy(xpath="//input[@id='btnPaymentSave']")
	WebElement btnPaymentSave;
	
	@FindBy(xpath="//a[@class='btn btn-secondary']")
	WebElement  btnsecondary;
	
	public void clickonbillings()
	{
		Billings.click();
	}
	
	public void clickonpayment() 
	{
		Payments.click();
	}
	
	public void dropdownMenuButton() 
	{
		dropdownMenuButton.click();
	}
	
	public void NewPayment() 
	{
		NewPayment.click();
	}
	
	
	public void SelectAccount()
	{
		SelectAccount.click();
	}
	
	public void searchbox() 
	{
		searchbox.click();
	}
	
	public void formcontrol() 
	{
		searchbox.sendKeys("Lakshmi");
		searchbox.sendKeys(Keys.ENTER);
	}
	
	
	
	public void pay_to() 
	{
		pay_to.sendKeys("supriya");
		pay_to.sendKeys(Keys.ENTER);
	}
	
	public void payment()
	{
		paymentDate.click();
		
		
	}
	
	public void Date()
	{
		((WebElement) paymentDate).click();
		paymentDate.click();
		
		
		
	}
	public void setpbd(String year2,String month2,String date2)
	{
		paymentDate.click();
		PaymentYear.click();
		PaymentYear.sendKeys(year2);
		 Select month_drp= new Select(PaymentMonth);
         month_drp.selectByVisibleText(month2);
         List<WebElement> alldate=  txtPaymentDate;
       
         for(WebElement ele1:alldate)

         {

                       String dt= ele1.getText();

                       if(dt.equals(date2))

                       {

                                     ele1.click();

                                     break;

                       }
                       
         }
         
	}
	
	public void txtpaymentDate1()
	{
		((WebElement) txtpaymentDate1).click();
	}
	public void amount(String value) 
	{
		amount.sendKeys(value);
		amount.sendKeys(Keys.ENTER);
	}
	
	public void description() 
	{
		description.sendKeys("Payment is payed ");
		description.sendKeys(Keys.ENTER);
	}

	public void btnPaymentSave() 
	{
		btnPaymentSave.click();
	}
	
	public void btnsecondary() 
	{
		btnsecondary.click();
	}
	
	

}
