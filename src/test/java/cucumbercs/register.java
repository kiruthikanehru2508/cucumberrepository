package cucumbercs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class register {
	WebDriver driver;
	WebElement s1;
	@Given("User launches googlechrome")
	public void user_launches_googlechrome() {
		System.out.println("launches chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\sel k.\\chromedriver.exe");
		driver=new ChromeDriver();
	   
	}

	@Given("User navigates testme")
	public void user_navigates_testme() {
		System.out.println("navigates to application");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("User click Signup")
	public void user_click_Signup() {
		System.out.println("signup");
		driver.findElement(By.linkText("SignUp")).click();
	}

	@Given("User enters username {string}")
	public void user_enters_username(String string) {
		System.out.println("username"+string);
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@Given("User enters firstname {string}")
	public void user_enters_firstname(String string) {
		driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@Given("User enters lastname {string}")
	public void user_enters_lastname(String string) {
		driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@Given("User enters password {string}")
	public void user_enters_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}    

	@Given("User enters confirm password {string}")
	public void user_enters_confirm_password(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@Given("User enters Gender {string}")
	public void user_enters_Gender(String string) {
		driver.findElement(By.xpath("//input[@name='gender' and @value='Female']")).click();
	}

	@Given("User enters email {string}")
	public void user_enters_email(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@Given("User enters phone num {string}")
	public void user_enters_phone_num(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@Given("User enters dob {string}")
	public void user_enters_dob(String string) {
		 driver.findElement(By.name("dob")).sendKeys(string);
	}

	@Given("User enters address {string}")
	public void user_enters_address(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
	}

	@Given("User enters Security question {string}")
	public void user_enters_Security_question(String string) {
		 Select s1=new Select(driver.findElement(By.name("securityQuestion")));
		 s1.selectByVisibleText(string);
	}

	@Given("User enters answer {string}")
	public void user_enters_answer(String string) {
		driver.findElement(By.name("answer")).sendKeys(string);
	}

	@Given("User clicks Register")
	public void user_clicks_Register() {
		driver.findElement(By.xpath("//input[@name='Submit' and @value='Register']")).click();
		  
	}


}