package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTests {
	WebDriver driver = new ChromeDriver();
	//System.setProperty("ChromeDriver", "C:\\Users\\sreen\\Downloads\\chromedriver_win32");
	Actions test = new Actions(driver);
	
	
  @AfterTest
  public void aftertest1() {
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.close();
  }
 @Test
 public void aftertest() throws InterruptedException {
	  System.setProperty("ChromeDriver", "C:\\Users\\sreen\\Downloads\\chromedriver_win32");
	  driver.get("https://www.google.co.in/?gfe_rd=cr&ei=PuyJU4XmBqzM8geL6ICQAg");
	  driver.manage().window().maximize();
	  WebElement tester = driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[3]/center[1]/input[1]"));
	  Action tests =  test.contextClick(tester).build();
	  tests.perform();
	  Thread.sleep(10000);
	  // driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
  }
  //@BeforeTest
  //public void beforetest(){
	//  System.setProperty("ChromeDriver", "C:\\Users\\sreen\\Downloads\\chromedriver_win32");
	//  driver.get("https://www.google.co.in/?gfe_rd=cr&ei=PuyJU4XmBqzM8geL6ICQAg");
	//  driver.manage().window().maximize();
	//  driver.findElement(By.name("q")).sendKeys("Nissan");
  }
 
  

