package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
		
		
		String filepath=System.getProperty("user.dir")+"\\testdata\\Test.xlsx";
		FileInputStream fis= new FileInputStream(filepath);
		
		
		//Accessing Workbook
		  Workbook workb=new XSSFWorkbook(fis);
		  
		  
		  //Accessing sheet
	      Sheet sheet=workb.getSheet("Sheet1");
	      
	      
	      //Accessing row
		  Row row1=sheet.getRow(0);
		  
		  
		  //Sccessing cell 
		  Cell cell=row1.getCell(1);
		  
		  
		  //Get value from cell*/
		  String r1cell2= cell.toString();
		  System.out.println(r1cell2);//Retrieving LastName
		  
		  
		  //To retrieve values based on type
		  double cell1 =sheet.getRow(1).getCell(4).getNumericCellValue();
		  System.out.println((int)cell1);//How to cast to int type 
		  
		  
		  //How to retrieve 20153 in a String Format
		  
		 String valC= sheet.getRow(1).getCell(4).toString();
		 System.out.println(valC);
		 String [] arr =valC.split("\\.");
		 System.out.println(arr[0]);
		
		
	}
}
