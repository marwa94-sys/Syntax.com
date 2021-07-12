package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.twoplugs.com/");
		
		driver.manage().window().maximize();
		
		
		//Flashing 
		 //WebElement joinnfree=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		
		
		//Drawing Border & screenshot
		//JavaScriptUtil.drawBorder(webElement,driver);
		
	
		/*
		 * //JavaScriptUtil Class (Has Only  JavaScript Executor Methods)
		 *  
		 *  public static void drawBorder (WebElement element,  WebDriver driver){
		 *  
		 *  JavaScriptExecutor js= ((JavaScriptExecutor)driver);
		 *  
		 *  js.executeScript("arguments[0].style.border='3px solid red'", element);   //--> for Color
		 *  }
		 */
		
	}

}
