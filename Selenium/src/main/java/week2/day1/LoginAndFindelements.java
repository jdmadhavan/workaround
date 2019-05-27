package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginAndFindelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
	//	ChromeDriver driver = new ChromeDriver();
		ChromeDriver d1 = new ChromeDriver();
		/*driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Create Lead").click();
		

		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Madhavan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ramalingam");
		driver.findElementByName("submitButton").click();
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElementByLinkText("Edit").click();
		
		// Select Dropdown value Using visible text
		WebElement dropdownElement1 = driver.findElementById("updateLeadForm_industryEnumId");
		Select dd1= new Select(dropdownElement1);
		dd1.selectByVisibleText("Computer Software");
		
		//Select Dropdown value Using index
		
		WebElement dropdownElement2 = driver.findElementById("updateLeadForm_ownershipEnumId");
		
		Select dd2= new Select(dropdownElement2);
		List<WebElement> Listofvalue = dd2.getOptions();
		System.out.println(Listofvalue.size());
		dd2.selectByIndex(Listofvalue.size()-1);
		






*/


		 WebDriver driver= new ChromeDriver();			
 		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        driver.get("http://demo.guru99.com/V4/");			
	        		
	        WebElement button =driver.findElement(By.name("btnLogin"));			
	        		
	        //Login to Guru99 		
	        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
	        driver.findElement(By.name("password")).sendKeys("amUpenu");					
	        		
	        //Perform Click on LOGIN button using JavascriptExecutor		
	        js.executeScript("arguments[0]", button);
	                                
	        //To generate Alert window using JavascriptExecutor. Display the alert message 			
	        //js.executeScript("alert('User or Password is not valid')"); 
           



	        


	}

}
