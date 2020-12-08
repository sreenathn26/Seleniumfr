package testing;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testing {

	
WebDriver driver = new ChromeDriver();


		
@Test 
public void test2() throws InterruptedException {
	driver.get("https://mep-go-staging.lecet.org/discover");
	driver.manage().window().maximize();
	driver.findElement(By.name("email")).sendKeys("karandeep@mobomo.com");
	driver.findElement(By.name("password")).sendKeys("mobomo2");
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/div[2]/div[3]/button[1]")).click();
	//driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/section[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/li[3]/button[1]")).click();		
	Select teest = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/section[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/li[3]/button[1]")));
	teest.selectByVisibleText("Engineering");
	Thread.sleep(1000);
		}
		

	

	
		
	}

	


