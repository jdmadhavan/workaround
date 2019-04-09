package week4.day1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_different_Type_windowHandles {

	public static void main(String[] args) {
		
	
	
	//Method Two	
	/*System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("http://leafground.com/pages/Window.html");
	driver.findElementById("home").click();
	
	Set<String> getAllWindows=driver.getWindowHandles();
	
	for(String eachWindow:getAllWindows)
	{
		driver.switchTo().window(eachWindow);
		String title = driver.getTitle();
		
		if(title.contains("playground"))
		{
			break;
		}
		
	}
	
*/	
System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.get("http://leafground.com/pages/Window.html");
driver.findElementById("home").click();

Set<String> getAllWindows=driver.getWindowHandles();

Iterator<String> allWindowHandles= getAllWindows.iterator();
boolean hasNext = allWindowHandles.hasNext();

if (hasNext) {
	driver.switchTo().window(allWindowHandles.next());
}


driver.close();
}

}