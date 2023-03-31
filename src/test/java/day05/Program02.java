package day05;

import org.junit.*;
import org.junit.Test;

public class Program02 {
	@BeforeClass
	public static void beforeTestCase() {
		System.out.println("Open Browser");
		System.out.println("Open Application");
	}

	@Test
	public void testcase01() {
		System.out.println("Log-IN");
	}

	@Test
	public void testcase02() {
		System.out.println("Log-OUT");
	}

	@AfterClass
	public static void afterTestCase() {
		System.out.println("Close Browser");

	}

}
