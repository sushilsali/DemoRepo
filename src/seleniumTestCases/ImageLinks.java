package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://parivahan.gov.in/parivahan//en");

		WebElement source = driver.findElement(By.partialLinkText("About Us"));
		
		source.click();
		
		driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).click();
		
		String str=driver.getTitle();
		
		if(str.contains("Home"))
		{
			System.out.println("Navigation to home page is successful");
		}
		else
		{
			System.out.println("Navigation to home page is not successful");
		}
		
		

	}

}
