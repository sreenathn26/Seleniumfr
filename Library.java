import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.junit.Test;

public class Library {

	@Test
	
	public void addlibrary() {
		
		RestAssured.baseURI = "http://216.10.245.166/";
		String test = given().headers("content-type","application/json").body(Payload.contenttypes())
		.when().post("/Library/Addbook.php").then().assertThat().statusCode(200).
		extract().response().asString();
		
		JsonPath t = Rawtojsonpath.texts(test);
		
		String tst = t.getString("ID");
		
		System.out.println(tst);
	
	}
}
