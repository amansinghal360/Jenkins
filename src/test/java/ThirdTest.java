import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ThirdTest {
	
	private WebDriver driver;
	
	@Before	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	
	@After
	public void tearDown(){ 
		driver.quit();
	}
	
	@Test
	public void shouldLoadFirstPage()
	{
		driver.navigate().to("http://www.amazon.in/");
		String getTitle = driver.getTitle();
		System.out.println("aman"+driver.getTitle());
		Assert.assertTrue(getTitle.contains("Online Shopping"));
	}

}
