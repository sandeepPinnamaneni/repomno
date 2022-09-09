package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class ThreeTest extends Base{
	WebDriver driver;
	
	@Test
	public void testThree() throws InterruptedException, IOException {
		System.out.println("TestThree");
		
		driver=intializeDrivers();
		driver.get("http://tutorialsninja.com/demo/");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
