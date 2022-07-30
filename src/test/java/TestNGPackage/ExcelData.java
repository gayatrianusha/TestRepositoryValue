package TestNGPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
	
	
	
	@Test
	public void excel() throws IOException
	{
		
		//Read Data from Excel
		FileInputStream fis= new FileInputStream("E://ExcelData.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		XSSFRow row= sheet.getRow(0);
		XSSFCell cell= row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		XSSFRow row1= sheet.getRow(0);
		XSSFCell cell1= row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		XSSFRow row2= sheet.getRow(1);
		XSSFCell cell2=row2.getCell(0) ;
		System.out.println(sheet.getRow(1).getCell(0));
		XSSFRow row3= sheet.getRow(1);
		XSSFCell cell3=row2.getCell(1) ;
		System.out.println(sheet.getRow(1).getCell(1));
	
		
		
		
		
		
		
		
		
	}

}
