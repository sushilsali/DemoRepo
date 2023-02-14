package seleniumTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.rediff.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	//	driver.switchTo().frame(0);
		
	//	driver.switchTo().frame("moneyiframe");
		
		WebElement frame=driver.findElement(By.id("moneyiframe"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("bseindex")).click();
		
		
	}

}
