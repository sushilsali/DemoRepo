package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://parivahan.gov.in/parivahan//en");
		
		driver.findElement(By.xpath("//input[@name='search_block_form']")).sendKeys("vahan");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//driver.findElement(By.className("btn.btn-primary")).click();
		
		driver.findElement(By.xpath("//img[contains(@alt,'G20')]")).click();
		
		driver.switchTo().alert().dismiss();
		
		driver.navigate().refresh();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@id='edit-search-block-form--2'and@name='search_block_form']")).sendKeys("dealer");
		
		driver.findElement(By.xpath(""));
		
		

	}

}
