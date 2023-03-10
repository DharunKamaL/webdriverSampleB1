package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateMsg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		WebElement search = driver.findElement(By.xpath("//div[@title='Search input textbox']"));
		search.sendKeys("Sreeraam Zuci");
		boolean isDisp = driver.findElement(By.xpath("//div[@data-testid=\"list-item-1\"]")).isDisplayed();
		if(isDisp) {
			driver.findElement(By.xpath("//div[@data-testid=\"list-item-1\"]")).click();
		}
		WebElement sendMsg = driver.findElement(By.cssSelector("p[class=\"selectable-text copyable-text iq0m558w\"]"));
		for(int i=0;i<5;i++) {
			sendMsg.sendKeys("Hii");
			driver.findElement(By.cssSelector("span[data-testid=\"send\"]")).click();
		}
		//sendMsg.sendKeys("Hii");
		//driver.findElement(By.cssSelector("span[data-testid=\"send\"]")).click();
	}
}
