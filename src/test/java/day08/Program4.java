package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Program4 { //test5.xml

	
	@Test
	public void testCase_Edge_1() {
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("EdgeUsr1");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Test
	public void testCase_Edge_2() {
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("EdgeUsr2");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("btnLogin")).click();
	}

}
