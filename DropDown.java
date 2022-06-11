package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
	//	Thread.sleep(2000);
		
		List<WebElement> keywordlist = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		System.out.println(keywordlist.size());
		
		for(int i=0;i<keywordlist.size();i++)
		{
			String keyword = keywordlist.get(i).getText();
			System.out.println(keyword);
		}
	}

}
