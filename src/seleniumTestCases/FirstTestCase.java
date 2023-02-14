package seleniumTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Sushil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		String str=driver.getTitle();
		System.out.println("The title of the webpage is :"+str);
	 
	  if(str.contains("Shop Online")) 
	  { 
		  System.out.println("The title contains 'Shop Online'. So the test case is passed"); }
	  else 
	  { 
		  System.out.println("The title does not contain 'Shop Online'. Test case failed"); }
	  
	  String str1=driver.getCurrentUrl();
	  System.out.println("The Current URL is:"+str1);
	  
	  if(str1.contains("amazon")) 
	  {
		  System.out.println("The URL is correct, test case passed"); 
	  } 
	  else 
	  {
		  System.out.println("Test case failed"); 
	  }
	 
	// On Amazon Page 
	  driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
	  // On Yahoo page
	  driver.navigate().back();
	  // On Amazon Page
	  driver.navigate().forward();
	  // On Yahoo page
	  driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
	  // On Gmail

	  driver.manage().window().maximize();
	  try
	  {
	  Thread.sleep(2000);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	
	//  driver.close();

	  WebDriver driver1=new ChromeDriver();
		
		driver1.navigate().to("https://www.amazon.in/");
		
		
WebDriver driver2=new ChromeDriver();
		
		driver2.navigate().to("https://www.amazon.in/");
		
WebDriver driver3=new ChromeDriver();
		
		driver3.navigate().to("https://www.amazon.in/");
		
WebDriver driver4=new ChromeDriver();
		
		driver4.navigate().to("https://www.amazon.in/");
		
		  driver.quit();
		
	}

}
