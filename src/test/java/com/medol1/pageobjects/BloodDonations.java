package com.medol1.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BloodDonations {
WebDriver ldriver;
	
	public BloodDonations(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//div[@id='sidebar']//li[7]//a[1]")
	WebElement BloodBanks;
	
	@FindBy(xpath="//a[normalize-space()='Blood Donations']")
	WebElement BloodDonations;
	
	@FindBy(xpath="//a[contains(@class,'btn btn-primary')]")
	WebElement NewBloodDonation;
	
	@FindBy(xpath="//*[@id='select2-donationDonorName-container']")
	WebElement DropDown;
	
	@FindBy(xpath="//span//input[@class='select2-search__field']")
	WebElement donationDonorName;
	
	@FindBy(xpath="//input[@id='donationBags']")
	WebElement donationBags;
	
	@FindBy(xpath="//button[@id='bloodDonationSave']")
	WebElement bloodDonationSave;
	
	
	public void BloodBanks()
	{
		BloodBanks.click();
	}
	
	public void BloodDonations()
	{
		BloodDonations.click();
	}
	
	public void NewBloodDonation()
	{
		NewBloodDonation.click();
	}
	
	public void DropDown()
	{
		DropDown.click();
	}
	
	public void donationDonorName()
	{
		donationDonorName.click();
		//donationDonorName.getText();
		donationDonorName.sendKeys("PAVAN");
		donationDonorName.sendKeys(Keys.ENTER);
	}
	
	public void donationBags()
	{
		donationBags.sendKeys("1");
		donationBags.sendKeys(Keys.ENTER);
	}
	
	public void bloodDonationSave()
	{
		bloodDonationSave.click();
	}

}
