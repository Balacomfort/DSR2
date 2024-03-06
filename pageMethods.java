package methods;

import java.time.Duration;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.pageLocators;

public class pageMethods {

	public WebDriver ldriver;
	public pageLocators Ltr;
	WebDriverWait wait;
	public pageMethods(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void setUsername(String username)
	{
		Ltr= new pageLocators(ldriver);
		Ltr.txtUserName.sendKeys(username);

	}

	public void setPassword(String password)
	{
		Ltr= new pageLocators(ldriver);
		Ltr.txtPassword.sendKeys(password);
	}
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		Ltr.ldriver.quit();

	}

	public void clickSubmit()
	{
		Ltr= new pageLocators(ldriver);
		Ltr.btnLogin.click();
	}

	public void checktitle() 

	{
		if(Ltr.titlename.getText().contains("Dashboard"))
		{
			System.out.println("Login Was Succesfull with Valid Credentials");
		}
		else 
		{
			System.out.println("Login was UnSuccesfull with Valid Credentials");
			ldriver.close();
		}
	}

	public void error_msg()

	{
		if(Ltr.errormsg.getText().contains("Invalid credentials"))
		{
			System.out.println("Login Was UnSuccesfull with Invalid Credentials");
		}
		else {
			System.out.println("Login was Succesfull with invalid Credentials");
			ldriver.close();
		}
	}

	public void userreq_msg() 
	{
		if(Ltr.usreqmsg.getText().contains("Required"))

		{
			System.out.println("Login was UnSuccessfull with blank username and password");
		}
		else 
		{
			System.out.println("Login was Succesfull with blank username and password");
		}
	}

	public void myinfopage(){
		Ltr.myinfo.click();
	}

	public void Emp_id()
	{
		Ltr.empid.sendKeys(Keys.CONTROL + "a");

		Ltr.empid.sendKeys(Keys.DELETE);
		//Ltr.empid.click();
		//Ltr.empid.clear();
		Ltr.empid.sendKeys("EMP1234");

	}

	public void Lic_num() 
	{
		Ltr.empid.sendKeys(Keys.CONTROL + "a");

		Ltr.empid.sendKeys(Keys.DELETE);
		//Ltr.licnum.click();
		//Ltr.licnum.clear();
		Ltr.licnum.sendKeys("1234");

	}

	public void ssn_num() 
	{
		Ltr.empid.sendKeys(Keys.CONTROL + "a");

		Ltr.empid.sendKeys(Keys.DELETE);
		//Ltr.licnum.click();
		//Ltr.ssnnum.clear();
		Ltr.ssnnum.sendKeys("123");

	}

	public void sin_num()

	{
		Ltr.empid.sendKeys(Keys.CONTROL + "a");

		Ltr.empid.sendKeys(Keys.DELETE);
		//Ltr.sinnum.click();
		//Ltr.sinnum.clear();
		Ltr.sinnum.sendKeys("12");

	}

	public void dob_num()

	{
		Ltr.dob.click();

	}

	public void first_name()
	{
		Ltr.empid.sendKeys(Keys.CONTROL + "a");
		Ltr.empid.sendKeys(Keys.DELETE);
		//Ltr.firstname.clear();
		Ltr.firstname.sendKeys("Kalyan");

	}

	public void save_btn()

	{
		Ltr.savebtn.click();

	}

	public void Editbtn()
	{
		Ltr.Edit.click();


	}
	public void AddRowBtn()
	{
		Ltr.addbutton.click();
	}

	public void middle_name()

	{
		Ltr.empid.sendKeys(Keys.CONTROL + "a");
		Ltr.empid.sendKeys(Keys.DELETE);
		//Ltr.middlename.clear();
		Ltr.middlename.sendKeys("Pavan");

	}

	public void upload_jpgfile() 

	{
		Ltr.uploadfile.sendKeys("C:\\Users\\mbalamur\\Downloads\\org.OrangeProject\\images\\image.lion.jpg");
	}

	public void upload_pngfile() 

	{
		Ltr.uploadfile.sendKeys("C:\\Users\\mbalamur\\Downloads\\org.OrangeProject\\images\\image.png");
	}

	public void upload_giffile() 

	{
		Ltr.uploadfile.sendKeys("C:\\Users\\mbalamur\\Downloads\\org.OrangeProject\\images\\egGIF1MB.gif");
	}

