package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Configdataprovider {
	
Properties pro;
public Configdataprovider() throws Exception
{

FileInputStream fis=new FileInputStream(System.getProperty("C:\\Softwares\\Subaru\\config.properties"));
 pro=new Properties();
 pro.load(fis);
}


public String getDataFromConfig(String keyToSearch) {
	return pro.getProperty(keyToSearch);	
}

public String geturl()
{
return pro.getProperty("url");
}

}
