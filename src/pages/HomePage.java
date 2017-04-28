package pages;

import org.openqa.selenium.By;

public class HomePage extends BrowserContext{	

	private String url ="https://www.s3group.com/";
	
	By WhatsNewHeader = By.cssSelector("h2.text-center");
	By CareersLink = By.id("menu-item-401");
	By VacanciesLink = By.id("menu-item-444");
    
	public HomePage GoToHomePage(){	
		Initialize();
		GetDriver().get(url);	
		return this;
	}
	
	public String getPageTitle() {
		return GetDriver().getTitle();
	}
	
	public void CloseBrowser() {	
		GetDriver().manage().deleteAllCookies();
		GetDriver().quit();		
	}

	public boolean IsWhatsNewSectionDisplayed() {
		return GetDriver().findElement(WhatsNewHeader).isDisplayed();		
	}

	public VacanciesPage GoToVacanciesPage() {
		GetActions().moveToElement(GetDriver().findElement(CareersLink)).build().perform();
		GetDriver().findElement(VacanciesLink).click();
		return new VacanciesPage();
	}
}
