package workAround;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		WebElement mousEle = driver.findElementByXPath("(//span[@class='_1QZ6fC _3Lgyp8'])[3]");
		Actions builder=new Actions(driver);
		builder.moveToElement(mousEle).perform();*/
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement firstEleMove = driver.findElementByXPath("//span[text()='Shop by']");
		WebElement seconMove = driver.findElementByXPath("//span[text()='Fire TV Stick']");
		WebElement thirdMove = driver.findElementByXPath("//span[text()='All-New Fire TV Stick 4K']");
		
		Actions builder=new Actions(driver);
		builder.moveToElement(firstEleMove).perform();
		System.out.println("one");
		builder.moveToElement(seconMove).perform();
		System.out.println("two");
		builder.moveToElement(thirdMove).perform();
		System.out.println("three");
		thirdMove.click();
		
		System.out.println("successfully clicked");
		driver.close();
		
		
		
		

	}

}
