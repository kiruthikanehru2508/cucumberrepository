package cucumbercs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;

public class prod {
	WebDriver driver;
	WebElement s;
	WebDriver s1;
	@Given("User opens the chromeapp")
	public void user_opens_the_chromeapp() {
		System.out.println("launches chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\sel k.\\chromedriver.exe");
		driver=new ChromeDriver();
	    
	}

	@Given("User opens the testme app")
	public void user_opens_the_testme_app() {
		System.out.println("navigates to application");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    
	}

	@Given("User SignIn")
	public void user_SignIn() {
		driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@Given("User enters username as {string}")
	public void user_enters_username_as(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	    
	}

	@Given("User  enters Password as {string}")
	public void user_enters_Password_as(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	   
	}

	@Given("User clicks login button")
	public void user_clicks_login_button() {
		driver.findElement(By.name("Login")).click();
	    
	}

	@Given("User search for the product he wants")
	public void user_search_for_the_product_he_wants() {
		 driver.findElement(By.name("products")).sendKeys("Headphone");
		 driver.findElement(By.xpath("//input[@name='val' and @value='FIND DETAILS']")).click();
	    
	}

	@Given("User cant move to next page without adding to next page")
	public void user_cant_move_to_next_page_without_adding_to_next_page() {
		
		String s=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).getText();
		
		Assert.assertEquals( s,"cart");
	    
	}



}
