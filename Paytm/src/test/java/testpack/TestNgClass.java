package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.MainPageOfApplication;
import pom.OnlineRechargePage;

public class TestNgClass 

{
	private WebDriver driver;
	public OnlineRechargePage onlineRechargePage;
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BrowserLaunched");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void applicationMainPage()
	{
		System.out.println("Application Main Page");
        driver.get("https://paytm.com");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority =1)
	public void verifyRechargePrepaidMobileButoon()
	{
		System.out.println("Verify Recharge Prepaid Mobile Butoon");
		MainPageOfApplication mainPageOfApplication=new MainPageOfApplication(driver);
		mainPageOfApplication.clickRechargePrepaidMobile();
	}
	
	@Test(priority=2)
	public void verifyRechargeNowButton()
	{
		System.out.println("Verify RechargeNow Button");
		onlineRechargePage=new OnlineRechargePage(driver);
		onlineRechargePage.clickRechargePayMobileBill();
		onlineRechargePage.sendMobileNumber();
		onlineRechargePage.sendAmount();
		onlineRechargePage.clickFastAndForward();
		onlineRechargePage.clickRechargeNow();
		
		
	}
	
	@AfterMethod
	public void closePopUpButton() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("closePopUpButton");
	}

    
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser Close");
	}
}
