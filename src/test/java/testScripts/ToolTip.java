package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
		age.sendKeys(Keys.PAGE_DOWN);
		actions.moveToElement(age).perform();
		String strTxt = driver.findElement(By.cssSelector("div.ui-tooltip-content")).getText();
		System.out.println("Displayed Text:"+strTxt);
		age.sendKeys("21");
	}

}
