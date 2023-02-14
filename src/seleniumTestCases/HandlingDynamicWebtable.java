package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://seleniumpractise.blogspot.com/2021/08/");
		
		WebElement cell=driver.findElement(By.xpath("//table[@id='customers']//tr[4]//td[2]"));
		
		String cellvalue=cell.getText();
		
		System.out.println(cellvalue);
		
		driver.close();
		

	}

}
