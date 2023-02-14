package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Terms of")).click();
		
	//	driver.findElement(By.linkText("Privacy")).click();
		
	//	driver.findElement(By.name("srchword")).sendKeys("news");

		//driver.findElement(By.className("newsrchbtn")).click();
	}

}
