package com.syntax.selenuim.class05;

import java.util.List;




public class DropDownDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().fullscreen();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		
		WebElement contientDD=driver.findElement(By.id("continents"));
		
		//To Handle DropDown that is only  using Select tagName, we handle it with Select Class 
		Select obj = new Select(contientDD); //Always we should pass to the constructor the element or the type of the element which is Select TagName 
		
		//1) Select value by index
		obj.selectByIndex(3);//Australia
		//Thread.sleep(2000);
		
		//2)Select by visible text
		obj.selectByVisibleText("North America");
		Thread.sleep(2000);
		
		//3)Select by value
		
		//Get all Options
		List<WebElement> allOption=obj.getOptions();
		System.out.println(allOption.size());
		
		
		
		
	}

}
