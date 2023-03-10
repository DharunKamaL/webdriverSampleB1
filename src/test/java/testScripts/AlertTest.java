package testScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		WebElement btn = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert msg:"+alert.getText());
		alert.accept();
		
		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
		Alert confirmMsg = driver.switchTo().alert();
		System.out.println("Alert Msg for confirmMsg:"+confirmMsg.getText());
		confirmMsg.accept();
		
		driver.findElement(By.xpath("(//button[@class=\"btn btn-default btn-lg\"])[2]")).click();
		Alert prompt = driver.switchTo().alert();
		System.out.println("Alert Msg for prompt:"+prompt.getText());
		prompt.sendKeys("Hii");
		Thread.sleep(2000);
		prompt.dismiss();
		prompt.sendKeys("Hello");
		Thread.sleep(2000);
		prompt.accept();
	}
}
