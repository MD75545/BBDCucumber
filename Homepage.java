package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import dev.failsafe.Execution;

public class Homepage {
	public WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@accesskey='k']")
	private WebElement Campaigns;
	
	private WebElement Username;
	public String getTitle() {
		String title=driver.getTitle();
		return title;
	}
	public String getUrl() {
		String Url=driver.getCurrentUrl();
		return Url;
}	
	@SuppressWarnings({ "rawtypes", "unused" })
	public void CampaignButton() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Campaigns.click();
		@SuppressWarnings("unchecked")
		Wait wait=new FluentWait(driver).
		withTimeout(Duration.ofSeconds(0)).pollingEvery(Duration.ofSeconds(0)).ignoring(Execution.class);
		Campaigns.click();
	}
	
}