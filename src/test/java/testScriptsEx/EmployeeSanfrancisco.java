package testScriptsEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeeSanfrancisco {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Dharun\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		List<WebElement> datas = driver.findElements(By.xpath("//td[contains(text(),'San')]//following-sibling::td[3]"));
		System.out.println("Salary for the persons working in San Franscisco:");
		int count = 1;
		for(WebElement data:datas) {
			System.out.println(count+"."+data.getText());
			count++;
		}
		List<WebElement> datas1 = driver.findElements(By.xpath("//td[contains(text(),'San ')]//preceding-sibling::td[2]"));
		System.out.println("Name of the persons working in San Franscisco:");
		int sum = 1;
		for(WebElement d:datas1) {
			System.out.println(sum+"."+d.getText());
			sum++;
		}		
	}
}
