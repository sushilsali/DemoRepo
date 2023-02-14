package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://seleniumpractise.blogspot.com/");
		
		WebElement cell=driver.findElement(By.xpath("//div[@class='container']//div//div//input[2]"));
		
		cell.sendKeys("abc@gmail.com");
		

	}

}
