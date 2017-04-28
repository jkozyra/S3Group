package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class VacanciesPage extends BrowserContext{

	By SearchBox = By.name("jst");
	By Location = By.id("location");
	By SearchButton = By.cssSelector("button.btn-red");
	By AlertNoJobs = By.cssSelector(".alert-danger");
	
	public VacanciesPage EnterTextIntoSearchBox(String searchedValue) {
		GetDriver().findElement(SearchBox).sendKeys(searchedValue);		
		return this;
	}

	public VacanciesPage SelectLocation(String option) {
		Select select = new Select(GetDriver().findElement(Location));
		select.selectByVisibleText(option);
		return this;
	}

	public VacanciesPage PressSearchButton() {
		GetDriver().findElement(SearchButton).click();
		return this;		
	}

	public String GetNoResultFoundMessage() {
		return GetDriver().findElement(AlertNoJobs).getText();	
	}
}
