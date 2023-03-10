package testScriptsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://jqueryui.com/checkboxradio/");
		actions.scrollByAmount(0, 200).perform();
		driver.switchTo().frame(0);
		actions.scrollByAmount(0, 400).perform();
		WebElement opt = driver.findElement(By.xpath("//label[contains(text(),'P')]"));
		if(!opt.isSelected()) {
			opt.click();
		}
		
		driver.findElement(By.cssSelector("label[for=\"checkbox-4\"]")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//legend[contains(text(),'Bed Type')]//following-sibling::label"));
		for(WebElement option:options) {
			if(!option.isSelected()) {
				option.click();
			}
		}

	}

}
