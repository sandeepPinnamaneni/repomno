package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base {
	WebDriver driver;
	
	@Test
	public void testTwo() throws IOException, InterruptedException {
		System.out.println(" TestTwo");
		
		driver=intializeDrivers();
		driver.get("http://tutorialsninja.com/demo/");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
