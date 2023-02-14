package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");

		WebElement source = driver.findElement(By.id("fourth"));
		
		WebElement target = driver.findElement(By.id("amt7"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).build().perform();
		
	}

}
