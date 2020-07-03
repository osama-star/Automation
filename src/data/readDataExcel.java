package data;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataExcel {

	public Row readExcel(int created, int deleted, int correct) throws IOException{

		FileInputStream file = new FileInputStream (new File(System.getProperty("user.dir")+"\\Pets.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);


	    //Find number of rows in excel file

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it
	    
	    Row row = sheet.getRow(0);
	    
	    for (int i = 1; i < rowCount+1; i++) {
	        row = sheet.getRow(i);
	        if (row.getCell(0).getNumericCellValue() == created 
	        		&& row.getCell(1).getNumericCellValue() == deleted
	        		&& row.getCell(2).getNumericCellValue() == correct)
	        {
	        	
	        	return row;
	        }
	        	
	        }
	    file.close();
	    return row;
	    }  
}
