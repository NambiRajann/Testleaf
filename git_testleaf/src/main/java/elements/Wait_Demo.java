package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Demo extends Radiobuttons_Demo {

	public void Wait_Demo() {

		WebElement elements_icon = driver.findElement(By.id("menuform:j_idt40"));
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
		Visiblity_Click.click();

		// Wait for Invisibility (1 - 10 Sec)
		WebElement Invisibility = driver.findElement(By.xpath("//button[@name='j_idt87:j_idt92']"));
		Invisibility.click();
		WebElement Invisibility_button = driver.findElement(By.xpath("//button[@name='j_idt87:j_idt93']"));

		WebDriverWait wait_2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean Invisibility_click = wait_2.until(ExpectedConditions.invisibilityOf(Invisibility_button));
	
		System.out.println(Invisibility_click);
		
		// Wait for Clickability(1-10 Sec)
		
		WebElement Clickability = driver.findElement(By.xpath("//button[@name=\"j_idt87:j_idt95\"]"));
		Clickability.click();
		WebDriverWait wait_3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Click_second =  wait_3.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='j_idt87:j_idt96']")));
		System.out.println(Click_second.getText());
		
         //Wait for Text Change (1 - 10 Sec)
		
		WebElement Text_change = driver.findElement(By.xpath("//button[@name=\"j_idt87:j_idt98\"]"));
		Text_change.click();
		WebDriverWait wait_4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean TextChange_Click =  wait_4.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[@name='j_idt87:j_idt99']"), "I am going to chae!"));
		if(TextChange_Click.equals("False"))
		{
              WebElement v = driver.findElement(By.xpath("//button[@name='j_idt87:j_idt99']"));
              System.out.println(v.getText());
	}

}}
