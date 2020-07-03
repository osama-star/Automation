package apis;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import data.readDataExcel;
import data.writeDataExcel;

public class addNewPetToStoreRequest {
	
	
	public JSONObject addNewPetToRequest(int created, int deleted, int correct) throws IOException
	{
		
		// Get Data from excel according to Test Case
		readDataExcel getrow = new readDataExcel();
		
		Row row = getrow.readExcel(created, deleted, correct);
	    //// add values
		String id = row.getCell(3).getStringCellValue(); 
		String catid = row.getCell(4).getStringCellValue(); 
		String catname = row.getCell(5).getStringCellValue(); 
		String name = row.getCell(6).getStringCellValue();
		String photo = row.getCell(7).getStringCellValue();
		String tagsid = row.getCell(8).getStringCellValue();
		String tagsname = row.getCell(9).getStringCellValue();
		String status = row.getCell(10).getStringCellValue();//Map status with specific values [ available, pending, sold ]
			 
		//Map POST Request "Add a new pet to the store" to a JSON Object
		
		//Create Main JSON Object
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("id", id); //Map id
		
		// Create a sub JSON object to map Category
		JSONObject categoryitems = new JSONObject();
		categoryitems.put("id", catid); //Map id
		categoryitems.put("name", catname); //Map name
		
		//add Category object to main JSON object 
		requestParams.put("category", categoryitems);
		
		
		requestParams.put("name", name); //Map name
		
		//Map photo array
		JSONArray photoarray = new JSONArray();
		photoarray.add(photo);
		requestParams.put("photoUrls", photoarray); 
		
		// Create a sub JSON object to map tags
		JSONObject tagsitems = new JSONObject();
		tagsitems.put("id", tagsid);//Map id
		tagsitems.put("name", tagsname);//Map name
		
		// Create an array to add tags object to it 
		JSONArray tags = new JSONArray();
		tags.add(tagsitems);
		
		//add array to main JSON object 
		requestParams.put("tags", tags);
		
		requestParams.put("status", status);//Map status with specific values [ available, pending, sold ]
		
		writeDataExcel setrow = new writeDataExcel();
		setrow.writeExcel(row.getRowNum());
		
		return requestParams;

	}
}
