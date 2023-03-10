package testScriptsEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OpenCartReg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://demo.opencart.com/");
		WebElement menu = driver.findElement(By.xpath("(//li/descendant::i[@class='fas fa-caret-down'])[2]"));
		WebElement submenu = driver.findElement(By.xpath("//li/a[contains(text(),'Register')]"));
		actions.click(menu).perform();
		actions.click(submenu).perform();
		WebElement fName = driver.findElement(By.cssSelector("input[name=firstname]"));
		fName.sendKeys("Dharun Kumar");
		WebElement lName = driver.findElement(By.cssSelector("input[name=lastname]"));
		lName.sendKeys("C");
		WebElement eMail = driver.findElement(By.cssSelector("input[name=email]"));
		eMail.sendKeys("dk23@yopmail.com");
		WebElement pass = driver.findElement(By.cssSelector("input[name=password]"));
		pass.sendKeys("1234567890");
		actions.scrollByAmount(0, 1500);
		//driver.findElement(By.xpath("//div[class='form-check form-check-inline']")).click();
//		WebElement agreed = driver.findElement(By.name("agree"));
//		if(!agreed.isSelected()) {
//			agreed.click();
//		}
		wait.until(ExpectedConditions.elementToBeClickable(By.name("agree")));
		driver.findElement(By.name("agree")).click();
		WebElement cont = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		wait.until(ExpectedConditions.elementToBeClickable(cont));
		cont.click();
	}
}
