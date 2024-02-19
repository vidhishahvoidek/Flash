package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.eo.Do;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoInit {
	
	public static ChromeDriver driver;

    //WebDriver driver = null;
    

	@Given("^I have variable a$")
	public void i_have_variable_a() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int a$ = 50;
	    throw new PendingException();
	}

	@Given("^I have variable b$")
	public void i_have_variable_b() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int b$ = 10;
	    throw new PendingException();
	}

	@When("^I multiplication a and b$")
	public void i_multiplication_a_and_b() throws Throwable {
	    int b = 10;
		int a = 5;
		// Write code here that turns the phrase above into concrete actions
		int mul$ = a*b;
	    throw new PendingException();
	}

	@Then("^I display the Result$")
	public void i_display_the_Result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Multiplication of #{@a} and #{@b} is #{@mul}");
		
	    throw new PendingException();
	}

}
