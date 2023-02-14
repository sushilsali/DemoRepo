package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://parivahan.gov.in/parivahan//en");
		
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div/section/div/div/ul/li[1]/a")).click();
		//driver.findElement(By.linkText("About Us")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/a/img")).click();
		
		driver.switchTo().alert().accept();
		//driver.findElement(By.className("emblem-resize")).click();

	}

}
