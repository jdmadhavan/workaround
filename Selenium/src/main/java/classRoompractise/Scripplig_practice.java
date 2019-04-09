package classRoompractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scripplig_practice {
public static void main(String[] args) {
	


	System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
	ChromeDriver d1 = new ChromeDriver();
	 d1.get("https://www.google.co.in/");
     d1.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
     List<WebElement> findElements = d1.findElements(By.xpath("//li[@class='sbct']"));

for (int i = 0; i < findElements.size(); i++) {
	
	System.out.println(findElements.get(i).getText());
	
}
  
     

			
			/*public static void main(String args[]){
				
					
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
		
		
		
	



