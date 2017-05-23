import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SecondTest {
	
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
		driver.navigate().to("https://www.youtube.com/watch?v=CRvwKHUVJTQ&list=PL_noPv5wmuO-oOO2-czJsqVbPAKnmT_7h&index=2");
		String getTitle = driver.getTitle();
		Assert.assertTrue(getTitle.contains("Jenkins Tutorial "));
	}

}
