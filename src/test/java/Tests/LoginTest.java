package Tests;

import java.io.IOException;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {
	public WebDriver driver;
	
	

	@Test(dataProvider="getLoginData")
	public void loginTest(String email,String password,String ExpectedResult) throws IOException, InterruptedException {
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.myAccountDropdown().click();
		landingpage.LoginOption().click();
		Thread.sleep(3000);

		LoginPage loginpage = new LoginPage(driver);
		loginpage.EmailAddressField().sendKeys(email);
		
		loginpage.PasswordField().sendKeys(password);
		
		loginpage.LoginButton().click();
		
		

		AccountPage accountpage = new AccountPage(driver);
	
//		String actualResult=null;
//		
//		try {
//			if(accountpage.ContactInformation().isDisplayed()) 
//				actualResult="Sucessfull";
//		       
//			
//			
//		}catch(Exception e) {
//			actualResult="Failure";
//		   
//			
//		}
//		
//		Assert.assertEquals(actualResult,ExpectedResult);
	}
	@BeforeMethod
	public void openApplication() throws IOException {
		driver = intializeDrivers();
		
		driver.get(prop.getProperty("url"));
	
		

		
	}

	@AfterMethod
	public void closur() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data= {{"sandeep.pinnama@gmail.com","sandep@123","Sucessfull"}};
		return data;
		
	}

}
