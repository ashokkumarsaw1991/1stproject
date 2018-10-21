package Generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {
	public static String propertyFile(String PATH1,String url)
	{
		String url1="";
		try {
			Properties p=new Properties();
			p.load(new FileInputStream(PATH1));
		 url1=p.getProperty(url);
		System.out.println(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return url1;
	}

}
