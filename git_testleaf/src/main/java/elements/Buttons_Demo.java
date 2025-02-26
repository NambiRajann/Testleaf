package elements;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.eventbreakpoints.EventBreakpoints;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.testng.annotations.Test;

public class Buttons_Demo extends Home_page {
	@Test(priority = 2, groups = "buttons")
	public static void Buttons_Demo() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		// to open buttons page

		WebElement elements_icon = driver.findElement(By.xpath("//*[@id=\"menuform\"]/child::ul/li[3]"));
		elements_icon.click();
		WebElement button_icon = driver.findElement(By.id("menuform:m_button"));
		button_icon.click();

		// get title
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		System.err.println(driver.getTitle());

		// return back to button page
		driver.navigate().back();

		// confirm the button is disabled
		Boolean disable = driver.findElement(By.id("j_idt88:j_idt90")).isEnabled();
		System.out.println("disable");

		// Find the position of the Submit button
		WebElement button_position = driver.findElement(By.id("j_idt88:j_idt94"));
		Point position = button_position.getLocation();
		int x = position.getX();
		int y = position.getY();
		System.out.println("x= " + x + " y= " + y);

		// Find the Save button color
		WebElement color_button = driver.findElement(By.id("j_idt88:j_idt96"));
		String b_color = color_button.getCssValue("background");
		System.out.println(b_color);

		// Find the height and width of this button
		WebElement hw_button = driver.findElement(By.id("j_idt88:j_idt98"));
		int h = hw_button.getSize().getHeight();
		int w = hw_button.getSize().getWidth();
		System.err.println("H= " + h + " w= " + w);

		// Mouse over and confirm the color changed
		Actions action = new Actions(driver);
		WebElement color_change_button = driver.findElement(By.id("j_idt88:j_idt100"));
		String color = color_change_button.getCssValue("background");
		action.moveToElement(color_change_button).perform();
		String color2 = color_change_button.getCssValue("background-color");
		System.out.println("befor mouseover " + color + "after mouseover " + color2);

		// button count
		List<WebElement> count_button = driver.findElements(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div[4]/button"));
		System.out.println(count_button.size());

	}

}
