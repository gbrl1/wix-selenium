package website;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagefactory.QuizPageFactory;

public class QuizTest {
	
	private WebDriver driver;
	private String baseUrl;
	QuizPageFactory quizPage;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		baseUrl = "https://ghaywood5.wixsite.com/selenium/quiz-1";
		
		quizPage = new QuizPageFactory(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void form() {
		quizPage.setFirstName("John");
		quizPage.setLateName("Doe");
		quizPage.setDate();
	}
	
	@Test
	public void buttonTest() {
		
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
