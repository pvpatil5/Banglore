package pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 
{
	@Test
	public void amazonHome() 
	{
		System.setProperty("webdriver.chrome.driver", "../Banglore/Driver Exe/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		System.out.println("title of the page is="+driver.getTitle());


	}


}
