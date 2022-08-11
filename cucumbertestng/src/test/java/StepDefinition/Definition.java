package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition {
	WebDriver driver;
	
	@Given("Open the browser and go to the Login page OrangeHRM")
	public void open_the_browser_and_go_to_the_login_page_orange_hrm() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    Thread.sleep(3000);
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("Enter the valid Name")
	public void enter_the_valid_name() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	}
	@When("Enter the valid password")
	public void enter_the_valid_password() {
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	}
	@When("Click on LoginButton")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

}
