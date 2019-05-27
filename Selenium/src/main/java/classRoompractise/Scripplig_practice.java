package classRoompractise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scripplig_practice {
public static void main(String[] args) throws AWTException {
	


	System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
	ChromeDriver d1 = new ChromeDriver();
	
	 Robot robot = new Robot();
   	 d1.get("http://demo.automationtesting.in/Register.html");
	 d1.findElement(By.id("imagesrc")).click();

	 
     robot.setAutoDelay(2000);
     StringSelection selection = new StringSelection("C:\\Users\\rmadhavan\\Desktop\\Call with bhaskaran.txt");
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
     robot.setAutoDelay(1000);
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_CONTROL);
     robot.keyRelease(KeyEvent.VK_V);
     robot.setAutoDelay(1000);
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     
     
     
     
	 /*d1.get("https://www.google.co.in/");
     d1.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
     List<WebElement> findElements = d1.findElements(By.xpath("//li[@class='sbct']"));
 
     for (int i = 0; i < findElements.size(); i++) {
	
	System.out.println(findElements.get(i).getText());
	
}
  
     
     

			
			public static void main(String args[]){
				
					
					int i = 5, j = 2;
					System.out.println( i % j );
					}
					}
				
			
*/

}
}





		
/*driver.get("https://www.kal.com/en/kal-search-resuts?searchword=&searchphrase=all");
		
		driver.findElementById("ordering_chzn").click();
		WebElement dropdownElement2 = driver.findElementByXPath("//li[text()='Alphabetical']");
		dropdownElement2.click();
		
		System.out.println("Done");*/
		
		
		
	



