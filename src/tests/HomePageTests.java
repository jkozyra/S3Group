package tests;

import org.junit.Assert;
import org.junit.Test;

public class HomePageTests extends SetupAndTeardown {	
		
	@Test
	public void checkThatHomePageTittleIsCorrect(){	
		String ExpectedTitle = "Connected Consumer Technology Company | S3 Group";
		Assert.assertEquals( ExpectedTitle, GetHomePage().getPageTitle());				
	}
	
	@Test
	public void checkThatHomePageContainsWhatsNewSection(){			
		Assert.assertTrue("What's new sectionis not displayed", GetHomePage().IsWhatsNewSectionDisplayed());				
	}
}