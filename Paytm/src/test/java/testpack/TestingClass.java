package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.MainPageOfApplication;
import pom.OnlineRechargePage;

public class TestingClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com");
		
		driver.manage().window().maximize();
		
		MainPageOfApplication mainPageOfApplication=new MainPageOfApplication(driver);
		mainPageOfApplication.clickRechargePrepaidMobile();
		
		OnlineRechargePage onlineRechargePage=new OnlineRechargePage(driver);
		onlineRechargePage.clickRechargePayMobileBill();
		onlineRechargePage.sendMobileNumber();
		Thread.sleep(2000);
		onlineRechargePage.sendAmount();
		onlineRechargePage.clickFastAndForward();
		onlineRechargePage.clickRechargeNow();
		Thread.sleep(2000);
		onlineRechargePage.clickPopUp();
		
	}

}
