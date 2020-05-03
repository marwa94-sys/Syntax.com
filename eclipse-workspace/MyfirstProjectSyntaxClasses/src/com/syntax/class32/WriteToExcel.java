package com.syntax.class32;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
	public static void main(String[] args) throws IOException {
		
		
		String filepath=System.getProperty("user.dir")+"\\testdata\\Test.xlsx";
	FileInputStream fis= new FileInputStream(filepath);   //Load  the data from excel ---> Now the data is here 
	
	Workbook work= new XSSFWorkbook(fis); //object of Workbook cause Workbook interface and has A lot of  overload constructors 
	
	//Writing into existing sheet
	Sheet sheet1=work.getSheet("Sheet1"); //Should make sure get it from ss package 
	//once we grape the Sheet =====> the hierarchy====>  Workbook interface inside Workbook we have Sheet==> Inside sheet we have Rows ===> inside rows we have cells  
	
	
	sheet1.getRow(0).createCell(5).setCellValue("Country");
	sheet1.createRow(3).createCell(0).setCellValue("Alma");
	
	
    //To create new Sheet===>>Sheet can Access from WorkBook --> Sheet--> Row --> Cell
	 Sheet customSheet=work.createSheet("Testsheet");
	 
	 FileOutputStream fos= new FileOutputStream(filepath);
	 work.write(fos);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
