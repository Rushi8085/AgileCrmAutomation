package com.AgileCrmAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.NotFoundException;

//import com.github.dockerjava.api.exception.NotFoundException;

public class ExcelUtil
{
	private String getFileExtention(String filepath)
	{
		String extention = filepath.substring(filepath.indexOf("."));
		System.out.println(extention);
		return extention;
	}



   private Workbook getWorkbookInstance(String filepath) throws IOException
   {
	   Workbook wb;
	   FileInputStream input=new FileInputStream(filepath);
		 if(getFileExtention(filepath).equals("xlsx."))
		 { 
			wb=new XSSFWorkbook (input);
		 }
		else 
		{
			wb=new HSSFWorkbook (input); 
		}
		 
		 return wb;
	 
   }
   
   
   private Sheet getSheet(String filepath,String sheetName)
   { Sheet sheet=null;
	   try {
		Workbook wb = getWorkbookInstance(filepath);
		
		sheet=wb.getSheet(sheetName);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	   
	   return sheet;
   }
   
   public Object[][] getExcelData(String filepath, String sheetName)
   {
	   Sheet sheet = getSheet(filepath,sheetName);
	  int totalRow = sheet.getPhysicalNumberOfRows();
	  int totalColumn = sheet.getRow(0).getPhysicalNumberOfCells();
	  return getCellValue(sheet,totalRow ,totalColumn);
   }
   
private Object[][] getCellValue(Sheet sheet, int totalRows, int totalColumns)
{
	Object[][] value = new Object [totalRows][totalColumns];
	for(int i=1;i<totalRows;i++)
	{
		Row row = sheet.getRow(i);
		
		for(int j=0;j<totalColumns;j++)
		{
			Cell cell = row.getCell(j);
			
			CellType type = cell.getCellType();
			
			switch(type)
			{
			case STRING :
				
				value[i][j]= cell.getStringCellValue();
				break;
				
			case NUMERIC :
				value[i][j]= cell.getNumericCellValue();
				break;
				
              
			case _NONE :
				value [i][j]=null;
				break;

			default :
				value [i][j]= null;			
				
			}
		}
	}
	
	return value;
}

public static void main(String[]args) throws IOException
   {
	String filepath= "D:\\Selenium\\AutomationTestData.xlsx";
	ExcelUtil excelValue = new ExcelUtil();
	
	Object[][] data =excelValue.getExcelData(filepath, "LoginTestData");
	
	int rowLength=data.length;
	int CoumnLength=2;
	for(int i=1; i<rowLength-1;i++)
	{
		
		for(int j=0;j<CoumnLength;j++)
		{
		 System.out.println(data[i][j]);	
		}
		
	}
	}
	

}


















