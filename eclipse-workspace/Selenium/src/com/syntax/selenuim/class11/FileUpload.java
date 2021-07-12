package com.syntax.selenuim.class11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Test Case Scenario Navigate to "http://the-internet.herokuapp.com/upload"
 * UpLoad The file verify file is uploaded
 *
 */

public class FileUpload  {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://google.com");

//To upload file we can use sendKeys method and provide full path to the file

//driver.findElement(By.id("file-upload")).sendKeys("\\Users\\marwa\\Desktop\\FileForProyect");

//To upload any file using selenuim we can simply use sendkeys command and provide full path with name and your extension to the file
// if send keys won't work you will need to use Robot Class or use 3 party tools such as AutoIT, Sikilu
//If you have only 1 or 2 test cases in the entire regression suite that needs to verify upload functionality you can execute those test cases manually 

	}
}

