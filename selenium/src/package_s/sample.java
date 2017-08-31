package package_s;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("http://www.facebook.com");
		driver.get("https://eenadupellipandiri.net/register");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement var = driver.findElement(By.id("name"));
		var.sendKeys("prathibha");
		driver.findElement(By.name("name")).clear();//clear all data
        
		driver.findElement(By.linkText("Register Now")).click();
		
		driver.findElement(By.partialLinkText("Contact")).click();
		
		List<WebElement> lst=driver.findElements(By.tagName("a"));
		for(int i=0;i<lst.size();i++)
		{
			String str = lst.get(i).getText();
			System.out.println(str);
		}
	}

}
