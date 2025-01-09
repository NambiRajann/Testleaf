package elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_box {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		// To click the elements icon
		WebElement elements_icon = driver.findElement(By.id("menuform:j_idt40"));
		elements_icon.click();
		
		//TO open text box page
		WebElement texboxElement = driver.findElement(By.id("menuform:m_input"));
		texboxElement.click();
		
		//To enter the name
		WebElement name = driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("selenium");
		
		//To enter the city name
		WebElement city = driver.findElement(By.id("j_idt88:j_idt91"));
		city.sendKeys(" - Sholiganlur");
		
		//Verify if text box is disabled
		WebElement disabled_textboxElement = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean results =  disabled_textboxElement.isEnabled();
		System.out.println(results);
		
		//Clear the typed text.
		WebElement cleartextboxElement = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']"));
		cleartextboxElement.clear();
		
		// Retrieve the typed text.
		WebElement retrive_text= driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']"));
		String string =   retrive_text.getAttribute("value");
		System.out.println(string);
		
		//Type about yourself
		WebElement About_yourself = driver.findElement(By.cssSelector("textarea[name='j_idt88:j_idt101']"));
		About_yourself.sendKeys("I came from the future");
		
		//Text Area
		
		WebElement text_area = driver.findElement(By.className("ql-editor"));
		text_area.sendKeys("I came from the future");
		
		//Just Press Enter and confirm error message*
		WebElement textbox = driver.findElement(By.id("j_idt106:thisform:age"));
	
		textbox.sendKeys(Keys.ENTER);
		
	String errorString =driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).getText();
	System.out.println(errorString);
	}
	
}


	


