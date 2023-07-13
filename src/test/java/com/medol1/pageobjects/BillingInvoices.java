package com.medol1.pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingInvoices {

WebDriver ldriver;
	
	public void BillingsInvoicesPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//span[normalize-space()='Billings']")
	WebElement Billings;
	
	@FindBy(xpath="//a[normalize-space()='Invoices']")
	WebElement Invoices;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement NewInvoice;
	
	@FindBy(xpath="//span[@id='select2-patient_id-container']")
	WebElement DropDownButton;
	
	@FindBy(xpath="//input[@role='searchbox']")     
	WebElement searchbox;
	
	
	@FindBy(xpath="//input[@id='invoice_date']")
	WebElement invoice_date;
	
	@FindBy(xpath="//select[@aria-label='Month']")
	WebElement Month;
	
	@FindBy(xpath="//input[@aria-label='Year']")
	WebElement Year;
	
	@FindBy(xpath="//span[@aria-label='June 27, 2023']")
	WebElement date;
	
	@FindBy(xpath="//div[@class='dayContainer']")
	WebElement dayContainer;
	
	@FindBy(xpath="//input[@id='discount']")
	WebElement discount;
	
	@FindBy(xpath="//span[@id='select2-status-container']")
	WebElement statusDropDown;
	
	@FindBy(xpath="//input[@role='searchbox']")
	WebElement searchbox1;
	
	@FindBy(xpath="//button[@id='addInvoiceItem']")
	WebElement addInvoiceItem;
	
	@FindBy(xpath="//span[@aria-expanded='true']")
	WebElement SelectAccountDpDown;
	
	@FindBy(xpath="//input[@role='searchbox']")
	WebElement searchbox2;
	
	@FindBy(xpath="//input[@name='description[]']")
	WebElement description;
	
	@FindBy(xpath="//input[@name='quantity[]']")
	WebElement quantity;
	
	@FindBy(xpath="//input[@name='price[]']")
	WebElement price;
	
	@FindBy(xpath="//td[@class='amount text-center item-total pt-5 text-nowrap']")
	WebElement amount1;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']")
	WebElement Delete;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement Save;
	
	@FindBy(xpath="//a[@class='btn btn-secondary']")
	WebElement Cancel;
	
	
	
	public void clickonbillings()
	{
		Billings.click();
	}
	
	public void clickonInvoices()
	{
		Invoices.click();
	}
	
	public void clickonNewInvoice()
	{
		NewInvoice.click();
	}
	
	public void clickonDropdown() 
	{
		DropDownButton.click();
	}
	
	public void clickonsearchbox()
	{
		searchbox.click();
		searchbox.sendKeys("M 1");
		searchbox.sendKeys(Keys.ENTER);
	}
	
	/*public void clickoninvoice_date() 
	{
		invoice_date.click();
	}*/
	
	/*public void setpbd(String year2,String month2,String date2)
	{
		invoice_date.click();
		Year.click();
		Year.sendKeys(year2);
		 Select month_drp= new Select(Month);
         month_drp.selectByVisibleText(month2);
         List<WebElement> alldate=  (List<WebElement>) date;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date2))

                       {

                                     ele.click();

                                     break;

                       }

         }
         date.click();
	}*/
	
	public void clickondiscount() {
		discount.click();
		discount.sendKeys("10");
		discount.sendKeys(Keys.ENTER);
	}
	
	public void clickstatusDropDown()
	{
		statusDropDown.click();
	}
	
	public void clickonsearchbox1() {
		searchbox1.click();
		searchbox1.sendKeys("paid");
		searchbox1.sendKeys(Keys.ENTER);
	}
	
	public void clickonaddInvoiceItem() 
	{
		addInvoiceItem.click();
	}
	
	public void clickonSelectAccountDpDown() 
	{
		SelectAccountDpDown.click();
	}
	
	public void clickonsearchbox2() 
	{
		searchbox2.click();
		searchbox2.sendKeys("Lakshmi");
		searchbox2.sendKeys(Keys.ENTER);
	}
	
	public void clickonprice() {
		price.click();
		price.sendKeys("20");
	}
	
	public void clickonquantity() 
	{
		quantity.click();
	}
	
	public void clickondescription()
	{
		description.click();
	}
	
	public void clickonamount1() 
	{
		amount1.click();
		amount1.sendKeys("100");
		amount1.sendKeys(Keys.ENTER);
	}
	
	public void clickonSave()
	{
		Save.click();
	}
	
	public void clickonDelete() 
	{
		Delete.click();
	}
	
	public void clickonCancel() 
	{
		Cancel.click();
	}
	
	
	}
