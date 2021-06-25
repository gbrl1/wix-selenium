package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuizPageFactory {
	
	WebDriver driver;
	
	@FindBy(id="input_comp-kq16038l1")
	WebElement firstNameForm;
	
	@FindBy(id="input_comp-kq16038t1")
	WebElement lastNameForm;
	
	@FindBy(id="comp-kq16ih16")
	WebElement dateForm;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/button[1]/span[1]")
	WebElement date;
	
	public QuizPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setFirstName(String firstName) {
		firstNameForm.sendKeys(firstName);
	}
	
	public void setLateName(String lastName) {
		lastNameForm.sendKeys(lastName);
	}
	
	public void setDate() {
		dateForm.click();
		date.click();
	}

}
