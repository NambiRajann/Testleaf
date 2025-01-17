package elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.index.qual.LengthOf;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

class automate_list extends Text_box {

	public static void test_list_method() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement elements_icon = driver.findElement(By.id("menuform:j_idt40"));
		elements_icon.click();

		WebElement dropdown_icon = driver.findElement(By.id("menuform:m_dropdown"));
		dropdown_icon.click();

		// Which is your favorite UI Automation tool?
		WebElement fav_uiElement = driver.findElement(By.className("ui-selectonemenu"));
		Select dropdown = new Select(fav_uiElement);
		dropdown.selectByIndex(1);

		// Choose your preferred country.
		WebElement country = driver.findElement(By.xpath("//*[@id='j_idt87:country_label']"));
		country.click();
		List<WebElement> country_list = driver.findElements(By.xpath("//*[@id='j_idt87:country_panel']/div/ul/li"));
		for (WebElement i : country_list) {
			if (i.getText().equalsIgnoreCase("Brazil")) {
				i.click();

			}

		}

		// Confirm Cities belongs to Country is loaded
		WebElement city = driver.findElement(By.xpath("//label[@id='j_idt87:city_label']"));
		try {
			city.click();
		} catch (StaleElementReferenceException e) {

			WebElement city1 = driver.findElement(By.xpath("//label[@id='j_idt87:city_label']"));
			city1.click();
		}

		List<WebElement> city_list = driver.findElements(By.xpath("//*[@id='j_idt87:city_panel']/div/ul/li"));
		for (WebElement j : city_list) {
			if (j.getText().equalsIgnoreCase("salvador")) {
				j.click();

			}

		}

		// Choose the Course
		driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button")).click();
		String c = "AWS";
		driver.findElement(By.xpath("//li[text()='" + c + "']")).click();

		// choose language
		WebElement language = driver.findElement(By.id("j_idt87:lang_label"));
		try {
			language.click();
		} catch (StaleElementReferenceException e) {

			WebElement language1 = driver.findElement(By.id("j_idt87:lang_label"));
			language1.click();
		}

		List<WebElement> language_list = driver.findElements(By.xpath("//*[@id='j_idt87:lang_panel']/div/ul/li"));
		for (WebElement x : language_list) {
			if (x.getText().equalsIgnoreCase("tamil")) {
				x.click();

			}

		}

		// choose two more language

		try {
			driver.findElement(By.id("j_idt87:value_label")).click();
		} catch (StaleElementReferenceException e) {
			driver.findElement(By.id("j_idt87:value_label")).click();
		}

		List<WebElement> more_language_list = driver
				.findElements(By.xpath("//*[@id=\"j_idt87:value_panel\"]/div/ul/li"));

		try {

			for (WebElement x : more_language_list) {

				if (x.getText().equals("ஒன்று")) {
					x.click();

				}

			}

		}

		catch (Exception e) {
			List<WebElement> more_language_list1 = driver
					.findElements(By.xpath("//*[@id=\"j_idt87:value_panel\"]/div/ul/li"));

			for (WebElement x : more_language_list1) {

				if (x.getText().equals("ஒன்று")) {
					x.click();

				}

			}

		}

		home_page();

	}

}
