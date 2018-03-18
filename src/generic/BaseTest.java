package generic;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseTest implements IAutoConst{
	
	public WebDriver driver;

	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@Parameters({"ip","browser"})
	@BeforeMethod(alwaysRun = true)
	public void openApplication(String ip,String browser) throws Exception {
	
		String appURL = AutoUtil.getProperty(CONFIG_PATH, "URL");
		String strITO = AutoUtil.getProperty(CONFIG_PATH,"ITO");
		long ITO = Long.parseLong(strITO);
		
		URL whichSystem=new URL("http://"+ip+":4444/wd/hub");
		DesiredCapabilities whichBrowser=new DesiredCapabilities();
		whichBrowser.setBrowserName(browser);
	    driver=new RemoteWebDriver(whichSystem, whichBrowser);
		
	
	}
}
