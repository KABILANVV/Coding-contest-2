package cc2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class qn1 {
  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		ChromeOptions fo = new ChromeOptions();
		fo.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(fo);
  }
  @Test
  public void CC1() throws InterruptedException {
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		WebElement flight=driver.findElement(By.id("booking_engine_flights"));
		flight.click();
		
		WebElement roundtrip=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[1]/ul[1]/li[2]/a"));
		roundtrip.click();
		
    	WebElement from=driver.findElement(By.name("flight_origin"));
    	from.sendKeys(Keys.ENTER);
    	
    	WebElement to=driver.findElement(By.name("flight_origin"));
    	to.sendKeys("Seoul "+Keys.ENTER);
    	
    	WebElement start=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[2]/ul/li[1]/section"));
    	List<WebElement> columns=start.findElements(By.tagName("td"));

    	for (WebElement cell: columns){
    	   //Select 21th Date 
    	   if (cell.getText().equals("21")){
    	      cell.findElement(By.linkText("21")).click();
    	      break;
    	 }
    	}

    	WebElement end=driver.findElement(By.xpath("//*[@id=\"BE_flight_ret_cal\"]/section"));
    	List<WebElement> columns2=end.findElements(By.tagName("td"));

    	for (WebElement cell2: columns2){
    	   //Select 27th Date 
    	   if (cell2.getText().equals("27")){
    	      cell2.findElement(By.linkText("27")).click();
    	      break;
    	 }
    	}

Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"BE_flight_paxInfoBox\"]/i")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/div/div/span[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"flight_class_select_child\"]/ul/li[3]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[3]/div[1]/div[1]/a/i")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"BE_flight_flsearch_btn\"]")).click();
    	
  }
  @AfterTest
  public void afterTest() {
//	  driver.close();
  }
  

}
