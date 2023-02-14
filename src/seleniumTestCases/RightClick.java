package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/buttons");
		
		Actions act=new Actions(driver);
		
		WebElement element=driver.findElement(By.id("rightClickBtn"));
		
		act.contextClick(element).perform();
		
		WebElement element1=driver.findElement(By.id("doubleClickBtn"));
		
		act.doubleClick(element1).perform();
		
		
	}

}
