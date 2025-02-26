package elements;

import java.security.PublicKey;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.bytebuddy.agent.builder.AgentBuilder;

public class Radiobuttons_Demo {
	WebDriver driver = new ChromeDriver();

	@Test(priority = 5)
	public void Radiobuttons_Demo() {

		driver.get("https://www.leafground.com/dashboard.xhtml");
		// To click the elements icon
		WebElement elements_icon = driver.findElement(By.xpath("//*[@id=\"menuform\"]/child::ul/li[3]"));
		elements_icon.click();

		// to open radio_buttons page
		WebElement Radio_button = driver.findElement(By.id("menuform:m_radio"));
		Radio_button.click();

		// Your most favorite browser

		browser("Edge");

		// Find the default select radio button

		List<WebElement> default_select = driver
				.findElements(By.xpath("//table[@id='j_idt87:console2']/descendant::input"));
		int j = 0;
		for (WebElement i : default_select) {
			j = j + 1;

			if (i.isSelected()) {
				WebElement radio = driver
						.findElement(By.xpath("(//table[@id='j_idt87:console2']/descendant::label)[" + j + "]"));
				System.out.print(radio.getText());
			}

		}

		// Select the age group (only if not selected)

		List<WebElement> age_elements = driver.findElements(By.xpath("//div[@id=\"j_idt87:age\"]/descendant::input"));
		int k = 0;
		for (WebElement i : age_elements) {
			k = k + 1;

			if (i.isSelected() == false) {
				WebElement age = driver
						.findElement(By.xpath("(//*[@id=\"j_idt87:age\"]/descendant::label)[" + k + "]"));
				age.click();

			}
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

	public void browser(String b) {
		driver.findElement(By.xpath("(//*[text()='" + b + "'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("(//*[text()='" + b + "'])[1]")).getText());

	}

}
