// post method of complex json

package API_Class_3_RestAssured.API_Class_3;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post {
	
	
	public static void main(String[] args) {
		
		Address add = new Address();
		add.setHouseno(10);
		add.setWardno(4);
		add.setLandmark("Petrol Pump");
		
		BasicDetails basic = new BasicDetails();
		basic.setFirstname("Jeet");
		basic.setLastname("Ahuja");
		basic.setAge(28);
		basic.setAddress1(add);		
		
		Response res =
				
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.when()
		.post("http://localhost:3000/posts");
		
		System.out.println(res.asString());
		System.out.println(res.statusCode());
		
			
	}
		

}