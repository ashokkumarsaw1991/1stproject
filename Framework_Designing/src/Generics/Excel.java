package Generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static String getCellValue(String PATH,String sheet,int row,int cell)
	{
		String value="";
		try{
			FileInputStream f=new FileInputStream(PATH);
			Workbook w =WorkbookFactory.create(f);
			value=w.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		}
		catch(Exception e)
		{
			
		}
		return value;
       }

}
