package TestNGPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {

	
	@Test
	public void writeExcel() throws IOException
	{
		FileInputStream fis= new FileInputStream("E://ExcelData.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		int lastrow=sheet.getLastRowNum();
		
		for(int i=0;i<=lastrow;i++)
		{
			
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell= row.createCell(2);
			cell.setCellValue("WriteIntoExcel");
		}
		
		FileOutputStream fos= new FileOutputStream("E://ExcelData.xlsx");
		workbook.write(fos);
		fos.close();
		
			
			
		}
	
}
