package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetExample {

	@Test
	public void testGet()	{
	
	baseURI = "https://reqres.in/api";
	
	given().
	get("users?page=2").
	then().
	statusCode(200).
	body("data[4].first_name",equalTo("George")).
	body("data.first_name", hasItems("George", "Rachel"));
	}
}
