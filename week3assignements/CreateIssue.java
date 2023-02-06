package week3assignements;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIssue {
	
	@Test
	public void issueCreation() {
		//Load URL
		RestAssured.baseURI = "https://janrestapi2023kathir2.atlassian.net/rest/api/2/";
		
		//Authentication
		RestAssured.authentication = RestAssured.preemptive().basic("kathir.e3@gmail.com", "KWaVv2zMWNRQxk6JWgu65F94");
		
		//Construct request
		RequestSpecification accept = RestAssured.given()
				                      .contentType("application/json")
				                      .body("{\r\n"
				                      		+ "    \"fields\": {\r\n"
				                      		+ "        \"project\": {\r\n"
				                      		+ "            \"key\": \"MT\"\r\n"
				                      		+ "        },\r\n"
				                      		+ "        \"summary\": \"create JIRA issue in Rest Assured\",\r\n"
				                      		+ "        \"description\": \"Creating of an JIRA issue using project keys and issue type name using RA\",\r\n"
				                      		+ "        \"issuetype\": {\r\n"
				                      		+ "            \"name\": \"Bug\"\r\n"
				                      		+ "        }\r\n"
				                      		+ "    }\r\n"
				                      		+ "}")
				                      .accept("application/json");
				
		//Send request
		Response response = accept.post("issue");
				
		System.out.println("The Status code is "+ response.getStatusCode());
		response.prettyPrint();
		response.then().assertThat().statusCode(201);
	}

}
