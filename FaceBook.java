package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
      
       WebDriver driver= new ChromeDriver();
       driver.get("http://google.com");
	     driver.manage().deleteAllCookies();
	     
	    // driver.navigate().to("http://facebook.com");

	   driver.navigate().to("http://calc.qedgetech.com/");
	   driver.findElement(By.xpath("//*[@value='2']")).click();

	     
	}

}
