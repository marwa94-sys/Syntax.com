package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.record.VCenterRecord;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class FromExcelToMap {
	public static void main(String[] args) throws IOException {
		
		

		String filepath=System.getProperty("user.dir")+"\\testdata\\Test.xlsx";
	    FileInputStream fis= new FileInputStream(filepath);   //Load  the data from excel ---> Now the data is here 
	    Workbook work= new XSSFWorkbook(fis); 
	    Sheet sheet=work.getSheet("Sheet1");  
		
	    //We bringing our objects and loading our sheet
	    
	    int rows=sheet.getPhysicalNumberOfRows();
	    int cols=sheet.getRow(0).getLastCellNum();
	    
	    
	    List<Map<String,String >>listMap= new ArrayList<>();//Every Row will individual Map 
	    //We will need two Nested Loop
	    
	    for(int r=1; r<rows;r++) {
	    	Map<String, String> map=new LinkedHashMap<>();  //Each Row gonna have its Key and values 
	    	for(int c=0;c<cols;c++) {
	    		String key=sheet.getRow(0).getCell(c).toString();
	    		String value=sheet.getRow(r).getCell(c).toString();
	    		map.put(key, value);
	    	}
	    	listMap.add(map);
	    }
		
		
		
		
		System.out.println(listMap);
		
		//OMG
		
		
		
		
		
		
		
	}

}
