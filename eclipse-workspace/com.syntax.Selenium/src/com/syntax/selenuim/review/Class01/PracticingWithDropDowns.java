package com.syntax.selenuim.review.Class01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class PracticingWithDropDowns extends BaseClass {
	public static void main(String[] args) {
		
		setUp();
		
		List<WebElement>allDD=driver.findElements(By.tagName("a"));
		for(WebElement oneDD:allDD) {
		String dd=oneDD.getText();
		System.out.println(dd);
		
		if(dd.equals("List Box")) {
			oneDD.click();}
			if(dd.equals("Bootstrap List Box")) {
				oneDD.click();
				break;
		}}
		
		List<WebElement>ListOfdd=driver.findElements(By.tagName("li"));
		for(WebElement DD:ListOfdd) {
			String textOfDD=DD.getText();
			System.out.println(textOfDD);
			
			/*if(textOfDD.equals("Bootstrap List Box")) {
				DD.click();*/
				   if(textOfDD.equals("Dapibus ac facilisis in")) {
					DD.click();
					break;
				
				}
		}}
		
		
		
		
		
		
	}


