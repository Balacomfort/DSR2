package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Resources.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import methods.pageMethods;


public class Stepdef28  extends TestBase{
public static WebDriver driver;
	
	public pageMethods lp;
	
	@SuppressWarnings("deprecation")
	@Given("User is Launch the browser with Chrome")
	public void User_is_launch_the_browser_with_chrome() {
		WebDriverManager.chromedriver().setup(); //common for all

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);		
		lp=new pageMethods(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	

	@Then("User giving the credentials Username as {string} and Password as {string}")
	public void User_giving_the_credentials_username_as_and_password_as(String username, String password) {
		lp.setUsername(username);
	    lp.setPassword(password);
	}
	
	@Then("User clicking on the Login button")
	public void User_clicking_on_the_login_button() {
		lp.clickSubmit();
	}
	@Then("User Clicks on Admin")
	public void User_clicks_on_admin() {
		lp.Admin_page();
	}
	
	@Then("user selects the users from user management dropdown")
	public void user_selects_the_users_from_user_management_dropdown() throws InterruptedException {
		lp.user_management();
		Thread.sleep(3000);
	}
	
	@Then("Click on add button")
	public void click_on_add_button() {
		lp.add_button();
	}

	@Then("User select the user from userrole dropdown")
	public void user_select_the_user_from_userrole_dropdown() throws InterruptedException {
		lp.userrole_drop();
		Thread.sleep(3000);
	}

	@Then("User enters the employee name")
	public void user_enters_the_employee_name() throws InterruptedException {
		lp.Employee_name();
	}

	@Then("User select the status of employee")
	public void user_select_the_status_of_employee() {
		lp.status_dropdown();
	}

	@Then("User enters the username")
	public void user_enters_the_username() {
		 lp.Employee_username();
	}

	@Then("User enters the password")
	public void user_enters_the_password() {
		lp.employee_password();
	}

	@Then("User enters the confirm password")
	public void user_enters_the_confirm_password() {
		lp.empconfrm_password();
	}

	@Then("User see invalid text")
	public void user_see_invalid_text() {
		lp.invalid_text();
	}
     
	@Then("Clicks on save button")
	public void clicks_on_save_button() throws InterruptedException {
		lp.usersave_button();
		Thread.sleep(3000);
	}
    
	@Then("Teardown the browser.")
	public void teardown_the_browser() {
		lp.ldriver.quit();
	}

}
