package api.endPoint;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import api.payload.UserAccountPojo;
import io.restassured.http.ContentType;

public class UserAccountEndPoint {
	static String access_token;

	public UserAccountEndPoint(){
		access_token= LoginEndPoints.createAccessToken();
		
	}
	
	
	
		//userEndPoint.java
		//Created for perform Create, Read, Update, Delete Request to the user API
		
	public static Response createAccount(UserAccountPojo payload) {

		Response response = 
				given()
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body(payload)
				.when()
					.post(Routes.create_url);
		return response;

	}

	
	
	public static void readAccount(int userid) {
		
		
		
		
		//return response;
	}
	
	@Test

	public void readAllAccount() {
		
				given()
				.header("Content-Type","application/json")
				.header("Authorization","Bearer "+access_token)
					.contentType(ContentType.JSON)
				.when()
					.get(Routes.getAll_url)
				.then().log().all();
		//return response;
	}
	
	
	
	public static Response updateAccount(UserAccountPojo payload) {
		Response response =
			given().contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
			.when()
				.put(Routes.update_url);
		return response;
	}
	public static Response deleteAccount(Long payload) {
		Response response =
			given().contentType(ContentType.JSON)
				.accept(ContentType.JSON)
			.when()
				.delete(Routes.deleteOne_url);
		return response;
	}

}
