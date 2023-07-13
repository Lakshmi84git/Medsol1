package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Loginpage;


public class TC_Logintest_created extends Baseclass{
	
	
	@Test
	public void logintest() throws InterruptedException {
		
		
		
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	/*Thread.sleep(3000);
	if(driver.getTitle().equals("    Login\r\n"
			+ " | HMS"))
			{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}*/
	}
	
	
	
	

}
