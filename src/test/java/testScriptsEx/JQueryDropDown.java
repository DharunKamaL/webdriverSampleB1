package testScriptsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JQueryDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
//		Select sel = new Select(driver.findElement(By.id("country")));
//		sel.selectByVisibleText("India");
		driver.findElement(By.xpath("(//span[@role=\"combobox\"])[1]")).click();
		WebElement search = driver.findElement(By.xpath("(//input[@class=\"select2-search__field\"])[2]"));
		search.sendKeys("Ind");
		search.sendKeys(Keys.ENTER);
		
		WebElement state = driver.findElement(By.xpath("(//input[@type=\"search\"])[1]"));
		state.sendKeys("Alabama");
		state.sendKeys(Keys.ENTER);
		state.sendKeys("Georgia");
		state.sendKeys(Keys.ENTER);
		
		actions.scrollByAmount(0, 300);
		
		Select singSel = new Select(driver.findElement(By.xpath("(//select[@tabindex=\"-1\"])[3]")));
		singSel.selectByIndex(3);
		
		Select sSel = new Select(driver.findElement(By.id("files")));
		sSel.selectByVisibleText("Python");
		
		}
	}

