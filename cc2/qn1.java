package cc2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class qn1 {
  WebDriver driver;
  @Test
  public void f() throws InterruptedException {
 ChromeOptions co=new ChromeOptions();
 co.addArguments("--remote-allow-origins=*");
 WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver(co);
 driver.get("https://www.yatra.com/flights");
 driver.manage().window().maximize();
 Thread.sleep(4000);
 driver.findElement(By.xpath("//*[@id=\"booking_engine_flights\"]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[1]/ul[1]/li[2]/a")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[1]/div/div/ul/div/div/div/li[3]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[3]/div/div/ul/div/div/div/li[4]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_date\"]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"20/04/2023\"]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"BE_flight_arrival_date\"]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"24/04/2023\"]")).click();
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
}
