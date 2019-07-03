package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addtocart {
	WebDriver driver;
	@Given("open TestMeApp")
	public void open_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anil.kumar.akula\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/loginhere.htm");
	}

	@When("enter username as {string}")
	public void enter_username_as(String name1) {
		driver.findElement(By.name("userName")).sendKeys(name1);
	}

	@When("enter password as {string}")
	public void enter_password_as(String pasd1) {
		driver.findElement(By.name("password")).sendKeys(pasd1);
	}

	@When("click on login")
	public void click_on_login() {
		driver.findElement(By.name("Login")).click();
	    
	}

	@When("click on search button")
	public void click_on_search_button() {
		WebElement sear=driver.findElement(By.name("products"));
		sear.sendKeys("head");
	}

	@When("click on find buttons")
	public void click_on_find_buttons() {
		 WebElement find=driver.findElement(By.xpath("/html/body/div[1]/form/input"));
		  find.click();  
	}

	@Then("search for addtocart")
	public void search_for_addtocart() {
		WebElement tile=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"));
		tile.click();
		if (driver.getTitle().equals("View Cart"))
		{ 
			Assert.assertFalse(true);;
		}
		else
		{
			Assert.assertTrue(true);;
		}
	}
	   
	}


