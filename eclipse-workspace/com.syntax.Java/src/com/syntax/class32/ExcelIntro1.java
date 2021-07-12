package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelIntro1 {
	
	public static void main(String[] args) throws IOException  {
	
		
		String filepath= System.getProperty("user.dir")+"\\testdata\\Test.xlsx";
		FileInputStream fis= new FileInputStream(filepath);
		
		Workbook workb= new XSSFWorkbook(fis);
		
		
		//Accessing to Sheet
		Sheet sheet= workb.getSheet("Sheet1");
		
		//Accessing to Row 
	    Row r2=sheet.getRow(2);
	    
	    //Accessing to Cell
	    Cell cell= r2.getCell(2);
	    
	    //Convert to String
	    String r2cell2=cell.toString();
	    
	    
	    
	    
	   //to print New York   
	    // Lets do it in one line 
	    String r1cell2= sheet.getRow(2).getCell(2).toString();
		System.out.println(r1cell2);
		
		
		
		
		System.out.println("=================================================");
		
		
		
		
		
		
	}

}