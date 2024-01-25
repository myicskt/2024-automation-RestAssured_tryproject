package api.endPoint;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class LoginEndPoints {
	
	//userEndPoint.java
	//Created for perform Create, Read, Update, Delete Request to the user API
	
	
		public static String createAccessToken() {
		String bearerToken;
		Response response= given()
			.header("Content-Type","application/json")
			.accept(ContentType.JSON)
			.body(new File("src/test/java/api/payload/Jeson.json"))
		.when()
			.post(Routes.login_url);
		
		String responseBody=response.body().asString();
		
		
		JsonPath jp =new JsonPath(responseBody);
		
		bearerToken =jp.getString("access_token");
		
		return bearerToken;
		
	}
	
	@Test
	public void mymethod() {
		String accessToken =LoginEndPoints.createAccessToken();
		
		System.out.print("accessToken : "+accessToken);
		
		
		
		
	}

	
		
	

	
	
	

}
