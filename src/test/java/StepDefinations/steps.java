package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CummberShopDemo.CummberWebShopPageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver;
	LoginPage lp= new LoginPage(driver);
	@Given("user launch chrome Browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Photo-Framework\\CummberWebShop\\Drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
	   
	}
	@Then("User browse application URL {string}")
	public void user_browse_application_url(String url) {
		driver.get(url);
	    
	}
	@Then("Login Link should display")
	public void login_link_should_display() {
		System.out.println("Its showing the loginlink");
	    
	}
	@When("user clicks on Login  link")
	public void user_clicks_on_login_link() {
		lp.ClickonLoginLink();
	   
	}
	@Then("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.EnterUserName(email);
		lp.EnterPassword(password);
	  
	}
	@Then("User click on login button")
	public void user_click_on_login_button() {
		lp.ClickonLoginButton();
	    
	}
	@Then("Home page title should be {string}")
	public void home_page_title_should_be(String ActualTitle) {
		
		String Expected=driver.getTitle();
		if(ActualTitle.equalsIgnoreCase(Expected))
		{
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		}
	    
	
	@Then("Close Browser")
	public void close_browser() {
		driver.close();
	    
	}



	
}
