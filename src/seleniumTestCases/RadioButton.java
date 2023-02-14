package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.yatra.com/cabs");
		
	//	driver.findElement(By.className("oneway_outsation")).click();
		
	//	driver.findElement(By.id("nav_camper")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement radiobutton= driver.findElement(By.id("BE_cab_local"));
		
		System.out.println(radiobutton.isSelected());
		
		if(radiobutton.isDisplayed())
		{
			System.out.println("Radio button is displayed");
		}
		else
		{
			System.out.println("Radio button is not displayed");
		}
		
		System.out.println(radiobutton.isDisplayed());
		System.out.println(radiobutton.isEnabled());
		
		radiobutton.click();
		
		System.out.println(radiobutton.isSelected());

	}

}
