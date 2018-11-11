//Patch Method

package API_Class_3_RestAssured.API_Class_3;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Patch {
	
	public static void main(String[] args) {
		
		Data d = new Data();
		d.setTitle("Updated Data");
		
		Response res =
				
		given()
		.contentType(ContentType.JSON)
		.body(d)
		.when()
		.patch("http://localhost:3000/posts/4");
	
		System.out.println(res.asString());
		System.out.println(res.statusCode());
		
	}

}