package stepDefinitions;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utilsResouces.APIResource;
import utilsResouces.testData;
import utilsResouces.utils;

public class APISteps extends utils {

	RequestSpecification res;
	ResponseSpecification resspec;
    Response response;
    testData data = new testData();
    static String userID;
    

    @Given("I send a POST request with Payload {string} {string}")
    public void i_send_a_post_request_with_payload(String email, String pass) throws IOException {
     
        res = given().spec(requestSpecification()).body(data.createUserPayLoad(email, pass));
         
    }
    
    @When("user calls {string} with {string} http request")
    public void user_calls_with_http_request(String path, String method) {
    // Write code here that turns the phrase above into concrete actions
	
	APIResource resourceAPI = APIResource.valueOf(path);
	
	System.out.println(resourceAPI.getResource());
	
	resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	
	if(method.equalsIgnoreCase("POST"))
	 response =res.when().post(resourceAPI.getResource());
	else if(method.equalsIgnoreCase("GET"))
		 response =res.when().get(resourceAPI.getResource());
	
	}

    @Then("the API response status should be {int}")
    public void the_api_response_status_should_be(int statusCode) {
        assertEquals(response.statusCode(), statusCode);
    }


@Then("the API response should contain the token")
public void the_api_response_should_contain_the_token() {
    // Write code here that turns the phrase above into concrete actions
        assertNotNull(response.jsonPath().get("token"));
        userID=response.jsonPath().get("token");
    }
}
