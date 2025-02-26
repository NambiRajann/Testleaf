package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Checkbox_Demo extends Home_page {
	 WebDriver driver = new ChromeDriver();
	
	 @Test(priority = 4,groups = "buttons")
	public  void Checkbox_Demo() {
		
		 
		 driver.get("https://www.leafground.com/dashboard.xhtml");
		//to open check_box page
		WebElement elements_icon = driver.findElement(By.xpath("//*[@id=\"menuform\"]/child::ul/li[3]"));
		elements_icon.click();
		driver.findElement(By.id("menuform:m_checkbox")).click();
		
		//basic check box
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		
		//notification checkbox
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		
		//Choose your favorite language(s)
		favlanguage("Java");
		favlanguage("Python");
		
		//Tri State Checkbox
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		
		//toggle
		driver.findElement(By.id("j_idt87:j_idt100")).click();
		
		//Verify if check box is disabled
		Boolean enable =  driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled();
		System.out.println("check box is "+ enable);
		
		//Select Multiple
		driver.findElement(By.xpath("//ul[@data-label=\"Cities\"]")).click();
		//driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		select_multile("Miami");
		select_multile("London");
	
	 }

	//Choose your favorite language(s)
		public  void favlanguage(String l)
		{  
           driver.findElement(By.xpath("//label[text()= '"+l+"']")).click();
			
		}

		
		public  void select_multile(String l)
		{  
           driver.findElement(By.xpath("(//label[text()='"+l+"'])[2]")).click();
			
		}

}
		
	

	


