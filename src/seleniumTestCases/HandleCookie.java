package seleniumTestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.navigate().to("https://www.google.com/");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Cookie cookie1=new Cookie("Google","www.google.com");
		
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.manage().addCookie(cookie1);
		
		driver.navigate().to("https://www.facebook.com/");
		Cookie cookie2=new Cookie("Facebook","www.facebook.com");
		
		try {
	
			System.out.println(cookie2.getName());
			System.out.println(cookie2.getValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().deleteCookieNamed("Facebook");
		
		try {
			
			System.out.println(driver.manage().getCookieNamed("Facebook").getName());
			//System.out.println(cookie2.getValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.close();
	}

}
