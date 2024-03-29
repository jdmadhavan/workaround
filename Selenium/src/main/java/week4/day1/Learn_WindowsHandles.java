package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_WindowsHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignup.jsf");
		driver.findElementByLinkText("Contact Us").click();
		
		//Getting All windows using set collection
		
		Set<String> getAllwindowHandles = driver.getWindowHandles();
		
		
		//To get the index value -Passing all set values to list
		List<String> allListwindows= new ArrayList<String>();
	
		allListwindows.addAll(getAllwindowHandles);
		System.out.println("Window size "+allListwindows.size());
		
		//Switching corresponding Windows using index
		driver.switchTo().window(allListwindows.get(1));
		
		//Getting title of the window
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
		
		//Closing Window
		//driver.switchTo().window(allListwindows.get(1));
		driver.switchTo().window(allListwindows.get(allListwindows.size()-1));
		driver.close();
		driver.switchTo().window(allListwindows.get(0));
		//driver.close();
		System.out.println("Windows Clossed Successfully");
		
		
		

	}

}
