package apisTests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.response.Response;


public class masterTest {
	
	@Test(priority = 0, description = "Add New Pet To Store")
	public void PostNewPetToStore() throws IOException
	{
		// read from excel when created =0, deleted =0, correct =1 while 0 = false and 1 = true
		int created = 0;
		int deleted = 0;
		int correct = 1;
		
		//Call the test class
		addNewPetToStoreTest obj = new addNewPetToStoreTest();
		Response testresponse;
		testresponse = obj.PostNewPetToStore(created,deleted,correct);
		
		// Now let us print the body of the message to see what response
	    // we have received from the server
		System.out.println("Response Body:  " + testresponse.body().asString());
				 
		//Validate the correct code 
		int statusCode = testresponse.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test(priority = 1, description = "Add Invalid Pet To Store")
	public void NegativePostInvalidPetToStore() throws IOException
	{
		// read from excel when created =0, deleted =0, correct =0 while 0 = false and 1 = true
		int created = 0;
		int deleted = 0;
		int correct = 0;
		
		//Call the test class
		addNewPetToStoreTest obj = new addNewPetToStoreTest();
		Response testresponse;
		testresponse = obj.PostNewPetToStore(created,deleted,correct);
				
		// Now let us print the body of the message to see what response
		// we have received from the server
		System.out.println("Response Body:  " + testresponse.body().asString());
						 
		//Validate the correct code 
		int statusCode = testresponse.getStatusCode();
		Assert.assertEquals(statusCode, 405);
	}
	
	@Test(priority = 2, description = "Find Pet By Status with correct status value")
	public void FindPetByStatus()
	{
		//Call the test class
		FindPetByStatusTest obj = new FindPetByStatusTest();
		Response testresponse;
		// set here the correct status desired  with specific values [ available, pending, sold ]
		testresponse = obj.FindPetByStatus("available");
		
		// Now let us print the body of the message to see what response
	    // we have received from the server
		System.out.println("Response Body:  " + testresponse.body().asString());
				 
		//Validate the correct code 
		int statusCode = testresponse.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test(priority = 3, description = "Find Pet By Status with wrong status value")
	public void NegativeFindPetByWrongStatus()
	{
		//Call the test class
		FindPetByStatusTest obj = new FindPetByStatusTest();
		Response testresponse;
		// set here the wrong status
		testresponse = obj.FindPetByStatus(null);
		
		// Now let us print the body of the message to see what response
	    // we have received from the server
		System.out.println("Response Body:  " + testresponse.body().asString());
				 
		//Validate the correct code 
		int statusCode = testresponse.getStatusCode();
		Assert.assertEquals(statusCode, 400);
	}
	
	@Test(priority = 4, description = "Find Pet By ID value")
	public void FindPetByID()
	{
		//Call the test class
		FindPetByIDTest obj = new FindPetByIDTest();
		Response testresponse;
		// set here the correct ID
		testresponse = obj.FindPetByID("928");
		
		// Now let us print the body of the message to see what response
	    // we have received from the server
		System.out.println("Response Body:  " + testresponse.body().asString());
				 
		//Validate the correct code 
		int statusCode = testresponse.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test(priority = 5, description = "Find Pet By wrong ID value")
	public void NegativeFindPetByWrongID()
	{
		//Call the test class
		FindPetByIDTest obj = new FindPetByIDTest();
		Response testresponse;
		// set here the wrong ID with any string value for example
		testresponse = obj.FindPetByID("Wrong");
		
		// Now let us print the body of the message to see what response
	    // we have received from the server
		System.out.println("Response Body:  " + testresponse.body().asString());
				 
		//Validate the correct code 
		int statusCode = testresponse.getStatusCode();
		Assert.assertEquals(statusCode, 400);
	}
	
	@Test(priority = 6, description = "Find Pet By ID value that is not found/exists")
	public void FindPetByNonexistID()
	{
		//Call the test class
		FindPetByIDTest obj = new FindPetByIDTest();
		Response testresponse;
		// set here with any ID that does not exists
		testresponse = obj.FindPetByID("13245678");
		
		// Now let us print the body of the message to see what response
	    // we have received from the server
		System.out.println("Response Body:  " + testresponse.body().asString());
				 
		//Validate the correct code 
		int statusCode = testresponse.getStatusCode();
		Assert.assertEquals(statusCode, 404);
	}
	
	@Test(priority = 7, description = "Delete Pet By ID")
	public void DeletePetByID()
	{
		//Call the test class
		DeletePetByIDTest obj = new DeletePetByIDTest();
		Response testresponse;
		// set here with correct ID
		testresponse = obj.DeletePetByID("474");
		
		// Now let us print the body of the message to see what response
	    // we have received from the server
		System.out.println("Response Body:  " + testresponse.body().asString());
				 
		//Validate the correct code 
		int statusCode = testresponse.getStatusCode();
		Assert.assertEquals(statusCode, 404);
	}
	
	@Test(priority = 8, description = "Delete Pet By wrong ID value")
	public void NegativeDeletePetByWrongID()
	{
		//Call the test class
		DeletePetByIDTest obj = new DeletePetByIDTest();
		Response testresponse;
		// set here with wrong ID 
		testresponse = obj.DeletePetByID("Wrong");
		
		// Now let us print the body of the message to see what response
	    // we have received from the server
		System.out.println("Response Body:  " + testresponse.body().asString());
				 
		//Validate the correct code 
		int statusCode = testresponse.getStatusCode();
		Assert.assertEquals(statusCode, 400);
	}
	
	@Test(priority = 9, description = "Delete Pet By ID value that is not found/exists")
	public void FindDeleteByNonexistID()
	{
		//Call the test class
		DeletePetByIDTest obj = new DeletePetByIDTest();
		Response testresponse;
		// set here with any ID that does not exists
		testresponse = obj.DeletePetByID("13245678");
		
		// Now let us print the body of the message to see what response
	    // we have received from the server
		System.out.println("Response Body:  " + testresponse.body().asString());
				 
		//Validate the correct code 
		int statusCode = testresponse.getStatusCode();
		Assert.assertEquals(statusCode, 404);
	}
}
