package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sample {
	

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("Dharun_K");
		driver.findElement(By.id("loginpassword")).sendKeys("dkvk2315");
		driver.findElement(By.cssSelector("button[onclick=\"logIn()\"]")).click();
		WebElement wel = driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
		System.out.println("Text"+wel.getText());
	}

}
