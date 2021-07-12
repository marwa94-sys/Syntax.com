package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
	
		
			System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
			
			//Login
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
			driver.findElement(By.id("btnLogin")).click();
			
			
			//Admin---->User management--->Users
			Actions act= new Actions(driver);
			WebElement admin=driver.findElement(By.id("menu_admin_viewAdminModule"));
			WebElement userManagement=driver.findElement(By.id("menu_admin_UserManagement"));
		    WebElement users=driver.findElement(By.id("menu_admin_viewSystemUsers"));
		
		    
		   /* act.moveToElement(admin).build().perform();   //mouse over to admin tab
		    act.moveToElement(userManagement).build().perform();  //mouse over to user management tab
		    act.moveToElement(users).click().build().perform();   //mouse over to users and click the  */
		
		     
		    act.moveToElement(admin).moveToElement(userManagement).moveToElement(users).click().build().perform();
		    
		    
		    
		    
		    
		    
		
	}
}
