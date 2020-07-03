package data;
import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDataExcel {

	public void writeExcel(int rownum) throws IOException{

		FileInputStream file = new FileInputStream (new File(System.getProperty("user.dir")+"\\Pets.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);


	    //Find number of rows in excel file

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it
	    
	    Row row = sheet.getRow(rownum);
	    
	    Cell cell = row.createCell(0);

        cell.setCellValue((int)1);
        
        file.close();
	}
}
