package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {
	WebDriver driver;
	//Actions action=new Actions(driver);
	@Given("useropens signup page in testme app")
	public void useropens_signup_page_in_testme_app() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\anil.kumar.akula\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
			 
	}

	@When("enters username as {string}")
	public void enters_username_as(String username) {
		driver.findElement(By.name("userName")).sendKeys("anilkumar");
	    
	}

	@When("enters firstname as {string}")
	public void enters_firstname_as(String firstname) {
		driver.findElement(By.name("firstName")).sendKeys("aniil");
	}   
	@When("enters last name as {string}")
	public void enters_last_name_as(String lastname) {
		driver.findElement(By.name("lastName")).sendKeys("kumar"); 
	}	
	
@When("enters password as {string}")
public void enters_password_as(String password) {
	driver.findElement(By.name("password")).sendKeys("anilkumar114");
}

@When("enters confirm password as {string}")
public void enters_confirm_password_as(String confirmpassword) {
	driver.findElement(By.name("confirmPassword")).sendKeys("anilkumar114");
}
     @When("select gender")
     public void select_gender() {
    	 WebElement a= driver.findElement(By.xpath("//*[@id=\"gender\"]"));
    	 a.click();
   
}

	@When("enters email as {string}")
	public void enters_email_as(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys("asdf@gmail.com");
	}

	@When("enters mobile number as {string}")
	public void enters_mobile_number_as(String mobilenumber) {
		driver.findElement(By.name("mobileNumber")).sendKeys("9876543210");	    
	}

	@When("enters DOB as {string}")
	public void enters_DOB_as(String dob) {
		driver.findElement(By.name("dob")).sendKeys("10/08/2011");
	    
	}
	@When("enters address as {string}")
	public void enters_address_as(String address) {
	driver.findElement(By.name("address")).sendKeys("peringulathur"); 
	}

	@When("enter answer as {string}")
	public void enter_answer_as(String string) {
		driver.findElement(By.name("answer")).sendKeys("chennai");
	    
	}
	

	@Then("click on Register")
	public void click_on_Register() {
		driver.findElement(By.name("Submit")).click();
		driver.close();
	   
	}	

}
