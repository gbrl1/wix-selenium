package pagefactory;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkPageFactory {
	
	WebDriver driver;
	
	@FindBy(id="comp-kj9sx3ul0label")
	WebElement gitHubTab;
	
	@FindBy(xpath="//a[contains(text(),'Project 1')]")
	WebElement gitHubLink;
	
	@FindBy(xpath="//span[contains(text(),'Code')]")
	WebElement codeTab;
	
	@FindBy(xpath="//span[contains(text(),'Issues')]")
	WebElement issuesTab;
	
	@FindBy(xpath="//span[contains(text(),'Pull requests')]")
	WebElement pullRequestsTab;
	
	@FindBy(xpath="//span[contains(text(),'Actions')]")
	WebElement actionsTab;
	
	@FindBy(xpath="//span[contains(text(),'Projects')]")
	WebElement projectsTab;
	
	@FindBy(xpath="//span[contains(text(),'Wiki')]")
	WebElement wikiTab;
	
	@FindBy(xpath="//span[contains(text(),'Security')]")
	WebElement securityTab;
	
	@FindBy(xpath="//span[contains(text(),'Insights')]")
	WebElement insightsTab;
	
	@FindBy(linkText="gbrl1")
	WebElement user;
	
	public LinkPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickGitHubTab() {
		gitHubTab.click();
	}
	
	public void clickGitHubLink() {
		gitHubLink.click();
	}
	
	public void exploreGitHub() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		codeTab.click();
		issuesTab.click();
		pullRequestsTab.click();
		actionsTab.click();
		projectsTab.click();
		wikiTab.click();
		securityTab.click();
		insightsTab.click();
		user.click();
	}
	
	public void closeGitHub() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}
}
