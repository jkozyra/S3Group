package tests;

import org.junit.After;
import org.junit.Before;

import pages.HomePage;

public class SetupAndTeardown {
	
	private HomePage home;
	
	@Before
	public void setup()	{
		this.home = new HomePage().GoToHomePage();
	}
	
	@After
	public void teardown()	{
		this.home.CloseBrowser();
	}	
	
	public HomePage GetHomePage() {
		return this.home;
	}
}
