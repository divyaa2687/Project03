package step_definition03;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_steps03 {
	
	WebDriver driver;
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\training_d4.05.02\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://localhost:8083/TestMeApp/");
		driver.manage().window().maximize();
		System.out.println("User is on Home Page");	
	}
	
	@When("User Navigate to Login Page")
	public void user_navigate_to_Login_page() {
		driver.findElement(By.linkText("SignIn")).click();
		System.out.println("User Navigate to Login Page");
	}
	
	
	@When("User enters {string} and {string}")
	public void user_enters_logins(String username, String password) {
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
	}
	
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		driver.findElement(By.linkText("SignOut")).click();
		//Assert.assertTrue(signout.isDisplayed());
		System.out.println("Message displayed Login Successfully");
		
	}

}
