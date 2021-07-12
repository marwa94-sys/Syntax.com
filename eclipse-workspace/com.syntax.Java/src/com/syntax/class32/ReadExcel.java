package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.SheetBuilder;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		String filepath="C:\\Users\\marwa\\Documents\\Test.xlsx";
	    FileInputStream fis=new  FileInputStream(filepath);
	    
	    
	    //Get an object of workbook type
	    //Workbook Interface
	    Workbook book= new XSSFWorkbook(fis);
	   Sheet sheet=book.getSheet("Sheet1");
	   
	   //To find numbers of rows
	   int rows= sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
	   
	   
		//To find numbers of columns
    	int colls=  sheet.getRow(0).getLastCellNum();
	    System.out.println(colls);
    	
    	//To get Data from all rows all columns
    	for(int r=0;r<rows;r++)//Iterate over rows
        { for(int c=0;c<colls;c++) //Iterate over columns 
        { // to Access the data 
        String str=	sheet.getRow(r).getCell(c).toString();
        System.out.print(str+" ");
        	
        }
    		System.out.println();
    	}
		
		
		
	}

}
