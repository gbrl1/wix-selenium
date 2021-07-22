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
	
	@FindBy(xpath="//span[contains(text(),'15')]")
	WebElement date;
	
	@FindBy(xpath="//div[contains(text(),'Green')]")
	WebElement color;
	
	@FindBy(xpath="//div[contains(text(),'Jupiter')]")
	WebElement planet;
	
	@FindBy(xpath="//div[contains(text(),'Spain')]")
	WebElement country;
	
	@FindBy(xpath="//div[contains(text(),'Buzz Aldrin')]")
	WebElement firstMan;
	
	@FindBy(xpath="//label[@id='2_comp-kq16e21s\']")
	WebElement pineapple;
	
	@FindBy(xpath="//label[@id='3_comp-kq16e21s\']")
	WebElement extraCheese;
	
	@FindBy(xpath="//option[contains(text(),'Choice 3')]")
	WebElement choices;
	
	@FindBy(id="comp-kq16e0be")
	WebElement acceptTerms;
	
	@FindBy(xpath="//div[@id='comp-kq16039e']//button")
	WebElement submitForm;
	
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
	
	public void setColor() {
		color.click();
	}
	
	public void setPlanet() {
		planet.click();
	}
	
	public void setCountry() {
		country.click();
	}
	
	public void setFirstMan() {
		firstMan.click();
	}
	
	public void setPizzaToppings() {
		pineapple.click();
		extraCheese.click();
	}
	
	public void setChoice() {
		choices.click();
	}
	
	public void acceptTerms() {
		acceptTerms.click();
	}
	
	public void submitForm() {
		submitForm.click();
	}

}
