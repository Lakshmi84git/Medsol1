package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Adminpage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;



public class TC_Admin_delete extends Baseclass{
	
Readconfig config= new Readconfig();
	
	public String name=config.getnameinsearchbox();
	public String number=config.getnumeberforpagedropdown()	;
	public String value=config.getvalueinfiltersearchbox();
		
	@Test
	public void Admindelete() throws InterruptedException
	{
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);	
	Adminpage ad= new Adminpage(driver)	;
	ad.clickonadmin();

	Thread.sleep(2000);
	ad.clickonsearchbox();
	ad.setvalueinsearchbox(name);
	Thread.sleep(2000);
	//ad.setdropdownpage(number);
	//Thread.sleep(2000);
	ad.clickonfilter();
	ad.clickonfilterdropdown();
	Thread.sleep(2000);
	ad.setinsearchbox(value);
	ad.clickonresetbutton();
	ad.clickondeletebutton();
	ad.clickonyesdeletebutton();
	Thread.sleep(2000);
	
	}
	

}
