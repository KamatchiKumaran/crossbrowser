package Various_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edge_test {
WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void crossbrowsers(String browser) throws Exception {
		if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	@Test
	public void first_step() {
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
	@Test
	public void first_two() {
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}
	@Test
	public void first_three() {
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
	}
	@Test
	public void first_four() {
		driver.get("https://www.whatsapp.com/");
		System.out.println(driver.getTitle());
	}
	@Test
	public void first_five() {
		driver.get("http://leafground.com/");
		System.out.println(driver.getTitle());
	}
}
