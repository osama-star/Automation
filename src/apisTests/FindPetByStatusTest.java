package apisTests;



import io.restassured.RestAssured;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FindPetByStatusTest {

	public Response FindPetByStatus(String status)
	{
		 // Specify the base URL to the RESTful web service
		 RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";
		 
		 // Get the RequestSpecification of the request that you want to sent
		 // to the server. The server is specified by the BaseURI that we have
		 // specified in the above step.
		 RequestSpecification request = RestAssured.given();

		 // Add a header stating the Request body is a JSON
		 request.header("Content-Type", "application/json");
		  
		  
		 // Post the request and check the response
		 Response response = request.queryParam("status", status).get("/findByStatus");
		 
		 
		 return response;
	}
}
