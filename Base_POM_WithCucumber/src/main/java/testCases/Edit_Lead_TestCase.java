package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_confiq.Base_Config;
import pages.LoginPage;

public class Edit_Lead_TestCase extends Base_Config {

	@BeforeTest
	public void setData() {
		excelfileName="updateLead";
	}
	
	@Test(dataProvider="inputdata")
	public void Edit_Lead(String uName, String pswd, String cName,String fName,String lName, String email) throws InterruptedException  {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pswd)
		.clickLoginButton()
		.clickCrmfaLink()
		.CickLeadLink()
		.clickFindLead()
		.clickEmailTab()
		.enterEmail_Address(email)
		.click_FindLead_Button()
		.click_FirstValue()
		.click_Edit_Button()
		.updateCompanyName(cName)
		.updateFirstName(fName)
		.updateLastName(lName)
		.clickUpdateLeadButton()
		.verifyName();
		System.out.println("Completed Edit Test Case");
		
		
		
		
	}
}
