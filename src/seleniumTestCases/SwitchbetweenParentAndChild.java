package seleniumTestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchbetweenParentAndChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.pepperfry.com/");
		
		String parentwindow=driver.getWindowHandle();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[@class='ftr-social-link youtube']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator it=handles.iterator();
		
		String parent=(String) it.next();
		String child=(String) it.next();
		
		driver.switchTo().window(child);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Hello");
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.close();
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//*[@id=\"regPopUp\"]/a")).click();
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Table");
		
		driver.findElement(By.id("searchButton")).click();

	}

}
