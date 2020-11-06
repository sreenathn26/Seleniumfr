import org.junit.Test;

import io.restassured.path.json.JsonPath;

public class sums {
	
	@Test
	public void sumofbooks()
	{
		JsonPath tes = new JsonPath(Payload.tester());
		int totalamount = tes.getInt("dashboard.purchaseAmount");
		System.out.println(totalamount);
		int suming=0;
		
		int total = tes.getInt("courses.size()");
		for (int i=0;i<total;i++)
		{
			int price = tes.getInt("courses["+i+"].price");
			int copy = tes.getInt("courses["+i+"].copies"); 
			int total1 = price*copy;
			suming = suming+total1;
			
		}
	if (suming == totalamount)
	{
		System.out.println("Correct");
	}
		else {
			System.out.println("Not correct");
		}
			
	
		
	}
	
	
	
	

}
