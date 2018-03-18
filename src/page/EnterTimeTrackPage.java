package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class EnterTimeTrackPage {
	
@FindBy(xpath="//div[contains(text(),'Help')]")
private WebElement help;

@FindBy(linkText="About your actiTIME")
private WebElement aboutAT;


@FindBy(xpath="//span[@class='productVersion']")
private WebElement version;


EnterTimeTrackPage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void clickHelp()
{
	help.click();
}

public void clickAAT()
{
	aboutAT.click();
}

public void  verifyProductversion(String eVersion)
{
	String aversion = version.getText();
	Assert.assertEquals(eVersion, aversion);
}



}
