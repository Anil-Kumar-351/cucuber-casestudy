package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;

	@Given("user opens TestMe app")
	public void user_opens_TestMe_app() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\anil.kumar.akula\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
				 

	}

	@When("user enters use name as {string}")
	public void user_enters_use_name_as(String uname) {
		driver.findElement(By.name("userName")).sendKeys(uname);


	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String psd) {
		driver.findElement(By.name("password")).sendKeys(psd);
	}

	@Then("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.name("Login")).click();
	}

}
