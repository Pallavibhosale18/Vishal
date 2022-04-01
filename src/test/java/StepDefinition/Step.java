package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	WebDriver driver;
	
    @Given("^Open the Chromedriver and launch the application$")
    public void open_the_chromedriver_and_launch_the_application() throws Throwable {
    	String chromeDriver="webdriver.chrome.driver";
		String chromeLocation="C:\\Users\\pooja\\OneDrive\\Documents\\cucumber\\chromedriver\\chromedriver.exe";
		System.setProperty(chromeDriver, chromeLocation);
		WebDriver driver=new ChromeDriver();
        System.out.println("chromedriver application launch");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_username_and_password() throws Throwable {
    	driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abc@123");
		driver.findElement(By.tagName("button")).click();
      System.out.println("Enter username and password");
    }

    @Then("^Reset the credential$")
    public void reset_the_credential() throws Throwable {
    	driver.close();
    }

}

	