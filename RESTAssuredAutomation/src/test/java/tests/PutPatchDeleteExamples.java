package tests;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class PutPatchDeleteExamples {
	@Test
	public void testPut() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Elam");
		request.put("job", "QA Manager");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().
			body(request.toJSONString()).
		when().
			put("/users/2").
		then().
			statusCode(200).
		log().all();
	}
}
