package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
		//driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		//driver.findElement(By.name("username")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
		//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.className("radius")).click();
		//driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//System.out.println("Login Successfully...");
//		boolean isDisp = driver.findElement(By.cssSelector(".flash.success")).isDisplayed();
//		if(isDisp){
//			String strMsg = driver.findElement(By.cssSelector(".flash.success")).getText();
//			System.out.println(strMsg);
//		}
		boolean isDisp = driver.findElement(By.xpath("//div[contains(text(),'logged')]")).isDisplayed();
		if(isDisp){
			String strMsg = driver.findElement(By.xpath("//div[contains(text(),'logged')]")).getText();
			System.out.println(strMsg);
		}
		//driver.findElement(By.linkText("Elemental Selenium")).click();
		driver.findElement(By.partialLinkText("Elemental")).click();
	}
}
