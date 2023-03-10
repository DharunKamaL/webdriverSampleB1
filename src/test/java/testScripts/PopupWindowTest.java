package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window:"+parentWindow);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])[1]")).click();
		Set<String> tabs =driver.getWindowHandles();
		System.out.println("Number of Windows opened:"+tabs.size());
		
		for(String tab:tabs) {
			if(!tab.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(tab);
				driver.findElement(By.xpath("(//span[@class=\"menu-text\"])[2]")).click();
			}
		}
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]"));
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("http://watir.com/examples/shadow_dom.html");
		
		
		Set<String> tabsw = driver.getWindowHandles();
		System.out.println("Number of Windows opened:"+tabsw.size());
		driver.quit();
	}
}
