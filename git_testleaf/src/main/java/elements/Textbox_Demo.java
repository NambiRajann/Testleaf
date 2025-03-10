package elements;

import java.sql.DriverAction;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.g;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.domsnapshot.model.TextBoxSnapshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Global;

public class Textbox_Demo extends Home_page {

	WebDriver driver = new ChromeDriver();

	@Test(priority = 1)
	public void Textbox_Demo() {

		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0s7e2lqh88y431cyymrnwri7j18770251.node0");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Actions action = new Actions(driver);

//		// To click the elements icon
//		WebElement elements_icon = driver.findElement(By.xpath("//*[@id=\"menuform\"]/child::ul/li[3]"));
//		elements_icon.click();
//
//		// TO open text box page
//		WebElement texboxElement = driver.findElement(By.id("menuform:m_input"));
//		texboxElement.click();

		// To enter the name
		WebElement name = driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("selenium");
		System.out.println(name.getAttribute("value"));
		// To enter the city name
		WebElement city = driver.findElement(By.id("j_idt88:j_idt91"));
		city.sendKeys(" - Sholiganlur");

		// Verify if text box is disabled
		WebElement disabled_textboxElement = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean results = disabled_textboxElement.isEnabled();
		System.out.println(results);

		// Clear the typed text.
		WebElement cleartextboxElement = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']"));
		cleartextboxElement.clear();

		// Retrieve the typed text.
		WebElement retrive_text = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']"));
		String string = retrive_text.getAttribute("value");
		System.out.println(string);

		// Type about yourselfj
		WebElement About_yourself = driver.findElement(By.cssSelector("textarea[name='j_idt88:j_idt101']"));
		About_yourself.sendKeys("I came from the future");

		// Text Area

		WebElement text_area = driver.findElement(By.className("ql-editor"));
		text_area.sendKeys("I came from the future");

		// Just Press Enter and confirm error message*
		WebElement textbox = driver.findElement(By.id("j_idt106:thisform:age"));

		textbox.sendKeys(Keys.ENTER);

		String errorString = driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).getText();
		System.out.println(errorString);

		// Type your name and choose the third option

		WebElement dropdownElement = driver.findElement(By.id("j_idt106:auto-complete_input"));

		dropdownElement.sendKeys("num");

		WebElement s = driver.findElement(
				By.xpath("//*[@id='j_idt106:auto-complete_panel']/descendant::li[4]"));

		action.moveToElement(s).click().build().perform();
		// choose the date and confirm

		WebElement date = driver.findElement(By.id("j_idt106:j_idt116_input"));
		date.sendKeys("25/06/2000");
		// String v =date.getAttribute("value");

		System.out.println(date.getAttribute("value"));

		// Type number and spin to confirm value changed
		WebElement number = driver.findElement(By.id("j_idt106:j_idt118_input"));
		number.sendKeys("3");

		WebElement spinElement = driver.findElement(By.xpath("//*[@id='j_idt106:j_idt118']/a[2]/span"));
		spinElement.click();
		number.getAttribute("value");

	}

}