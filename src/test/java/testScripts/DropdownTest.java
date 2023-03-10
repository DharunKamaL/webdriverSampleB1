package testScripts;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select singleSel = new Select(driver.findElement(By.id("select-demo")));
		singleSel.selectByValue("Tuesday");
	
		Select multiSel = new Select(driver.findElement(By.id("multi-select")));
		if(multiSel.isMultiple()) {
			multiSel.selectByIndex(2);
			multiSel.selectByValue("California");
			multiSel.selectByVisibleText("Florida");
			List<WebElement>opt=multiSel.getAllSelectedOptions();
			System.out.println("No.of Selected options:"+opt.size());
			
			for(WebElement options:opt) {
				System.out.println("Selected options:"+options.getText());
			}
			multiSel.deselectByIndex(2);
		}
	}
}
