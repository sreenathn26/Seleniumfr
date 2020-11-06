import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;


import static org.hamcrest.Matchers.*;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

RestAssured.baseURI = "https://rahulshettyacademy.com";
 String s = given().log().all().queryParams("key","qaclick123").body("{\r\n" + 
		"  \"location\": {\r\n" + 
		"    \"lat\": -38.383494,\r\n" + 
		"    \"lng\": 33.427362\r\n" + 
		"  },\r\n" + 
		"  \"accuracy\": 50,\r\n" + 
		"  \"name\": \"Frontline house\",\r\n" + 
		"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
		"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
		"  \"types\": [\r\n" + 
		"    \"shoe park\",\r\n" + 
		"    \"shop\"\r\n" + 
		"  ],\r\n" + 
		"  \"website\": \"http://google.com\",\r\n" + 
		"  \"language\": \"French-IN\"\r\n" + 
		"}\r\n" + 
		"").header("content-type","application/json").when().post("/maps/api/place/add/json").
then().assertThat().statusCode(200).body("scope" ,equalTo("APP")).extract().asString();

//System.out.println(s);

JsonPath news = new JsonPath(s);
String holding = news.getString("scope");
System.out.println("the output is"+ holding);



	}

	
	}


