package week3assignements;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteIssue {
	@Test
	public void issueDeletion() {
		
		//Load
		RestAssured.baseURI = "https://janrestapi2023kathir2.atlassian.net/rest/api/2/";
		//Authentication
		RestAssured.authentication = RestAssured.preemptive().basic("kathir.e3@gmail.com", "KWaVv2zMWNRQxk6JWgu65F94");
		//Prepare Request
		RequestSpecification given = RestAssured.given();
		//Send Request
		Response delete = given.delete("issue/10408");
		//Validation
		System.out.println("The Status code is "+ delete.getStatusCode());
		delete.prettyPrint();
		delete.then().assertThat().statusCode(204);
	}

}
