package selenuimPractice;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.functors.WhileClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("url");
	
	WebElement content=driver.findElement(By.id("Content"));
	Select select= new Select(content);
	
	List<WebElement> option=select.getOptions(); //Will retrieve the list of all the values in the DD
	System.out.println(option.size());
		
	for(int i=0; i< option.size();i++) {
		select.deselectByIndex(i);
			Thread.sleep(5000);
		}	
	  
	
	//===Other loop we can use iterator 
	
	Iterator<WebElement> it= option.iterator();
while(it.hasNext()) {
	String text=it.next().getText();
	System.out.println(text);
}
	
	
	//Here if we want get text of these values 
	
	for (WebElement texts: option) {
		String text= texts.getText();
		System.out.println(text);
		
		if(texts.equals("Monday")) {
			texts.click();
		}
	}
		
		
		
		
		
		
		
		
		
		
		
	}

}
