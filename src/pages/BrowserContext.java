package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserContext {

	private static WebDriver driver;
	
	public void Initialize() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");		
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
	}
	
	public WebDriver GetDriver(){
		return driver;
	}
	
	public Actions GetActions()
	{
		return new Actions(driver);
	}
}
