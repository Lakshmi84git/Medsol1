package com.medol1.pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Accountantspage {
	
WebDriver ldriver;
	
	public Accountantspage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Accountants')]")
    WebElement accountant;
	
	@FindBy(xpath="//a[normalize-space()='New Accountant']")
    WebElement newaccountant;
	
	@FindBy(xpath="//input[@id='first_name']")
    WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='last_name']")
    WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='createAccountantEmail']")
    WebElement txtemailid;
	
	@FindBy(xpath="//input[@id='phoneNumber']")
    WebElement txtphonenum;
	
	@FindBy(xpath="//span[@id='select2-bloodGroup-container']")
    WebElement txtbloodgroup;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtenterbloodgroup;

	@FindBy(xpath="//input[@id='designation']")
    WebElement txtdesignation;
	
	@FindBy(xpath="//input[@id='qualification']")
    WebElement txtqualification;
	
	@FindBy(xpath="//input[@id='birthDate']")
    WebElement txtdob;
	
	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement txtyearindob;
	
	@FindBy(xpath="//select[@aria-label='Month']")//select[@aria-label='Month']
    WebElement txtmonthindob;
	
	@FindBy(xpath="//div[@class='dayContainer']/span")
    List<WebElement>  txtdateindob;
	
	@FindBy(xpath="//input[@id='accountantGenderFemale']")
    WebElement femaleradio;
	
	@FindBy(xpath="//input[@id='password']")
    WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='password_confirmation']")
    WebElement txtconpassword;
	
	@FindBy(xpath="//input[@id='address1']")
    WebElement txtaddress1;
	
	@FindBy(xpath="//input[@id='address2']")
    WebElement txtaddress2;
	
	@FindBy(xpath="//input[@id='city']")
    WebElement txtcity;
	
	@FindBy(xpath="//input[@id='zip']")
    WebElement txtzipcode;
	
	@FindBy(xpath="//input[@type='submit']")
    WebElement savebutton;
	
	public void clickonaccontant()
	{
		accountant.click();
	}
	
	public void clickonnewaccountant()
	{
		newaccountant.click();
	}
	
	public void setfirstname(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void setemailid(String id)
	{
		txtemailid.sendKeys(id);
	}
	
	public void setphone(String num)
	{
		txtphonenum.sendKeys(num);
	}
	
	public void clickonbloodgroup()
	{
		txtbloodgroup.click();
	}
	
	public void setbloodgroup(String blood)
	{
		txtenterbloodgroup.sendKeys(blood);
		txtenterbloodgroup.sendKeys(Keys.ENTER);
	}
	
	public void setdesignation(String des)
	{
		txtdesignation.sendKeys(des);
	}
	
	public void setqualification(String des)
	{
		txtqualification.sendKeys(des);
	}
	
	public void setdob(String year,String month,String date)
	{
		txtdob.click();
		txtyearindob.click();
		txtyearindob.sendKeys(year);
		 Select month_drp= new Select(txtmonthindob);
         month_drp.selectByVisibleText(month);
         List<WebElement> alldate= txtdateindob;
       
         for(WebElement ele:alldate)

         {

                       String dt= ele.getText();

                       if(dt.equals(date))

                       {

                                     ele.click();

                                     break;

                       }

         }
	}
	
	
	public void clickonfemaleradio()
	{
		femaleradio.click();
	}

	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void setconpassword(String cpwd)
	{
		txtconpassword.sendKeys(cpwd);
	}
	
	public void setaddress1(String add1)
	{
		txtaddress1.sendKeys(add1);
	}
	
	public void setaddress2(String add2)
	{
		txtaddress2.sendKeys(add2);
	}
	
	public void setcity(String cty)
	{
		txtcity.sendKeys(cty);
	}
	
	public void setzipcode(String code)
	{
		txtzipcode.sendKeys(code);
	}
	
	public void clickonsave()
	{
		savebutton.click();
	}	
	

}
