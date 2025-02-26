package testNG;

import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;



public class SampleTestCase {


	@Test

	
	public void test_1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/run-parallel-test-cases-in-testng");
	}
	
	@Test
	public void test_2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=fLZO03_TBQU&list=PLLS0D9-W-1dmC4VKY5S98IWze7Z_SuOkn&index=9");
	}
	
}
