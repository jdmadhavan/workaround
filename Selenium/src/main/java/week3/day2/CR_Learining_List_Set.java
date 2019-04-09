package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CR_Learining_List_Set {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TVR",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		
		//Task3 alphabatical Order
		List<WebElement> findTrainsnames = driver.findElementsByXPath("//table[contains(@class,'DataTable TrainList')]//tr/td[2]");
		//Pending Need to write Text
		
		
		
		
		//Task1&2
		List<WebElement> findTrains = driver.findElementsByXPath("//table[contains(@class,'DataTable TrainList')]//tr/td[1]");
		System.out.println(findTrains.size());
		//Checking Duplicates in the trainsNo
	    Set<WebElement> findTrains1= new HashSet<WebElement>();
	     findTrains1.addAll(findTrains);
	    
	    if(findTrains.size()==findTrains1.size())
	    {
	    	System.out.println("There is no Duplicate value");
	    }
	    else
	    {
	    	System.out.println("This a and Duplicate train Available");
	    }
		
	    //Checking Train Numbers in in sorted order
	     List<Integer> getFirstSortlist=new ArrayList<Integer>();
	     
	     for (WebElement gettrainsvalue : findTrains) {
			
	    	 getFirstSortlist.add(Integer.parseInt(gettrainsvalue.getText()));
		}
	     
	    Collections.sort(getFirstSortlist);
	    System.out.println(getFirstSortlist);
	    
	    
	    
	  driver.findElementByLinkText("Train").click();
	  List<WebElement> sortedTrainNo = driver.findElementsByXPath("//table[contains(@class,'DataTable TrainList')]//tr/td[1]");
	  
	  List<Integer> getSecontSortlist=new ArrayList<Integer>();
	  for (WebElement gettrainsvalue : sortedTrainNo) {
			
		  getSecontSortlist.add(Integer.parseInt(gettrainsvalue.getText()));
		}
	     
	    
	  boolean bothlisIsSorted = getFirstSortlist.equals(getSecontSortlist);
	  System.out.println(bothlisIsSorted);
	  
	}

}
