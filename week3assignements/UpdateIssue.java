package week3assignements;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIssue {
	
	@Test
	public void issueUpdate() {
		//Load URL
		RestAssured.baseURI = "https://janrestapi2023kathir2.atlassian.net/rest/api/2/";
		
		//Authentication
		RestAssured.authentication = RestAssured.preemptive().basic("kathir.e3@gmail.com", "KWaVv2zMWNRQxk6JWgu65F94");
		
		//Prepare request
		RequestSpecification accept = RestAssured.given()
                                      .contentType("application/json")
                                      .body("{\r\n"
                 	                    	+ "    \"fields\": {\r\n"
                		                    + "        \"project\": {\r\n"
                		                    + "            \"key\": \"MT\"\r\n"
                		                    + "        },\r\n"
                		                    + "        \"summary\": \"Update JIRA issue in Rest Assured\",\r\n"
                		                    + "        \"description\": \"Updating of an JIRA issue using project keys and issue type name using RA\",\r\n"
                		                    + "        \"issuetype\": {\r\n"
                		                    + "            \"name\": \"Bug\"\r\n"
                		                    + "        }\r\n"
                		                    + "    }\r\n"
                		                    + "}")
                                           .accept("application/json");
		
		//Send request
		Response put = accept.put("/issue/10408");
		
		//validation
		System.out.println("The Status code is "+ put.getStatusCode());
		put.prettyPrint();
		put.then().assertThat().statusCode(204);
	}

}
