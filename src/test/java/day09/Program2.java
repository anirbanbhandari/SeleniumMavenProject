package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Program2 extends Framework {

	@Test
	public void testCase_Chrome_1() {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("ChromeUsr1");
		driver.findElement(By.name("password22")).sendKeys("password");
	}

}
