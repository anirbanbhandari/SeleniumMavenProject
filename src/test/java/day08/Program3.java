package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program3 { //test5.xml

	@Test
	public void testCase_Chrome_1() {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("ChromeUsr1");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Test
	public void testCase_Chrome_2() {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("ChromeUsr2");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("btnLogin")).click();
	}
	
}
