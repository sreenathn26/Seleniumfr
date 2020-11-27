import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;		
import java.util.Set;
public class Mobomo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreen\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mep-go-staging.lecet.org/login");
		driver.findElement(By.name("email")).sendKeys("anuja+sa@mobomo.com");
		driver.findElement(By.name("password")).sendKeys("mobomo2");
		driver.findElement(By.xpath("//button[contains(text(),'LOG IN')]")).click();
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[contains(text(),'My MEP')]")).click();
		driver.navigate().to("https://mep-go-staging.lecet.org/contractors/pendingContractors");
		driver.navigate().to("https://mep-go-staging.lecet.org/contractor-information/profile/1144");
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/section[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
        Alert alert = driver.switchTo().alert();
        //String alertmessage = driver.switchTo().alert().getText();
        //System.out.println("alertmessage");
        alert.dismiss();
            }
		
		
		
		
        
	}
	



