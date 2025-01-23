package elements;

import java.security.PublicKey;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.bytebuddy.agent.builder.AgentBuilder;

public class Test_radiobuttons extends test_checkbox {

	public static void test_radiobuttons_method() {

		// To click the elements icon
		WebElement elements_icon = driver.findElement(By.id("menuform:j_idt40"));
		elements_icon.click();

		// to open radio_buttons page
		WebElement Radio_button = driver.findElement(By.id("menuform:m_radio"));
		Radio_button.click();

		// Your most favorite browser
		browser("Edge");

		// Find the default select radio button
		Boolean Safari = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2:2\"]")).isSelected();
		if (Safari) {
			System.out.println(
					driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/label")).getText());
		}

		// Select the age group (only if not selected)
		
		Boolean age = driver.findElement(By.xpath("//*[@id=\"j_idt87:age:0\"]")).isSelected();
		if(age == false)
		{
			driver.findElement(By.xpath("//*[text()='1-20 Years']")).click();
			System.out.println(driver.findElement(By.xpath("//*[text()='1-20 Years']")).getText());
			
		}

	}

	public static void browser(String b) {
		driver.findElement(By.xpath("(//*[text()='" + b + "'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("(//*[text()='" + b + "'])[1]")).getText());

	}

}
