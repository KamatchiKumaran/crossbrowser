package Various_Browsers;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;


public class Groups {
	@Test(retryAnalyzer = RetryFailedTests.class)
	public void createLead() {
		System.out.println("createLead");		
    }
	@Test(retryAnalyzer = RetryFailedTests.class)
	public void editLead() {
		System.out.println("editLead");
		throw new NoSuchElementException();
	}
	@Test(retryAnalyzer = RetryFailedTests.class)
	public void mergeLead() {
		System.out.println("mergeLead");
	}
}
