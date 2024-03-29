package pages;

import javax.print.attribute.standard.RequestingUserName;

import base_confiq.Base_Config;

public class Find_Leads extends Base_Config {
	public static String getfirstLead_Id;
	
public Find_Leads()
{
	
}


public Find_Leads clickEmailTab()
{
	driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
	return this;
}


public Find_Leads enterEmail_Address(String email)
{
	driver.findElementByName("emailAddress").sendKeys(email);
	return this;
}


public Find_Leads click_FindLead_Button() throws InterruptedException
{
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(5000);
	return this;
}


public ViewLeads click_FirstValue() throws InterruptedException
{
	getfirstLead_Id = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	System.out.println("Getting lead id Value"+getfirstLead_Id);
	Thread.sleep(2000);
	return new ViewLeads();
}


public Find_Leads enter_LeadId()
{
	System.out.println("firstleaid"+ getfirstLead_Id);
	driver.findElementByXPath("//input[@name='id']").sendKeys(getfirstLead_Id);
	return this;
}

public void verify_DeletLeadID()
{
       String Expectedtext = driver.findElementByXPath("//div[text()='No records to display']").getText();
	
	if (Expectedtext.equalsIgnoreCase("No records to display"))
	{
		System.out.println("No record Messge Appearing");
	}
	else
	{
		System.out.println("No records message Not Appearing");
	}

}
}
