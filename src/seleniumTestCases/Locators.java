package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.pepperfry.com/");
		
		driver.findElement(By.cssSelector("input[name=q]")).sendKeys("chair");
		driver.findElement(By.cssSelector("input[id^='hd-search']")).click();
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
	//	driver.findElement(By.cssSelector("div#regPopUp")).findElement(By.cssSelector("a.popup-close")).click();
		
		
	//	driver.findElement(By.id("search")).sendKeys("chair");

		
		

	}

}
