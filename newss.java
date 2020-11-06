import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
//import junit.framework.*;

import static io.restassured.RestAssured.*;

public class newss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

RestAssured.baseURI = "https://rahulshettyacademy.com";
String s = given().log().all().queryParam("key", "qaclick123").body("{\r\n" + 
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
		"").when().post("/maps/api/place/add/json").then().assertThat().statusCode(200).extract().response().
      asString();
JsonPath t = new JsonPath(s);
String sys = t.getString("place_id");

//PUT response
String test = "New Jersey";

String Test1 = given().log().all().queryParam("key", "qaclick123").headers("content-type", "application/json").body("{\r\n" + 
		"\"place_id\":\""+sys+"\",\r\n" + 
		"\"address\":\"New Jersey\",\r\n" +
		"\"key\":\"qaclick123\"\r\n" + 
		"}\r\n" + 
		"").when().put("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
//Get Response
 String Test4 =  given().log().all().queryParam("Key","qaclick123").queryParam("place_id",sys).when()
.get("/maps/api/place/get/json").then().log().all().extract().response().asString();
JsonPath systemic = new JsonPath(Test4);
String Test2 = systemic.getString("Date");

System.out.println(Test2);
	
	}

}
