package seleniumTestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.rediff.com/");
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		
		File target=new File("D:/"+System.currentTimeMillis()+".png");
		
		try {
			FileHandler.copy(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement link=wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("Create Account")));
		
		link.click();
		
		//driver.findElement(By.linkText("Create Account")).click();
		
		TakesScreenshot screenshot1=(TakesScreenshot)driver;
		
		File source1=screenshot1.getScreenshotAs(OutputType.FILE);
		
		File target1=new File("D:/"+System.currentTimeMillis()+".png");
		
		try {
			FileHandler.copy(source1, target1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
