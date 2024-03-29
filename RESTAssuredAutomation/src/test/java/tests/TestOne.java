package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.Assert;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestOne {

	@Test
	
	public void test_1() {
		
		baseURI = "https://reqres.in/api";
		given().
		get("/users?page=2").
		then().
		statusCode(200).
		body("data[1].id", equalTo(8));
		
		System.out.println();
		
	}
	
	@Test
	public void test_2() {
		
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.statusCode());
		System.out.println(response.getBody().asString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
