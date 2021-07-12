package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseRightClick {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act= new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		//act.moveToElement(button).click().build().perform();
		
		act.contextClick(button).build().perform();//Right click on the element 
		
	    driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
	    
	   System.out.println( driver.switchTo().alert().getText()); //Capture the text from alert box
	   
	   driver.switchTo().alert().accept();//close the alert box
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
