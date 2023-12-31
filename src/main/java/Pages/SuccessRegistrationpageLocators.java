package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessRegistrationpageLocators {
	
	WebDriver driver;
	
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	private WebElement AccountCreationSuccesMsg;

	public SuccessRegistrationpageLocators(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String accountCreationSuccessMsg() 
	{
		String accountCreationSuccessMsg=AccountCreationSuccesMsg.getText();
		return accountCreationSuccessMsg;
	}

}
