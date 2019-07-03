package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Search {
	WebDriver driver;
	@Given("user opens login page")
	public void user_opens_login_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\anil.kumar.akula\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/loginhere.htm");
				 
	}

	@When("enters usernamee as {string}")
	public void enters_usernamee_as(String unamee) {
		driver.findElement(By.name("userName")).sendKeys(unamee);
	}

	@When("enters passwordd as {string}")
	public void enters_passwordd_as(String psdd) {
		driver.findElement(By.name("password")).sendKeys(psdd);
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@When("user search for a product{string}")
	public void user_search_for_a_product(String products) {
		WebElement sear=driver.findElement(By.name("products"));
		sear.sendKeys("head");
		//driver.findElement(By.name("val")).click();
		//Actions action= new Actions(driver);
		//action.keyDown(sear, Keys.ARROW_DOWN).sendKeys(sear, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().build().perform();
	}

	@When("click on find button")
	public void click_on_find_button() {
	  WebElement find=driver.findElement(By.xpath("/html/body/div[1]/form/input"));
	  find.click();
	}
}
