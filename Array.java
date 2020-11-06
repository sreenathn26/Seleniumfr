import io.restassured.path.json.JsonPath;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonPath test = new JsonPath(Payload.tester());
		 int totalamount = test.getInt("courses.size()");
		 System.out.print(totalamount);
		 
		 String t = test.get("courses[0].title");
		 System.out.println(t);
		 
		 String tests = test.getString("courses[1].copies");
		 System.out.println(tests);
		 
		 String tester = test.getString("dashboard.website");
		 System.out.println(tester);
		 
		 System.out.println("Give total copies of RPA");
		 int testers =0;
		 for(int i=0;i<totalamount;i++)
		{
           String str = test.get("courses["+i+"].title");		 
			if (str.equals("RPA"))
			testers++;
			}
		System.out.println(testers);
		
		 
		 
			 
	}

}
