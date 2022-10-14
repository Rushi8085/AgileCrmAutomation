package com.AgileCrmAutomation;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtil1
{
	 static Workbook wb; 
	public static void main(String[] args) throws IOException {
			String filepath= "D:\\Selenium\\AutomationTestData.xlsx";
			String extension =filepath.substring(filepath.indexOf(".")); 
			 System.out.println(extension); 
			 FileInputStream input=new FileInputStream(filepath);
			 if(extension.equals(".xlsx"))
			 { 
				wb=new XSSFWorkbook (input);
			 }
			else 
			{
				wb=new HSSFWorkbook (input); 
			}

			 Sheet sheet=wb.getSheet("LogintestData");
			 int totalRows=sheet.getPhysicalNumberOfRows();
			 int totalColumns=sheet.getRow(0).getPhysicalNumberOfCells(); 

			for(int i=1;i<totalRows;i++){
				Row row=sheet.getRow(i);

			for(int j=0;j<totalColumns;j++){
				Cell CELL=row.getCell(j);
			String value=CELL.getStringCellValue();
			System.out.print(value);
			}
			System.out.println();
			}
	}
}