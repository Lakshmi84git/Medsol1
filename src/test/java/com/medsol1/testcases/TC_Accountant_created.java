package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Accountantspage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;



public class TC_Accountant_created extends Baseclass{
Readconfig config= new Readconfig();
	
	public String firstname=config.getfirstname();
	public String lastname=config.getlastname()	;
	public String password1=config.getpassword();
	public String bloodgroup=config.getbloodgroup();
	public String designation=config.getdesignation();
	public String qualification=config.getqualification();
	public String year=config.getyear();
	public String month=config.getmonth();
	public String date=config.getdate();
	public String address1=config.getaddress1();
	public String address2=config.getaddress2();
	public String city=config.getcity();
	public String zipcode=config.getzipcode();
	
	
	@Test
	public void Accountanttest() throws InterruptedException {
		
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
		
		Accountantspage acc= new Accountantspage(driver);		
		
		acc.clickonaccontant();
		Thread.sleep(2000);
		acc.clickonnewaccountant();
		Thread.sleep(2000);
		acc.setfirstname(firstname);
		acc.setlastname(lastname);
		String email=randomstring()+"@gmail.com";
		acc.setemailid(email);
		String number=randomnum();
		String phonenumber="99005"+ number;
		acc.setphone(phonenumber);
		acc.clickonbloodgroup();
		acc.setbloodgroup(bloodgroup);
		acc.setdesignation(designation);
		acc.setqualification(qualification);
		Thread.sleep(3000);
		acc.setdob(year, month, date);
		Thread.sleep(3000);
		acc.clickonfemaleradio();
		acc.setpassword(password1);
		acc.setconpassword(password1);
		acc.setaddress1(address1);
		acc.setaddress2(address2);
		acc.setcity(city);
		acc.setzipcode(zipcode);
		Thread.sleep(3000);
		acc.clickonsave();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	}

}
