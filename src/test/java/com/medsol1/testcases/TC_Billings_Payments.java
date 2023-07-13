package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BillingsPaymentsPage;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;

public class TC_Billings_Payments  extends Baseclass{
	Readconfig config= new Readconfig();
	@Test
	public void BillingsPayments() throws InterruptedException
	{
	
	
		
		String firstname=config.getfirstname();
	    String lastname=config.getlastname();
		String password=config.getpassword();
		//String year2=config.getyear2();
		//String month2=config.getmonth2();
		//String date2=config.getdate2();
		
		
		
			
			Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		
		Thread.sleep(3000);	
		
		BillingsPaymentsPage bp= new BillingsPaymentsPage(driver);
		bp.clickonbillings();
		Thread.sleep(3000);	
		bp.clickonpayment();
		bp.dropdownMenuButton();
		bp.NewPayment();
		Thread.sleep(3000);
		bp.SelectAccount();
		Thread.sleep(3000);
		bp.searchbox();
		Thread.sleep(3000);
		bp.formcontrol();
		Thread.sleep(3000);
		bp.pay_to();
		Thread.sleep(3000);
		bp.setpbd(password, lastname, firstname);
		Thread.sleep(3000);
		
		String num=randomnum();
		String value="2000";
		Thread.sleep(3000);
		bp.amount(value);
		Thread.sleep(3000);
		
		bp.description();
		Thread.sleep(3000);
		bp.btnPaymentSave();
	
		bp.NewPayment();
		
		
		
		
		
			Thread.sleep(3000);	
			
			
			
			
		}
		
	}

