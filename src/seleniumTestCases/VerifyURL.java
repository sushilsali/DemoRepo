package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Terms")).click();
		
		if(driver.findElement(By.partialLinkText("legacy Oath")).isDisplayed())
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test Case is failed");
		}
	}

}
