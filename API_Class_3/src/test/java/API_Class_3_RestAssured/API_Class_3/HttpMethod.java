//Put Method

package API_Class_3_RestAssured.API_Class_3;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpMethod {
	
	public static void main(String[] args) {
		
		Data d = new Data();
		d.setTitle("Updated Data");
		
		Response res =
				
		given()
		.contentType(ContentType.JSON)
		.body(d)
		.when()
		.put("http://localhost:3000/posts/5");
		
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		
		
	}
	
}