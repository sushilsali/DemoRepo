package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.pepperfry.com/");
		
		// First way of locating the element using CSS Selector = "Tagname#id"
//		driver.findElement(By.cssSelector("input#search")).sendKeys("chair");
		
		//Second way of locating the element using CSS Selector = "Tagname.ClassName"
//		driver.findElement(By.cssSelector("input.hd-search-btn")).click();
	
		// Third way of locating the element using CSS Selector = Tag and attribute
		
		driver.findElement(By.cssSelector("input[name=q]")).sendKeys("table");
		driver.findElement(By.cssSelector("input[id=searchButton")).click();
		
		// Fourth way of locating the element using CSS Selector = Tag.classname[id=idname]
		//driver.findElement(By.cssSelector("input.hd-search-btn[id=searchButton]")).click();
		
		//Fifth way of locating the element using the CSS Selector = Substring matches - ^ -- starts with   $   *
		// 5.1 -- Matching with starts with substring using ^
		driver.findElement(By.cssSelector("p[class^='srch']")).click();
		
		// 5.2 -- Matching the substring using ends with - $
		//driver.findElement(By.cssSelector("p[class$='rslts-ttl']")).click();
		
		// 5.3 -- Matching the substring using contains operator - *
		//driver.findElement(By.cssSelector("p[class*='rslts']")).click();
		

		
		
	}

}
