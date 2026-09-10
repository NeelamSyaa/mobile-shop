package configclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class loadConfig {
	public static Properties properties;
	  static FileInputStream file;
	public  static   void datafile1() throws IOException   {
		 // Holds all key-value pairs from config.properties
	    

	
	        properties = new Properties();
	        InputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\mobile-shop\\src\\test\\resource\\config\\config.properties");
	        properties.load(file);
	        
	    }

	    // Returns the value for a given key from config.properties
	    public static String get(String key) {
	        return properties.getProperty(key);
	    }
	    }


