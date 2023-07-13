package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BillingAdvancePayments;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;

public class TC_Billing_AdvancePayments extends Baseclass{
	Readconfig config= new Readconfig();
	
	
	public String selectpatient = config.getselectpatient();
	
	@Test
	public void billingadvance() throws InterruptedException {
		
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
	
	  BillingAdvancePayments bap = new BillingAdvancePayments(driver);
	  
	  bap.clickonbillings();
	  Thread.sleep(3000);
	  bap.AdvancePayments();
	  Thread.sleep(3000);
	  bap.NewAdvancePayment();
	  Thread.sleep(3000);
	  bap.selectpatient();
	  Thread.sleep(3000);
	  bap.amount();
	  Thread.sleep(3000);
	  bap.advancedPaymentSave();
	}

}