	public void upload_docfile() 

	{
		Ltr.uploadfile.sendKeys("C:\\Users\\mbalamur\\Downloads\\org.OrangeProject\\images\\file-sample_100kB.doc");
	}


	public void docnot_allowed() 

	{
		if(Ltr.docnotallowed.getText().contains("File type not allowed")) 
		{
			System.out.println("Files with doc format are not allowed");
		}
		else
		{
			System.out.println("Files with doc format are allowed");
			ldriver.close();
		}
	}

	public void upload_morembjpgfile() 

	{
		Ltr.uploadfile.sendKeys("C:\\Users\\mbalamur\\Downloads\\org.OrangeProject\\images\\MicrosoftTeams-image.jpg");
	}


	public void Exceeded_file() 

	{
		if(Ltr.Exceededfile.getText().contains("Attachment Size Exceeded"))
		{
			System.out.println("Uploaded File Size is Exceeded");
		}
		else 
		{
			System.out.println("Uploaded File Size is Valid");
			ldriver.close();
		}
	}

	public void upload_morembpngfile() 

	{
		Ltr.uploadfile.sendKeys("C:\\Users\\mbalamur\\Downloads\\org.OrangeProject\\images\\MicrosoftTeams-image (3).png");
	}

	public void HRM_logo_visible() {
		boolean logovisible=Ltr.HRMlogo.isDisplayed();
		if(logovisible) {
			System.out.println("HRM logo was visible on default landed page");
		}
		else {
			System.out.println("HRM logo was not displayed on default landed page");
		}
	}

	public void Admin_page() {
		Ltr.Adminpage.click();
	}

	public void System_user_text() {
		System.out.println("Font Size = " + Ltr.Systemusertext.getCssValue("font-size"));
		System.out.println("Font Weight =" + Ltr.Systemusertext.getCssValue("width"));
	}

	public void Time_Page(){
		Ltr.TimePage.click();


	}

