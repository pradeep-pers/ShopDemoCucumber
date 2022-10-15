package CummberShopDemo.CummberWebShopPageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement Loginlnk;
	
	@FindBy(xpath="//body//div[@class='inputs']//input[@name='Email']")
	WebElement Email;
	@FindBy(xpath="//body//div[@class='inputs']//input[@name='Password']")
	WebElement password;
	@FindBy (xpath="//input[@class='button-1 login-button']")
	WebElement LoginBtn;
	@FindBy(xpath="//body//div[2]//div[1]/ul/li//a[@class='account']")
	WebElement MyAccount;
			
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement Logoutlnk;
	@FindBy(xpath="//body//div[4]//div[3]//input[@class='button-1 register-button']")
	WebElement RegisterButton;
			@FindBy(xpath="//body//div[@class='header-menu']//ul[@class='top-menu']//li[2]//a")
	WebElement ClickOnComputer;
			
	public void  ClickonLoginLink()
	
	
	{
		Loginlnk.click();
	}
	public void EnterUserName(String name)
	{
		Email.clear();
		Email.sendKeys(name);
	}
	public void EnterPassword(String pswd)
	{
		password.clear();
		password.sendKeys(pswd);
	}
	public void ClickonLoginButton()
	{
		LoginBtn.click();
	}
	
	public  void GetMyAccountName()
	{
		String AccountLoginName= MyAccount.getText();
		System.out.println("User Logged in to The Application using UserID:" +AccountLoginName);
	}
	public void ClickonLogoutLink()
	{
		Logoutlnk.click();
	}
	public void userRegistration()
	{
		RegisterButton.click();
	}
	public void ClikOnComputer()
	{
		ClickOnComputer.click();
	}
	
	public void  VerifyHeaderMenu()
	{
		ArrayList<String>ExpectedHederMenu=new ArrayList<String>();
		ArrayList<String>ActualHederMenu=new ArrayList<String>();
		ActualHederMenu.add("BOOKS");
		ActualHederMenu.add("COMPUTERS");
		ActualHederMenu.add("ELECTRONICS");
		ActualHederMenu.add("APPAREL & SHOES");
		ActualHederMenu.add("DIGITAL DOWNLOADS");
		ActualHederMenu.add("JEWELRY");
		ActualHederMenu.add("GIFT CARADS");
		
		List<WebElement> Menu=driver.findElements(By.xpath("//body//ul[@class='top-menu']"));
		for(WebElement i:Menu)
		{
			ExpectedHederMenu.add(i.getText());
		}
		System.out.println("Print the Value of Acual HeaderMenu:" +ExpectedHederMenu);
		if(ActualHederMenu.containsAll(ExpectedHederMenu))
		{
			System.out.println("HederMenu Item Matches");
		}
		else
		{
			System.out.println("HederMenu Item  doesnot Matches");
		}
		
	}
	
	public void DataDrivenEmail(String username, String pwd)
	{
		Email.clear();
		Email.sendKeys(username);
		password.clear();
		password.sendKeys(pwd);
		
		
	}
	@FindBy(xpath="//input[@id='small-searchterms']")
	WebElement SearchText;
	@FindBy(xpath="//body//div[@class='search-box']//input[@type='submit']")
	WebElement SearchButton;
	public void UserEntersSearchText(String txt)
	{
		SearchText.clear();
		SearchText.sendKeys(txt);
	}
	
	public void UserClicksonSerachButton()
	{
		SearchButton.click();
	}
	public void VerifyTitle(String title)
	{
		String ExpectedTitle=driver.getTitle();
		System.out.println("Expepteted Page Title is:"+ExpectedTitle);
		if(ExpectedTitle.equalsIgnoreCase(title))
		{
			System.out.println("Page Match");
		}
		else
		{
			System.out.println("Page doesnt Match");
		}
	}
	
	public void VerifyHeaderText()
	{
		ArrayList<String >ExpectedHDtext=new ArrayList<String>();
		ExpectedHDtext.add("Register");
		ExpectedHDtext.add("Log in");
		ExpectedHDtext.add("Shopping cart(0) ");
		ExpectedHDtext.add("Wishlist (0)");
		System.out.println("Expected Header Text should be:"+ExpectedHDtext);
		
		ArrayList<String>ActualHDtext=new ArrayList<String>();
		List<WebElement> HDtext= driver.findElements(By.xpath("//body//div[@class='header-links']//ul//li//a"));
		for(WebElement i: HDtext)
		{
			ActualHDtext.add(i.getText());
		}
		System.out.println("Actual Header Text Should be:"+ActualHDtext);
		
		if(ActualHDtext.containsAll(ExpectedHDtext))
		{
			System.out.println("Header Text are matching");
		}
		else
		{
			System.out.println("Header Text are not matching");
		}
	}
	

}



	
	