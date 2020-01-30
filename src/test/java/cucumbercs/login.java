package cucumbercs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class login {
	WebDriver driver;
	@Given("User lauches googleapplication")
	public void user_lauches_googleapplication() {
		System.out.println("launches chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\sel k.\\chromedriver.exe");
		driver=new ChromeDriver();
	   
	}

	@Given("User launches TestMe")
	public void user_launches_TestMe() {
		System.out.println("navigates to application");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    
	}

	@Given("User clicks SignIn")
	public void user_clicks_SignIn() {
		 driver.findElement(By.linkText("SignIn")).click();
	   
	}

	@Given("User enters {string}")
	public void user_enters(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	    
	}
	@Given("User enters as {string}")
	public void user_enters_as(String string) {
		 driver.findElement(By.name("password")).sendKeys(string);
	}


	@Given("User clicks login")
	public void user_clicks_login() {
		 driver.findElement(By.name("Login")).click();
	    
	}



}
