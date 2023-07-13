package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Accountantspage;
import com.medol1.pageobjects.BillingInvoices;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;

public class TC_Billings_Invoices extends Baseclass{
	Readconfig config= new Readconfig();
	
	public String selectpatient=config.getselectpatient();
	public String date2=config.getdate2();
	public String month2=config.getmonth2();
	public String year2=config.getyear2();
	public String discount=config.getdiscount();
	public String statusofbill=config.getstatusofbill();
	public String selectaccount=config.getselectaccount();
	public String quantity=config.getquantity();
	public String price=config.getprice();
	
	
	@Test
	public void BillingsInvoicestest() throws InterruptedException {
		
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
		
		BillingInvoices bi= new BillingInvoices();
		
		bi.BillingsInvoicesPage(driver);
		bi.clickonbillings();
		Thread.sleep(3000);
		bi.clickonInvoices();
		Thread.sleep(3000);
		bi.clickonNewInvoice();
		Thread.sleep(3000);
		bi.clickonsearchbox();
		Thread.sleep(3000);
		bi.clickondiscount();
		Thread.sleep(3000);
		bi.clickonsearchbox1();
		Thread.sleep(3000);
		bi.clickonaddInvoiceItem();
		Thread.sleep(3000);
		bi.clickonSelectAccountDpDown();
		Thread.sleep(3000);
		bi.clickonsearchbox2();
		Thread.sleep(3000);
		bi.clickonprice();
		Thread.sleep(3000);
		bi.clickonquantity();
		Thread.sleep(3000);
		bi.clickondescription();
		Thread.sleep(3000);
		bi.clickondiscount();
		Thread.sleep(3000);
		bi.clickonamount1();
		Thread.sleep(3000);
		bi.clickonSave();
		Thread.sleep(3000);
		
		
	}

}
