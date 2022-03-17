package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineRechargePage 
{
	@FindBy (xpath="(//i[@class='_3DxO'])[1]")
	private WebElement rechargePayMobileBillPrepaid;
	
	@FindBy (xpath="//input[@type='tel']")
	private WebElement enterMobileNumber;
	
	@FindBy (xpath="(//input[@autocomplete='new-password'])[2]")
	private WebElement enterAmount;
	
	@FindBy (xpath="//i[@class='_1nFl']")
	private WebElement checkBoxFastAndForward;
	
	@FindBy (xpath="//button[text()='Recharge Now']")
	private WebElement clickRechargeNow;
	
	@FindBy (xpath="//a[@title='Close']")
	private WebElement closePopUp;
	
	public OnlineRechargePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickRechargePayMobileBill()
	{
		rechargePayMobileBillPrepaid.click();
	}
	
	public void sendMobileNumber()
	{
		enterMobileNumber.click();
		enterMobileNumber.sendKeys("8149925051");
	}

	public void sendAmount()
	{
		enterAmount.click();
		enterAmount.sendKeys("239");
	}
	
	public void clickFastAndForward()
	{
		checkBoxFastAndForward.click();
	}
	
	public void clickRechargeNow()
	{
		clickRechargeNow.click();
	}
	
	public void clickPopUp()
	{
		closePopUp.click();
	}
}
