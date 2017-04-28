package tests;

import org.junit.Assert;
import org.junit.Test;

public class VacanciesTests extends SetupAndTeardown {
	
	@Test
	public void checkThatCorrectMessageIsDisplayedWhenFiltersAreNotMet(){		
		String actualResult = GetHomePage().GoToVacanciesPage()
				.SelectLocation("Wroclaw")
				.EnterTextIntoSearchBox("<script>alert('HACKFAIL');</script>")				
				.PressSearchButton()
				.GetNoResultFoundMessage();	
		
		String ExpectedAlert = "Sorry, no jobs were found. Reset all filters.";
		Assert.assertEquals( ExpectedAlert, actualResult);		
	}
}
