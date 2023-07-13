package com.medsol1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	
	Properties pro;
	
	public Readconfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
			
		}catch(Exception e) {
			System.out.println("Exception is"+ e.getMessage());
		}
			
	}
	
	public String getapplicationurl()
	{
		String url =pro.getProperty("baseurl");
		return url;
	}
	
	public String getusername()
	{
		String username =pro.getProperty("username");
		return username;
	}
	
	public String getpassword()
	{
		String password =pro.getProperty("password");
		return password;
	}
	
	public String getChromepath()
	{
		String chromepath =pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getIEpath()
	{
		String iepath =pro.getProperty("iepath");
		return iepath;
	}
	public String getFirefoxpath()
	{
		String firefoxpath =pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getfirstname()
	{
		String firstname =pro.getProperty("firstname");
		return firstname;
	}
	
	public String getlastname()
	{
		String lastname =pro.getProperty("lastname");
		return lastname;
	}
	
	public String getpassword1()
	{
		String password =pro.getProperty("password");
		return password;
	}
	
	public String getconfirmpassword()
	{
		String confirmpassword =pro.getProperty("confirmpassword");
		return confirmpassword;
	}
	
	public String getbloodgroup()
	{
		String bloodgroup =pro.getProperty("bloodgroup");
		return bloodgroup;
	}
	
	public String getdesignation()
	{
		String designation =pro.getProperty("designation");
		return designation;
	}
	
	
	public String getqualification()
	{
		String qualification =pro.getProperty("qualification");
		return qualification;
	}
	
	public String getyear()
	{
		String year =pro.getProperty("year");
		return year;
	}
	
	public String getmonth()
	{
		String month =pro.getProperty("month");
		return month;
	}
	
	public String getdate()
	{
		String date =pro.getProperty("date");
		return date;
	}
	
	public String getyear2()
	{
		String year2 =pro.getProperty("year2");
		return year2;
	}
	
	public String getmonth2()
	{
		String month2 =pro.getProperty("month2");
		return month2;
	}
	
	public String getdate2()
	{
		String date2 =pro.getProperty("date2");
		return date2;
	}
	
	public String getaddress1()
	{
		String address1 =pro.getProperty("address1");
		return address1;
	}
	
	public String getaddress2()
	{
		String address2 =pro.getProperty("address2");
		return address2;
	}
	
	public String getcity()
	{
		String city =pro.getProperty("city");
		return city;
	}
	
	public String getzipcode()
	{
		String zipcode =pro.getProperty("zipcode");
		return zipcode;
	}
	
	public String getdescription()
	{
		String description =pro.getProperty("description");
		return description;
	}
	
	public String getbedtype()
	{
		String bedtype =pro.getProperty("bedtype");
		return bedtype;
	}
	
	public String getbeddescription()
	{
		String beddescription =pro.getProperty("beddescription");
		return beddescription;
	}
	
	public String getbloodgroupinbloodbank()
	{
		String bloodgroupinbloodbank =pro.getProperty("bloodgroupinbloodbank");
		return bloodgroupinbloodbank;
	}
	
	public String getremainingbag()
	{
		String remainingbag =pro.getProperty("remainingbag");
		return remainingbag;
	}
	
	public String getselectpatient()
	{
		String selectpatient =pro.getProperty("selectpatient");
		return selectpatient;
	}
	
	public String getdiscount()
	{
		String discount =pro.getProperty("discount");
		return discount;
	}
	
	public String getstatusofbill()
	{
		String statusofbill =pro.getProperty("statusofbill");
		return statusofbill;
	}
	
	public String getselectaccount()
	{
		String selectaccount =pro.getProperty("selectaccount");
		return selectaccount;
	}
	
	public String getquantity()
	{
		String quantity =pro.getProperty("quantity");
		return quantity;
	}
	
	public String getprice()
	{
		String price =pro.getProperty("price");
		return price;
	}
	
	public String getpaytouser()
	{
		String paytouser =pro.getProperty("paytouser");
		return paytouser;
	}
	
	public String getamounttobepaid()
	{
		String amounttobepaid =pro.getProperty("amounttobepaid");
		return amounttobepaid;
	}
	
	public String getnameinsearchbox()
	{
		String name =pro.getProperty("name");
		return name;
	}
	
	public String getnumeberforpagedropdown()
	{
		String numeber =pro.getProperty("numeber");
		return numeber;
	}
	
	public String getvalueinfiltersearchbox()
	{
		String value =pro.getProperty("value");
		return value;
	}
	
	public String getchangefirstname()
	{
		String changefirstname =pro.getProperty("changefirstname");
		return changefirstname;
	}
	
	public String getchangelasttname()
	{
		String changelastname =pro.getProperty("changelastname");
		return changelastname;
	}
	
	public String getchangebillingname()
	{
		String changebillingname =pro.getProperty("changebillingname");
		return changebillingname;
	}
	
	public String getchangebillingdescription()
	{
		String changebillingdescription =pro.getProperty("changebillingdescription");
		return changebillingdescription;
	}
	
	public String geteditedbloodgroupinbloodbank()
	{
		String editedbloodgroupinbloodbank =pro.getProperty("editedbloodgroupinbloodbank");
		return editedbloodgroupinbloodbank;
	}
	
	public String geteditedremainingbag()
	{
		String editedremainingbag =pro.getProperty("editedremainingbag");
		return editedremainingbag;
	}
	
	public String geteditedbedtype()
	{
		String editedbedtype =pro.getProperty("editedbedtype");
		return editedbedtype;
	}
	
	public String geteditbeddescription()
	{
		String editbeddescription =pro.getProperty("editbeddescription");
		return editbeddescription;
	}
	
	public String geteditpaytouser()
	{
		String editpaytouser =pro.getProperty("editpaytouser");
		return editpaytouser;
	}
	
	public String geteditamounttobepaid()
	{
		String editamounttobepaid =pro.getProperty("editamounttobepaid");
		return editamounttobepaid;
	}
	
	public String geteditdescription()
	{
		String editdescription =pro.getProperty("editdescription");
		return editdescription;
	}
	
	public String getselectdocument()
	{
		String selectdocument =pro.getProperty("selectdocument");
		return selectdocument;
	}
	
	public String getnote()
	{
		String note =pro.getProperty("note");
		return note;
	}
	
	public String geteditnote()
	{
		String editnote =pro.getProperty("editnote");
		return editnote;
	}
	
	
	public String getpath()
	{
		String path =pro.getProperty("path");
		return path;
	}
	
	public String getepath()
	{
		String epath =pro.getProperty("epath");
		return epath;
	}
	
	public String getedittitle()
	{
		String edittitle =pro.getProperty("edittitle");
		return edittitle;
	}
	
	
	public String geteditselectdocument()
	{
		String editselectdocument =pro.getProperty("editselectdocument");
		return editselectdocument;
	}
	
	public String getdocumenttype()
	{
		String documenttype =pro.getProperty("documenttype");
		return documenttype;
	}
	
	public String geteditdocumenttype()
	{
		String editdocumenttype =pro.getProperty("editdocumenttype");
		return editdocumenttype;
	}
	
	public String getdepartment()
	{
		String department=pro.getProperty("department");
		return department;
	}
	
	public String getspecialist()
	{
		String specialist=pro.getProperty("specialist");
		return specialist;
	}
	
	public String getfacebookurl()
	{
		String facebookurl=pro.getProperty("facebookurl");
		return facebookurl;
	}
	
	public String gettwitterurl()
	{
		String twitterurl=pro.getProperty("twitterurl");
		return twitterurl;
	}
	
	public String getinstagramurl()
	{
		String instagramurl=pro.getProperty("instagramurl");
		return instagramurl;
	}
	
	public String getlinkedinurl()
	{
		String linkedinurl=pro.getProperty("linkedinurl");
		return linkedinurl;
	}
	
	public String getdepartment1()
	{
		String department1=pro.getProperty("department1");
		return department1;
	}
	
	public String geteditdepartment()
	{
		String editdepartment=pro.getProperty("editdepartment");
		return editdepartment;
	}
	
	public String geteditdescription1()
	{
		String editdescription1=pro.getProperty("editdescription1");
		return editdescription1;
	}
	
	public String gettextsearchbox()
	{
		String textsearchbox=pro.getProperty("textsearchbox");
		return textsearchbox;
	}
	
	public String getdonorname()
	{
		String donorname=pro.getProperty("donorname");
		return donorname;
	}
	
	public String getdonorage()
	{
		String donorage=pro.getProperty("donorage");
		return donorage;
	}
	
	public String geteditdonorname()
	{
		String editdonorname=pro.getProperty("editdonorname");
		return editdonorname;
	}
	
	public String geteditdonorage()
	{
		String editdonorage=pro.getProperty("editdonorage");
		return editdonorage;
	}
	
	public String geteditbloodgroup()
	{
		String editbloodgroup=pro.getProperty("editbloodgroup");
		return editbloodgroup;
	}
	
	public String getdonortextsearchbox()
	{
		String donortextsearchbox=pro.getProperty("donortextsearchbox");
		return donortextsearchbox;
	}
	
	public String getbloodbags()
	{
		String bloodbags=pro.getProperty("bloodbags");
		return bloodbags;
	}
	
	public String geteditdonortextsearchbox()
	{
		String editdonortextsearchbox=pro.getProperty("editdonortextsearchbox");
		return editdonortextsearchbox;
	}
	
	public String geteditbloodbags()
	{
		String editbloodbags=pro.getProperty("editbloodbags");
		return editbloodbags;
	}
	
	public String getdiagnosiscategory()
	{
		String diagnosiscategory=pro.getProperty("diagnosiscategory");
		return diagnosiscategory;
	}
	
	public String geteditdiagnosiscategory()
	{
		String editdiagnosiscategory=pro.getProperty("editdiagnosiscategory");
		return editdiagnosiscategory;
	}
	
	public String getdiagnosiscategorytextsearchbox()
	{
		String diagnosiscategorytextsearchbox=pro.getProperty("diagnosiscategorytextsearchbox");
		return diagnosiscategorytextsearchbox;
	}
	
	public String getdiagnosiscategorychbox()
	{
		String diagnosiscategory=pro.getProperty("diagnosiscategory");
		return diagnosiscategory;
	}
	
	
	
	public String getweight()
	{
		String weight=pro.getProperty("weight");
		return weight;
	}
	
	public String getheight()
	{
		String height=pro.getProperty("height");
		return height;
	}
	
	public String getaverageglucose()
	{
		String averageglucose=pro.getProperty("averageglucose");
		return averageglucose;
	}
	
	public String getfastingbloodsugar()
	{
		String fastingbloodsugar=pro.getProperty("fastingbloodsugar");
		return fastingbloodsugar;
	}
	
	public String geturinesugar()
	{
		String urinesugar=pro.getProperty("urinesugar");
		return urinesugar;
	}
	
	public String getbloodpressure()
	{
		String bloodpressure=pro.getProperty("bloodpressure");
		return bloodpressure;
	}
	
	public String getdiabetes()
	{
		String diabetes=pro.getProperty("diabetes");
		return diabetes;
	}
	
	public String getcholesterol()
	{
		String cholesterol=pro.getProperty("cholesterol");
		return cholesterol;
	}
	
	public String getpropertyname()
	{
		String propertyname=pro.getProperty("propertyname");
		return propertyname;
	}
	
	public String getpropertyvalue()
	{
		String propertyvalue=pro.getProperty("propertyvalue");
		return propertyvalue;
	}
	
	
	
	
	
	
	

}
