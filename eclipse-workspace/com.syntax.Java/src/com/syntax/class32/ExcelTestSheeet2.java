package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.All;

public class ExcelTestSheeet2 {
	public static void main(String[] args) throws IOException {
		
		
	//	String filepath="C:\\Users\\marwa\\eclipse-workspace\\MyfirstProjectSyntaxClasses\\testdata.xlsx";
		String filepath1=System.getProperty("user.dir")+"\\testdata\\AnotherFile.xlsx";
		FileInputStream fis=new FileInputStream(filepath1);
		
		Workbook workb= new XSSFWorkbook(fis);
		
		
		//To Access to sheet
		Sheet sheet=workb.getSheet("Sheet2");
		
		//To Access to Rows
		int rows=sheet.getPhysicalNumberOfRows();
		
		//To access to columns
		int colls= sheet.getRow(0).getLastCellNum();
		
		
		
		//to get All values
		//Using nested for loop
		for(int r=0;r<rows;r++) {
			for(int c=0;c<colls;c++) {
				String cellval= sheet.getRow(r).getCell(c).toString();
				System.out.print(cellval+"   ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
