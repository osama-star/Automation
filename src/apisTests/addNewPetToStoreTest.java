package apisTests;

import java.awt.TextArea;
import java.io.IOException;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import apis.addNewPetToStoreRequest;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class addNewPetToStoreTest {
	
	public Response PostNewPetToStore(int created, int deleted, int correct) throws IOException
	{
		 // Specify the base URL to the RESTful web service
		 RestAssured.baseURI = "https://petstore.swagger.io/v2";
		 
		 // Get the RequestSpecification of the request that you want to sent
		 // to the server. The server is specified by the BaseURI that we have
		 // specified in the above step.
		 RequestSpecification request = RestAssured.given();
		 
		 // Map values to JSON Request 
		 JSONObject requestObject = new JSONObject();
		 addNewPetToStoreRequest obj = new addNewPetToStoreRequest();
		 requestObject = obj.addNewPetToRequest(created,deleted,correct);
		 
		// Add a header stating the Request body is a JSON
		 request.header("Content-Type", "application/json");
		  
		 // Add the Json to the body of the request
		 request.body(requestObject.toJSONString());
		  
		 // Post the request and check the response
		 Response response = request.post("/pet");
		 
		 
		 return response;
	}
}
