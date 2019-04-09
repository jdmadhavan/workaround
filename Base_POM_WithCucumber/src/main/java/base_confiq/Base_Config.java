package base_confiq;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;

import utils.Read_Excel;



public class Base_Config {
	
	 public static ChromeDriver driver;
	 public String companyName="TestLeaf";
	 public static String getfirstLead_Id;
	  ExtentReports extent;
	  public String excelfileName;
	    @BeforeMethod @Parameters({"url"})
		public void login_Confiquaration(String url)
		{
	    	System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get(url);

			
		}
		
		
	
		
		@DataProvider(name="inputdata")
		public String[][] getdata() throws IOException
		
		
		{
			return Read_Excel.get_Read_ExcelData(excelfileName);
		}
		
		
		
		@AfterMethod
		public void closeBrowser() {
			driver.close();
			
		}
		
}
