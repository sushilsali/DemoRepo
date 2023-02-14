package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.pepperfry.com/");
		
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Table");
		
		Actions act=new Actions(driver);
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='search']"));
		
		act.keyDown(Keys.SHIFT).build().perform();
		searchbox.sendKeys("t");
		
		act.keyUp(Keys.SHIFT).build().perform();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		searchbox.sendKeys("able");
		
		driver.findElement(By.id("searchButton")).click();
		
		
		
	}

}
