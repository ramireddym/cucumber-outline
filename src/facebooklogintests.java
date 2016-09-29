import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class facebooklogintests {
	WebDriver driver;
	/*@Given("^Browser as (\\S) And Url as (\\S)$")
	public void browser_as_firefox_And_Url_as_http_www_facebook_com(String browser, String url) throws Throwable {
		if("firefox" != null)
		{
			driver=new FirefoxDriver();
			driver.get("http://www.facebook.com ");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
//fefrrefr
	@When("^Username as ramireddy(\\S) And Password as (\\S)$")
	public void username_as_ramireddy_gmail_com_And_Password_as(String username, String password) throws Throwable {
		String username = Integer.toString(user);
		String password = Integer.toString(pass);
		WebElement ele=driver.findElement(By.id("email"));
		ele.clear();
		ele.sendKeys(username);
		WebElement el=driver.findElement(By.id("pass"));
		el.clear();
		el.sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
	}*/
	
	@Given("^Browser as \"([^\"]*)\" And Url as \"([^\"]*)\"$")
	public void browser_as_And_Url_as(String browser, String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(browser.trim().equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.trim().equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Venkata Rami Reddy\\testing softwares\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browser.trim().equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Venkata Rami Reddy\\testing softwares\\chromedriver.exe");
			driver=new ChromeDriver();	 
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@When("^Username as \"([^\"]*)\" And Password as \"([^\"]*)\"$")
	public void username_as_And_Password_as(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement ele=driver.findElement(By.id("email"));
		ele.clear();
		ele.sendKeys(username);
		WebElement el=driver.findElement(By.id("pass"));
		el.clear();
		el.sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Then("^Facebook Should be login Sucessfully$")
	public void facebook_Should_be_login_Sucessfully() throws Throwable {
		System.out.println("welcome to facebook");   
	}

	/*@Given("^Browser as Chrome And Url as http://www\\.facebook\\.com$")
	public void browser_as_Chrome_And_Url_as_http_www_facebook_com() throws Throwable {
		if("Chrome" != null)
		{
			System.setProperty("webdriver.chrome.driver","D:\\Venkata Rami Reddy\\testing softwares\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.facebook.com ");
		}	
	}

	@Given("^Browser as IE And Url as http://www\\.facebook\\.com$")
	public void browser_as_IE_And_Url_as_http_www_facebook_com() throws Throwable {

		if("IE" != null)
		{
			System.setProperty("webdriver.ie.driver", "D:\\Venkata Rami Reddy\\testing softwares\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("http://www.facebook.com ");
		}
	}*/
	@After
	public void quite()
	{
		driver.quit();}
}
