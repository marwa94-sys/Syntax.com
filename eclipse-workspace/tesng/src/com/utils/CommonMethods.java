package com.utils;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods  extends BaseClass{
	
	
	/**
	 * Method that clears and sends Keys 
	 * @param element
	 * @param text
	 */

	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	
	
	
	/**
	 * This Method Checks if radio/checkbox is enabled and clicks it 
	 * @param redioOrchekbox
	 * @param value
	 */
	
	
	public static void clickRadioOrCheckbok(List<WebElement>redioOrchekbox,String value) {
		
		String actualValue;
		
		for(WebElement el:redioOrchekbox) {//Will take every element  and click right the way 
			actualValue=el.getAttribute("value").trim();
			if(el.isEnabled()&&actualValue.equals(value));
			el.click();
			break;
			}
	}
		
		
	
	
		/**
		 * Method that checks if text is there then selects it
		 * 
		 * @param element 
		 * @param textToSelect
		 */
		
	public static void selectDdValue(WebElement element, String textToSelect) {
	      try {
			Select select= new Select(element);
		    List<WebElement> options=select.getOptions();
		
		
		for(WebElement el:options) {
			if(el.getText().equals(textToSelect)) {
				select.selectByVisibleText(textToSelect);
				break;
			}
		}
	}
		catch (UnexpectedTagNameException e) {
		e.printStackTrace();
	}
	
	}
		
	
	
	
	
	
	/**
	 * Method that selects value by index 
	 * @param element
	 * @param index
	 */
	
	public static void selectDdValue(WebElement element, int index) {
		
		try {
			Select select = new Select(element);   //  We Will object of select class  
			int size = select.getOptions().size();//Either or List<Webelement>

			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	
	
	

	
	
	
	
	//Method will Accept Alert and catches exception if alert is not present   --> Function has description
	public static void acceptAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
	
	
   //Method will dismiss Alert and catches exception if Alert in not present 
	public static void dismissAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	
	
	//Method that gets text of Alert and catches exception  if alert is not present 
	public static String getAlertText() {

		String alertText = null;

		try {
			Alert alert = driver.switchTo().alert();  //Store it in object of Alert type
			alertText = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

		return alertText;
	}
		
		
	
	
	
	
	//Method that Sends text of Alert and catches exception  if alert is not present 
		public static void sendAlertText(String Text) {
			
			try {
				
			
			Alert alert= driver.switchTo().alert(); //Switch the focus  then send the Text 
			alert.sendKeys(Text);
			
		}catch (NoAlertPresentException e) {
			e.printStackTrace();
		}}
		
		
		
		
		
		
		public static void switchToFrame(String nameOrTd) {
			try {
				driver.switchTo().frame(nameOrTd);
			} catch (NoSuchFrameException e) {
				e.printStackTrace();
			}}
		
		
		public static void swithcToFrame(WebElement element ) {
			try {
				driver.switchTo().frame(element);
			} catch (NoSuchFrameException e) {
				e.printStackTrace();
			}
		}
		
		
		public static void switchToFrame(int index) {
			try {
				driver.switchTo().frame(index);
			} catch (NoSuchFrameException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		/**
		 * Method switches focus to child window
		 */
		public static void switchToChildWindow() {
			String mainWindow = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			for (String window : windows) {
				if (!window.equals(mainWindow)) {
					driver.switchTo().window(window);
					break;
				}
			}
		}
		
		
		
		public static WebDriverWait getWaitObject() {
			WebDriverWait wait=new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
			return wait;
		}
		
		
		
		public static void waitForClickibility(WebElement element ) {
			getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
			}
		
	
		public static WebElement waitForVisibility(WebElement element) {
			return getWaitObject().until(ExpectedConditions.visibilityOf(element));
		}
		
		

		public static void click(WebElement element) {
			waitForClickability(element);
			element.click();
		}
		
		public static void scrollToElement(WebElement element) {
			getJSObject().executeScript("arguments[0].scrollIntoView(true);", element);
		}
		
		
		public static JavascriptExecutor getJSObject() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js;
		}
		
		public static void jsClick(WebElement element) {
			getJSObject().executeScript("arguments[0].click();", element);
		}

		
		
		
		
		
		/**public static void selectCalenderDate(List<WebElement> element, String text) {//2 different parameters 
			for(WebElement epickDate:element) {
				if(epickDate.isEnabled()) {
				if(epickDate.getText().equals(text)) {
					epickDate.click();
				}}
			}
		}
		*/
		
		public static WebElement waitForClickability(WebElement element) {
			return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
		}

		

	


	

		

		/**
		 * Method that will scroll the page down based on the passed pixel parameters
		 * 
		 * @param pixel
		 */
		public static void scrollDown(int pixel) {
			getJSObject().executeScript("window.scrollBy(0," + pixel + ")");
		}

		/**
		 * Method that will scroll the page up based on the passed pixel parameters
		 * 
		 * @param pixel
		 */
		public static void scrollUp(int pixel) {
			getJSObject().executeScript("window.scrollBy(0,-" + pixel + ")");
		}


		public static void wait(int second) {
			try {
				Thread.sleep(second * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
}
