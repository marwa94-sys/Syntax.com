package Files;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;



public class class01 {
	public static void main(String[] args) throws IOException {
		
		
		String filePath=System.getProperty("user.dir")+"\\Configs1\\file2.properties";
		
		FileInputStream fis= new FileInputStream(filePath);
		
        Properties prop= new Properties();

        prop.load(fis);
        
        
        String nameString = prop.getProperty("name");
        System.out.println(nameString);
        
        String lastnameString= prop.getProperty("lastname");
        System.out.println(lastnameString);
        
        
       Set<Object>keys= prop.keySet();
        
        		for(Object key:keys) {
        			System.out.println(key);
        		}
        
        
        
		
		
		
	}

}
