package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageLocators {

	public WebDriver ldriver;
	public pageLocators(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(xpath = "//input[@name='username']")
	public WebElement txtUserName;
	

	@FindBy(xpath="//input[@name='password']")
	public WebElement txtPassword;
	

	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	public WebElement btnLogin;
	
	@FindBy(xpath="//span/h6[text()='Dashboard']")
	@CacheLookup
	public WebElement titlename;
	
	@FindBy(xpath="//p[text()='Invalid credentials']")
	@CacheLookup
	public WebElement errormsg;
	
	@FindBy (xpath="//span[text()='Required']")
	@CacheLookup
	public WebElement usreqmsg;
	
	@FindBy (xpath="//span[text()='My Info']")
	public WebElement myinfo;
	
	@FindBy (xpath = "//i[@class='oxd-icon bi-plus']")
	public WebElement AddRow;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
	public WebElement empid;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
	public WebElement licnum;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/input[1]")
	public WebElement ssnnum;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[3]/div[2]/div[1]/div[2]/input[1]")
	public WebElement sinnum;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	public WebElement dob;
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement firstname;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement savebtn;
	
	@FindBy(xpath="//input[@name='middleName']")
	public WebElement middlename;
	
	@FindBy(xpath="//input[@type='file']")
	public WebElement uploadfile;
	
	@FindBy(xpath="//span[text()='File type not allowed']")
	public WebElement docnotallowed;
	
	@FindBy(xpath="//span[text()='Attachment Size Exceeded']")
	public WebElement Exceededfile;
	
	@FindBy(xpath="//img[@alt='client brand banner']")
	public WebElement HRMlogo;
	
	@FindBy(xpath="//span[text()='Admin']")
	public WebElement Adminpage;
	
	@FindBy(xpath="//h5[text()='System Users']")
	public WebElement Systemusertext;
	
	@FindBy(xpath="//span[text()='Time']")
	public WebElement TimePage;
	
	
	
	@FindBy(xpath="//span[text()='Invalid']")
	public WebElement Invalidtext;
	
	@FindBy(xpath="//header[@class='oxd-topbar']/div[1]")
	public WebElement backheadercolor;
	
	@FindBy(xpath="//header/div[1]")
	public WebElement myinfoheader;
	
	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item']")
	@CacheLookup
	public WebElement usermanagement;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	@CacheLookup
	public WebElement addbutton;
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
	public WebElement Enterproject;
	
	
	
	@FindBy(xpath="(//div[text()='-- Select --'])[1]")
	@CacheLookup
	public WebElement userroledrop;
	
	@FindBy(xpath="(//label[text()='Employee Name']/following::input)[1]")
	@CacheLookup
	public WebElement Employeename;
	
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	@CacheLookup
	public WebElement statusdropdown;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	@CacheLookup
	public WebElement Employeeusername;
	
	@FindBy(xpath="//input[@type='password']")
	@CacheLookup
	public WebElement employeepassword;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	@CacheLookup
	public WebElement empconfrmpassword;
	
	@FindBy(xpath="//button[text()=' Save ']")
	@CacheLookup
	public WebElement usersavebutton;
	
	@FindBy(xpath="//span[text()='Invalid']")
	@CacheLookup
	public WebElement invalidtext;
	
	@FindBy(xpath="//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
	public WebElement verify_image;
	
	 @FindBy(xpath = "(//button[text()=' View '])[2]")
	 public WebElement View2;
	 
	 @FindBy (xpath = "//button[text()=' Edit ']")
		public WebElement Edit;
	 
	 @FindBy(xpath="//input[@placeholder='Type for hints...']")
		public WebElement Empnametab;
	 
	 @FindBy(xpath = "//div[text()='-- Select --']")
	 public WebElement Activity;
	 
	 
	 @FindBy(xpath = "(//label[text()='Project']/following::input)[2]")
	 public WebElement Monday;
	 
	 @FindBy(xpath = "(//label[text()='Project']/following::input)[3]")
	 public WebElement tue;
	 
	 @FindBy(xpath = "(//label[text()='Project']/following::input)[4]")
	 public WebElement wed;
	 
	 @FindBy(xpath = "(//label[text()='Project']/following::input)[5]")
	 public WebElement thu;
	 
	 @FindBy(xpath = "(//label[text()='Project']/following::input)[6]")
	 public WebElement fri;
	 
	 @FindBy(xpath = "(//label[text()='Project']/following::input)[7]")
	 public WebElement sat;
	 
	 @FindBy(xpath = "(//label[text()='Project']/following::input)[8]")
	 public WebElement Sun;
	 
	 
}
