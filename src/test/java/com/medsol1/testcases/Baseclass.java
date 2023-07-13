package com.medsol1.testcases;

import java.time.Duration;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.medsol1.utilities.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	
	
Readconfig config= new Readconfig();
	
	public String baseurl=config.getapplicationurl();
	public String username=config.getusername();
	public String password=config.getpassword();

	public static WebDriver driver;
	public static Logger Logger;
	
	//@Parameters("browser")
	@BeforeClass
	public void setup() throws InterruptedException
	{
//		if(br.equals("chrome"))
//		{
		//System.setProperty("webdriver.chrome.driver", config.getChromepath());
//	    WebDriverManager.chromedriver().setup();
//	    ChromeOptions options = new ChromeOptions();
//	    options.addArguments("--remote-allow-origins=*");
//		driver= new ChromeDriver(options);
//		}
//		else if(br.equals("firefox"))
//		{
//			System.setProperty("webdriver.firefox.driver", config.getFirefoxpath());
//			driver= new FirefoxDriver();
//		}
//		else if(br.equals("ie"))
//		{
//			System.setProperty("webdriver.ie.driver", config.getIEpath());
//			driver= new InternetExplorerDriver();
//		}
		System.setProperty("webdriver.chrome.driver", config.getChromepath());
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseurl);
		driver.manage().window().maximize();
		 Thread.sleep(5000);

		
	}
	
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}
	
	public String randomnum()
	{
		String generatedstring2=RandomStringUtils.randomNumeric(5);
		return (generatedstring2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
