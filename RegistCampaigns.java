package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistCampaigns {
	private WebDriver driver;

	public RegistCampaigns(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//input[@class='text_ok']")
	private WebElement CampaignOwner;
	
	@FindBy(xpath = "//input[@name='campaign_name']")
	private WebElement CampaignName;
	
	@FindBy(xpath = "//select[@name='type']")
	private WebElement Campaigntype;
	
	@FindBy(xpath = "//input[@id='expected_revenue']")
	private WebElement Expectedrevenue;
	
	@FindBy(xpath = "//input[@id='actual_cost']")
	private WebElement ActualCost;
	
}