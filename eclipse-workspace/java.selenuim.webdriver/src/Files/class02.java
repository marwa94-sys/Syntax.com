package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class class02 {
	//WRITE TO PROPERTIES FILE 
	
 public static void main(String[] args) throws IOException {
	

 
    String filePath=System.getProperty("user.dir")+"\\Configs1\\file2.properties";
    
    
  //  FileInputStream fis= new FileInputStream(filePath);
    
    Properties prop= new Properties();
    
    //prop.load(fis);   //load the existing data 
    
    prop.setProperty("PhoneNumber", "123456789");
    
    FileOutputStream fos =new FileOutputStream(filePath);
    
    prop.store(fos," Added Additional Key");
    
    
    
    
    
 
 
 
 
 
 
 }
}