	public void Emp_name_tab() throws InterruptedException {

		//		 WebElement p=ldriver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		//enter text with sendKeys() then apply submit()
		//	      p.sendKeys("test tyt yui");
		// Explicit wait condition for search results

		//	      p.submit();
		//	      Ltr.Empnametab.sendKeys("test tyt yui");
		//		Thread.sleep(4000);
		//	ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//		ldriver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement element = ldriver.findElement(By.xpath("//img[@alt='profile picture']/following-sibling::p[1]"));

		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);
		String Text = ldriver.findElement(By.xpath("//img[@alt='profile picture']/following-sibling::p[1]")).getText();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ldriver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Text);
		Thread.sleep(3000);
		//				    wait = new WebDriverWait(ldriver, 10);
		@SuppressWarnings("unused")
		//		WebElement suggestionDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']")));
		//				ldriver.findElement(By.xpath("//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]")).click();

		WebElement firstOption = ldriver.findElement(By.xpath("//div[@role='listbox']"));
		firstOption.click();
		//		            suggestionDropdown.click();
		//		
		//		String text=  (ldriver.findElementBy.xpath(".oxd-userdropdown-name")).getText
		//				ldriver.findElementBy.xpath("//input[@placeholder='Type for hints...']").sendKeys(text);

		//ldriver.findElement(By.xpath(".oxd-userdropdown-name")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
		// now apply the command to paste
		//ldriver.findElement (By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));

	}

	public void Invalid_text() {
		if(Ltr.Invalidtext.getText().contains("Invalid")) {
			System.out.println("Invalid text is displayed while user enters invalid employee name ");
		}
		else {
			System.out.println("User able to see time sheet of valid employee name");
			ldriver.close();
		}
	}

	public void Dashboard_header() {
		String palletExpectedColor = "rgba(255, 146, 11, 1)".trim();
		String dashbackcolor = Ltr.backheadercolor.getCssValue("background-color").trim();
		System.out.println(dashbackcolor);	
		String hexbackcolor = Color.fromString(dashbackcolor).asHex();
		System.out.println(hexbackcolor);

		if(palletExpectedColor.equalsIgnoreCase(dashbackcolor)) {
			System.out.println("The color pallet in the Dashboard page is displayed correctly: " + dashbackcolor);
		}
		else {
			System.out.println("The color pallet in the Dashboard page is NOT displayed correctly: " + dashbackcolor);
		}
	}

	public void MyInfo_header() {
		String palletExpectedColor = "rgba(255, 146, 11, 1)".trim();
		String myinfobackcolor =Ltr.myinfoheader.getCssValue("background-color").trim();
		System.out.println(myinfobackcolor);	
		String hexbackcolor = Color.fromString(myinfobackcolor).asHex();
		System.out.println(hexbackcolor);

		if(palletExpectedColor.equalsIgnoreCase(myinfobackcolor)) {
			System.out.println("The color pallet in the MyInfo page is displayed correctly: " + myinfobackcolor);
		}
		else {
			System.out.println("The color pallet in the MyInfo page is NOT displayed correctly: " + myinfobackcolor);
		}
	}

	public void user_management() {

		//Select dropdownuser=new Select(usermanagement);
		//dropdownuser.selectByVisibleText("Users");
		Actions act=new Actions(ldriver);
		act.click(Ltr.usermanagement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();


	}

	public void add_button() {
		Ltr.addbutton.click();
	}
	public void addProjec() {
		Ltr.Enterproject.click();
	}

	public void userrole_drop() {
		Actions act=new Actions(ldriver);
		act.click(Ltr.userroledrop).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	}

	public void Employee_name() throws InterruptedException {
//		Ltr.Employeename.sendKeys("Paul Collings");
		Thread.sleep(3000);
		WebElement element = ldriver.findElement(By.xpath("//img[@alt='profile picture']/following-sibling::p[1]"));

		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);
		String Text = ldriver.findElement(By.xpath("//img[@alt='profile picture']/following-sibling::p[1]")).getText();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ldriver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Text);
		Thread.sleep(3000);
		WebElement firstOption = ldriver.findElement(By.xpath("//div[@role='listbox']"));
		firstOption.click();
		

	}

	public void status_dropdown() {
		Actions act=new Actions(ldriver);
		act.click(Ltr.statusdropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	public void Employee_username() {
		String username = "Murali" + new Random().nextInt(1000);
		Ltr.Employeeusername.sendKeys(username);
		
	}
	public void employee_password() {
		Ltr.employeepassword.sendKeys("John@123");
	}

	public void empconfrm_password() {
		Ltr.empconfrmpassword.sendKeys("John@123");
	}

	public void usersave_button() {
		Ltr.usersavebutton.click();
	}

	public void invalid_text() {
		String Expectedtext="Invalid";
		String Actualtext = Ltr.invalidtext.getText();
		Assert.assertEquals(Actualtext,Expectedtext);
		System.out.println("Invalid text is displayed");
	}

	public void verify_image() {
		Ltr = new pageLocators(ldriver);
		WebElement imgElement = Ltr.verify_image;
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(imgElement));
		boolean isImageDisplayed = Ltr.verify_image.isDisplayed();
		if(isImageDisplayed) {
			System.out.println("Static Image is displayed");
		}else {
			System.out.println("Static Image is not displayed");
		}
	}

	public void EditTimeSheeet() throws InterruptedException {
		WebElement Vieew = Ltr.View2;
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(Vieew));
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", Vieew);
		Vieew.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Ltr.Edit.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Ltr.Empnametab.sendKeys("re");
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		WebElement firstOption = ldriver.findElement(By.xpath("//div[@role='listbox']"));
		firstOption.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Select objSelect =new Select(ldriver.findElement(By.xpath("//div[text()='-- Select --']")));
//		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		objSelect.selectByVisibleText("Bug Fixes");
		Thread.sleep(2000);
		Ltr.Activity.click();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement firstOption1 = ldriver.findElement(By.xpath("//div[@role='listbox']"));
		firstOption1.click();
		Thread.sleep(2000);
		Ltr.Monday.sendKeys("2");
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Ltr.tue.sendKeys("2");
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Ltr.wed.sendKeys("2");
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Ltr.thu.sendKeys("2");
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Ltr.fri.sendKeys("2");
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Ltr.sat.sendKeys("2");
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Ltr.Sun.sendKeys("2");
		Thread.sleep(2000);
//		Ltr.btnLogin.click();
		
//		WebElement button = Ltr.btnLogin;
//		button.click();
		
		
	
		
		
		
		
		
		

	}
}
