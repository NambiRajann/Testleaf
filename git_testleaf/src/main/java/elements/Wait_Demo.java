package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait_Demo {
	@Test(priority = 5)
	public void Wait_Demo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		WebElement elements_icon = driver.findElement(By.xpath("//*[@id=\"menuform\"]/child::ul/li[3]"));
		elements_icon.click();
		// TO click wait icon
		WebElement Wait_icon = driver.findElement(By.partialLinkText("Waits"));
		Wait_icon.click();

		// Wait for Visibility (1 - 10 Sec)
		WebElement Visiblity = driver.findElement(By.xpath("//button[@name=\"j_idt87:j_idt89\"]"));
		Visiblity.click();
		WebDriverWait wait_1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Visiblity_Click = wait_1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='j_idt87:j_idt90']")));
		System.out.println(Visiblity_Click.getText());

		// Wait for Invisibility (1 - 10 Sec)
		WebElement Invisibility = driver.findElement(By.xpath("//button[@name='j_idt87:j_idt92']"));
		Invisibility.click();
		WebElement Invisibility_button = driver.findElement(By.xpath("//button[@name='j_idt87:j_idt93']"));

		WebDriverWait wait_2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean Invisibility_click = wait_2.until(ExpectedConditions.invisibilityOf(Invisibility_button));

		System.out.println(Invisibility_click);

		// Wait for Clickability(1-10 Sec)

		WebElement Click_first = driver.findElement(By.xpath("//button[@name=\"j_idt87:j_idt95\"]"));
		Click_first.click();

		WebElement alert = driver.findElement(By.xpath("//*[@id='j_idt87:growl_container']"));
		WebDriverWait wait_3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait_3.until(ExpectedConditions.visibilityOf(alert));
		wait_3.until(ExpectedConditions.invisibilityOf(alert));
		// Thread.sleep(10000);
		WebElement Click_second = driver.findElement(By.xpath("//*[@id=\"j_idt87:hide3\"]/button"));
		Click_second.click();
		System.out.println(Click_second.getText());

		// id="j_idt87:growl_container"

		// Wait for Text Change (1 - 10 Sec)
		Thread.sleep(2);
		WebElement Text_change = driver.findElement(By.xpath("//button[@name='j_idt87:j_idt98']"));
		Text_change.click();
         
		Thread.sleep(10000);
		WebElement newtext = driver.findElement(By.xpath("//*[@id='j_idt87:hide4']"));
		System.out.print(newtext.getText());
//		WebDriverWait wait_4 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Boolean New_text =  wait_4.until(ExpectedConditions.textToBePresentInElementLocated((By) newtext, "Did you notice?"));
//		System.out.print(newtext.getText());
//	

	}

}
