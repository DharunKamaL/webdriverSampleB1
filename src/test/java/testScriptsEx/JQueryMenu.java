package testScriptsEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQueryMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("http://the-internet.herokuapp.com/jqueryui/menu#");
		WebElement enable = driver.findElement(By.partialLinkText("Enable"));
		actions.moveToElement(enable).perform();
		WebElement down = driver.findElement(By.xpath("(//a[@role=\"menuitem\"])[4]"));
		wait.until(ExpectedConditions.elementToBeClickable(down));
		actions.moveToElement(down).perform();
		WebElement pdf = driver.findElement(By.cssSelector("a[id=\"ui-id-6\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(pdf));
		actions.click(pdf).perform();
		System.out.println("PDF downloaded successfully...");
		
		driver.findElement(By.partialLinkText("Enable")).click();
		WebElement back = driver.findElement(By.cssSelector("a[id=\"ui-id-5\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(back));
		actions.click(back).perform();
	}

}
