package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	   System.out.println("open login");
	}

	@When("user provides the correct credentials")
	public void user_provides_the_correct_credentials() {
		System.out.println("enter credentails");
	}

	@Then("user rendered to TestMeApp home page")
	public void user_rendered_to_TestMeApp_home_page() {
		System.out.println("testme -HOme");
	}
}
