package data;
import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDataExcel {

	public void writeExcel(int rownum) throws IOException{

		FileInputStream file = new FileInputStream (new File(System.getProperty("user.dir")+"\\Pets.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
	    
	    // update the cell in specified row 
	    Row row = sheet.getRow(rownum);
	    
	    Cell cell = row.createCell(0);

        cell.setCellValue((int)1);
        
        workbook.close();
        file.close();
	}
}
