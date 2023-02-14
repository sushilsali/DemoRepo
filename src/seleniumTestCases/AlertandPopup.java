package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.className("signinbtn")).click();
		
		String str=driver.switchTo().alert().getText();
		
		System.out.println(str);
		driver.switchTo().alert().accept();

	}

}
