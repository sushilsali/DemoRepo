package seleniumTestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ImplicitWait {

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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Create Account")).click();
		
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
