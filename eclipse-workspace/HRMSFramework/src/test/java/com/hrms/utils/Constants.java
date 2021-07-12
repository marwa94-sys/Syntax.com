package com.hrms.utils;

public class Constants {
	

	//Creating own frame work  
    //The path of properties file, xfile, drivers, reports ----->Reading the path of property File 

				public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+ "\\src\\test\\resources\\drivers\\chromedriver.exe";
					
				public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe";
				    
				public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\configs\\configuration.properties";  //----->Reading the path of property File 
                
				public static final int  IMPLICIT_WAIT_TIME=10;//Don't make too long  
				
				public static final int EXPLICIT_WAIT_TIME=30;//only specific element 

                public static final String TESTDATA_FILEPATH= System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\TestData.xlsx";

                public static final String REPORT_FILEPATH = System.getProperty("user.dir")+"\\target\\html-report\\HRMS.html";
                public static final String SCHEENSHOT_FILEPATH= System.getProperty("user.dir")+"\\screenshot\\";
                

}

//Need method to  initialize and open browser


                       //We store our password and information in properties file //Excel for testing Data


//We need a methods to read and extract properties






















