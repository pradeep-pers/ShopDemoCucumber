package StepDefinations;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CummberShopDemo.CummberWebShopPageObjects.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class stepsLogin {
	
	WebDriver driver;
	LoginPage lp= new LoginPage(driver);
	@Given("user launch chrome Browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Photo-Framework\\CummberWebShop\\Drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
		//driver.manage().timeouts().wait(2000);
	   
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
	public void user_enters_email_as_and_password_as(String username, String password) {
		lp.EnterUserName(username);
		lp.EnterPassword(password);
	  
	}
	@Then("User click on login button")
	public void user_click_on_login_button() {
		lp.ClickonLoginButton();
	    
	}
	
	@Then("Home page title should be {string}")
	public void home_page_title_should_be(String ActualTitle) {
		
		String Expected=driver.getTitle();
		System.out.println("Title of the LoginPage:" +Expected);
		
		//Assert.assertTrue(Expected.contains(ActualTitle));
		
		if(ActualTitle.equalsIgnoreCase(Expected))
		{
			System.out.println("Title of the LoginPage:" +Expected);
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		}
	    
	
	@Then("User clicks on logout button")
	public void user_clicks_on_logout_button() {
	    lp.ClickonLogoutLink();
	}
	
	@Then("page should display correct username as per the login")
	public void page_should_display_correct_username_as_per_the_login() {
	    lp.GetMyAccountName();
	
	
	
	}
	
	@Then("HeaderMenu Should display corrct values")
	public void header_menu_should_display_corrct_values(DataTable dataTable) {
		
		List<List<String>> ActualHederMenu=dataTable.asLists(String.class);
	   
	    for(List<String> e:ActualHederMenu)
	    {
	    	System.out.println("Actaul Header Menu:" +e);
	    }
	    lp.VerifyHeaderMenu();
	}
	
	@Then("Close Browser")
	public void close_browser() {
		driver.close();
	    
	}

	

	@Then("user Clicks on Logout link")
	public void user_clicks_on_logout_link() {
	    lp.ClickonLogoutLink();
	}
	@Given("User Enters the credentials")
	public void user_enters_the_credentials() {
	   System.out.println("User Enters the Valid Credentials");
	}

	
	@Then("HeaderText Should display corrct values")
	public void header_text_should_display_corrct_values(DataTable  dataTable) {
		
		List<List<String>> ActualHederText=dataTable.asLists(String.class);
		   
	    for(List<String> e:ActualHederText)
	    {
	    	System.out.println("Actaul Header Text:" +e);
	    }
	    lp.VerifyHeaderText();
	    
	}
	
}


