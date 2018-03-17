package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginPage {
	
	@FindBy(id = "username")
	
	private WebElement unTB;
	
@FindBy(name = "pwd")
	
	private WebElement pwTB;

@FindBy(xpath = "//div[.='Login ']")

private WebElement loginBTN;

@FindBy(xpath = "//span[contains(.,'Invalid')]")
	
private WebElement ErrMsg;


public LoginPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public void setUsername(String un) {
	unTB.sendKeys(un);
}

public void setPassword(String pw) {
	unTB.sendKeys(pw);
}
public void clickLogin() {
	loginBTN.click();
}
public void verifyErrMsg(String ExpectedMsg)
{
	String actualMsg = ErrMsg.getText();
	Assert.assertEquals(ExpectedMsg, actualMsg);
}

}
	

