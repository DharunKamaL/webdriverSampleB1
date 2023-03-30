package testScripts;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class IFrameTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String strLbl1 = driver.findElement(By.cssSelector("label span")).getText();
		System.out.println("Label in main page:"+strLbl1);
//		Main page to frame1
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input")).sendKeys("Hii...");
		//Frame1 - Frame3
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("a")).click();
		
		
		//Frame3 to Frame1(parent frame)
//		driver.switchTo().parentFrame();
//		driver.findElement(By.xpath("//input")).clear();
//		driver.findElement(By.xpath("//input")).sendKeys("Hello...");
		
		driver.switchTo().frame(1);
		Select sel = new Select(driver.findElement(By.cssSelector("select[id=animals]")));
		sel.selectByVisibleText("Avatar");
		String str = sel.getFirstSelectedOption().getText();
		System.out.println("text:"+str);
		
	}
}
