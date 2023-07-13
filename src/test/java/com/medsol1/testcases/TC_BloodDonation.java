package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Accountantspage;
import com.medol1.pageobjects.BloodDonations;
import com.medol1.pageobjects.Loginpage;
import com.medsol1.utilities.Readconfig;

public class TC_BloodDonation extends Baseclass{
	
	Readconfig config= new Readconfig();
	
	public String donationDonorName = config.getdonortextsearchbox();
	public String donationBags = config.getbloodbags();
	
	
	@Test
	public void BloodDonationtest() throws InterruptedException {
		
		Thread.sleep(3000);
		Loginpage lp=new Loginpage(driver);
	lp.clickonlogin();
	lp.setemail(username);
	lp.setpassword(password);
	lp.clickonloginsubmit();
	Thread.sleep(3000);
		
		BloodDonations bds= new BloodDonations(driver);
		bds.BloodBanks();
		Thread.sleep(2000);
		bds.BloodDonations();
		Thread.sleep(2000);
		bds.NewBloodDonation();
		Thread.sleep(5000);
		bds.donationDonorName();
		Thread.sleep(5000);
		bds.donationBags();
		Thread.sleep(2000);
		bds.bloodDonationSave();
		Thread.sleep(2000);

}
}
