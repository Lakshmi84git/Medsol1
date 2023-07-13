package com.medol1.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adminpage {
WebDriver ldriver;
	
	public Adminpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//span[normalize-space()='Admins']")
    WebElement admin;
	
	@FindBy(xpath="//a[contains(@class,'btn btn-primary')]")
    WebElement newadmin;
	
	@FindBy(name="first_name")
    WebElement txtfirstname;
	
	@FindBy(name="last_name")
    WebElement txtlastname;
	
	@FindBy(name="email")
    WebElement txtemailid;
	
	@FindBy(name="phone")
    WebElement txtphonenum;
	
	/*@FindBy(name="dob")
    WebElement txtdateofbirth;
	
	@FindBy(xpath="//input[@aria-label='Year']")
    WebElement txtdateofyear;
	
	@FindBy(xpath="//select[contains(@class,'flatpickr-monthDropdown-months')]")
    WebElement month;*/

	
	@FindBy(name="password")
    WebElement txtpassword;
	
	@FindBy(name="password_confirmation")
    WebElement txtconpassword;
	
	@FindBy(xpath="//input[contains(@id,'adminGenderFemale')]")
    WebElement femaleradio;
	
	@FindBy(xpath="id=editAdminGenderMale")
    WebElement maleradio;
	
	@FindBy(xpath="//input[contains(@class,'btn btn-primary me-2')]")
    WebElement savebutton;
	
	@FindBy(xpath="//input[@data-datatable-filter='search']")
    WebElement searchbox;
	
	@FindBy(xpath="//select[@id='perPage']")
    WebElement dropdownpage;
	
	@FindBy(xpath="//button[@id='adminFilterBtn']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement filterbutton;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]")
    WebElement filterdropdown;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
    WebElement filtersearch;
	
	@FindBy(id="accountResetFilter")
    WebElement resetbutton;
	
	@FindBy(xpath="//a[@title='Delete']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement deletebutton;
	

	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
    WebElement yesdeletebutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/a[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    WebElement editbutton;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/label[1]/input[1]")
    WebElement statusbutton;
	
	public void clickonadmin()
	{
		admin.click();
	}
	
	public void clickonnewadmin()
	{
		newadmin.click();
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
	
	/*public void setdateofbirth()
	{
		txtdateofbirth.click();
	}
	
	public void setdob(String mon,String yr,String dt)
	{
	
	String month="March";
	String year="1995";
	String date="15";
	
		Select drop =new Select(month);
		drop.selectByVisibleText(mon);
		
		Select drop =new Select(month);
		drop.selectByVisibleText(mon);
	}*/
	
	public void setphone(String num)
	{
		txtphonenum.sendKeys(num);
	}
	
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void setconpassword(String cpwd)
	{
		txtconpassword.sendKeys(cpwd);
	}
	
	public void clickonfemaleradio()
	{
		femaleradio.click();
	}
	
	public void clickonsave()
	{
		savebutton.click();
	}
	
	public void clickonsearchbox()
	{
		searchbox.click();
	}
	
	public void setvalueinsearchbox(String fname)
	{
		
		searchbox.sendKeys(fname);
		//searchbox.sendKeys(Keys.ENTER);
	}
	
	public void setdropdownpage(String numumber)
	{
		//dropdownpage.click();
		Select drp = new Select(dropdownpage);
		drp.selectByVisibleText(numumber);
	}
	
	public void clickonfilter()
	{
		filterbutton.click();
	}
	
	public void clickonfilterdropdown()
	{
		filterdropdown.click();
	}
	
	public void setinsearchbox(String value)
	{
		//filtersearch.click();
		filtersearch.sendKeys(value);
		filtersearch.sendKeys(Keys.ENTER);
		
	}
	
	public void clickonresetbutton()
	{
		resetbutton.click();
	}
	
	public void clickondeletebutton()
	{
		deletebutton.click();
	}
	
	public void clickonyesdeletebutton()
	{
		yesdeletebutton.click();
	}
	
	public void clickonstatusbutton()
	{
		statusbutton.click();
	}
	
	public void clickoneditbutton()
	{
		editbutton.click();
	}
	
	public void clearfirstnameandsetnewname(String ffname)
	{
		txtfirstname.clear();
		txtfirstname.sendKeys(ffname);
	}
	
	public void clearlastnameandsetnewname(String llname)
	{
		txtlastname.clear();
		txtlastname.sendKeys(llname);
	}
	
	public void clickonmaleradio()
	{
		maleradio.click();
	}
	
	
	
	
	

}
