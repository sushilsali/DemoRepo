package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.pepperfry.com/");
		
		String parentwindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[@class='ftr-social-link youtube']")).click();
		
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Table");
		
		driver.findElement(By.id("searchButton")).click();

	}

}
