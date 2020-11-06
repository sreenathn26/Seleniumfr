import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;


public class Rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	RestAssured.baseURI = "https://rahulshettyacademy.com";
	String repo = given().log().all().queryParam("Key", "qaclick123").header("content-Type","application/json")
	.body(staticss.addplace()).when().post("/maps/api/place/add/json").
	then().assertThat().statusCode(200)
	.header("server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
	
	System.out.println(repo);
	JsonPath t = new JsonPath(repo);
 String S = t.getString("reference");
	System.out.println(S);
	
	
}

}
