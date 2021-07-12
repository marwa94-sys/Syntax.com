package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelUtility {

	
	public static Workbook book;
	public static Sheet sheet;
	public static FileInputStream fileIS;
	
	public static void openExcel(String filePath) {
	
		
		try {
			fileIS =new FileInputStream( filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void loadSheet(String sheetName) {
		try {
			sheet=book.getSheet(sheetName);
		} catch (NullPointerException e) {
		e.printStackTrace();
		}
		
	}	
	
	public static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}
	
	public static int colsCount(int row) {
		
	    //Row row = sheet.getRow(row);
	    return sheet.getRow(row).getLastCellNum();
	}
	
	public static String celData( int rowIndex, int colIndex) {
		
		return sheet.getRow(rowIndex).getCell(colIndex).toString();
	}
	
	
	//Return a 2d object array of data 
	
	public static Object [][] excelIntroArray(String filePath,String sheetName){
		
		openExcel(filePath);
		loadSheet(sheetName);
		
		int rows=rowCount();
		int cols=colsCount(0);
		Object [] [] data=  new Object[rows-1][cols];//[rows-1] cause we're storing just 3 rows without the header
		
		//iterating rows
		for(int i=1;i<rows;i++) {
			for(int c=0;c<cols;c++) {
				data [i-1][c]=celData(i, c);// [i-1]---> So the first value that comes it goes directly to the first row to our 2D array 
				
			}
		}
		return data;
		
	}
		
	        
	
	
	
	
	
	
}
