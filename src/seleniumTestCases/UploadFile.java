package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("D:\\image.jpg");
		
		driver.findElement(By.id("file-submit")).click();
		
		

	}

}
