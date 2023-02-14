package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
		
		driver.findElement(By.id("nav_camper")).click();
		
		driver.findElement(By.id("enterinsurantdata")).click();
		
		WebElement checkbox=driver.findElement(By.className("ideal-check"));
		
		boolean a=checkbox.isDisplayed();
		
		if(a)
		{
			System.out.println("Checkbox is displayed");
		}
		else
		{
			System.out.println("Checkbox is not displayed");
		}
		boolean b=checkbox.isEnabled();
		
		System.out.println(b);
		checkbox.click();
		boolean c=checkbox.isSelected();
		System.out.println(c);

	}

}
