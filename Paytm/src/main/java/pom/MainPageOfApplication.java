package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageOfApplication
{
	@FindBy (xpath="(//div[@class='_2EGQY cqA0P'])[1]")
	private WebElement rechargePrepaidMobile;
	
	public MainPageOfApplication(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickRechargePrepaidMobile()
	{
		rechargePrepaidMobile.click();
	}

	public void clickRechargePrepaidPostpaidMobile()
	{
		rechargePrepaidMobile.click();
	}
	
	public void clickBillMobile()
	{
		rechargePrepaidMobile.click();
	}
}
