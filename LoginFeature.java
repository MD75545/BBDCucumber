package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.Campaigns;
import Pages.Homepage;
import Pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginFeature {
	public WebDriver driver;
	public LoginPage Login;
	public Homepage home;
	public Campaigns camp;
	
	@Given("open the browzer")
	public void open_the_browzer() {
		driver=new ChromeDriver();
	}

	@When("user Enter thr url {string}")
	public void user_enter_thr_url(String url) {
	    driver.get("https://secure4.salesboom.com/crm_logout.html");
	}

	@When("Enter the username {string}")
	public void enter_the_username(String username) {
	    Login=new LoginPage(driver);
	    Login.UsernameSendkey(username);
	    
	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) {
		Login=new LoginPage(driver);
	    Login.Passwordsendkeys(password);
	}

	@When("click on loginButton")
	public void click_on_login_button() {
	   home=new Homepage(driver);
	   home=Login.ClickonLoginButton();
	}

	@Then("Homepage Title is displayed {string}")
	public void homepage_title_is_displayed(String expectedtitle) {
	    String Actual=home.getTitle();
	    System.out.println(Actual);
	   String Expectedtitle="Salesboom.com - Home";
	   Assert.assertEquals(Actual, Expectedtitle);
	}
	

	@Then("Homepage url is displayed {string}")
	public void homepage_url_is_displayed(String Homepageurl) {
	    System.out.println(Homepageurl);
	   
	}
	
	

	@When("display error message {string}")
	public void display_error_message(String errormessage) {
		
		
	}

	

	@When("click on CampaignButton")
	public void click_on_campaign_button() {
	    // Write code here that turns the phrase above into concrete actions
	   home=new Homepage(driver);
	   home.CampaignButton();
	}
	

	@When("click on AddCampaign")
	public void click_on_add_campaign() {
		camp=new Campaigns(driver);
	   camp.AddCampaignsbutton();
	    throw new io.cucumber.java.PendingException();
	}








	}



	






	



