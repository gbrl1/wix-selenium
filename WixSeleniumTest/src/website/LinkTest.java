package website;

import org.testng.annotations.Test;

import pagefactory.LinkPageFactory;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LinkTest {
	private WebDriver driver;
	private String baseUrl;
	LinkPageFactory linkPage;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		baseUrl = "https://ghaywood5.wixsite.com/selenium";

		linkPage = new LinkPageFactory(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void gitHubTest() {
		linkPage.clickGitHubTab();
		linkPage.clickGitHubLink();
		linkPage.exploreGitHub();
		linkPage.closeGitHub();
	}
	
	@Test
	public void otherLinks() {
		
	}

	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
