package cucumbercs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;

public class cart {
	WebDriver driver;
	WebElement s;
	@Given("User opens chrome application")
	public void user_opens_chrome_application() {
		System.out.println("launches chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\sel k.\\chromedriver.exe");
		driver=new ChromeDriver();
	   
		
	}

	@Given("User opens test me application")
	public void user_opens_test_me_application() {
		System.out.println("navigates to application");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    
	  
	}

	@Given("User Signin")
	public void user_Signin() {
		driver.findElement(By.linkText("SignIn")).click();
		   
	}

	@Given("User enter username as {string}")
	public void user_enter_username_as(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	    
	}

	@Given("User enter password {string}")
	public void user_enter_password(String string) {
		 driver.findElement(By.name("password")).sendKeys(string);
	   
	}
	@Given("User click login")
	public void user_click_login() {
		driver.findElement(By.name("Login")).click();
	}


	@Given("User search the product on text box")
	public void user_search_the_product_on_text_box() {
		 driver.findElement(By.name("products")).sendKeys("Headphone");
		 driver.findElement(By.xpath("//input[@name='val' and @value='FIND DETAILS']")).click();
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		 String s=driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[1]/div/div/h4")).getText();
		 Assert.assertEquals( s,"Headphone");
		
	   
	}

	@Given("User found the product")
	public void user_found_the_product() {
	  
	}


}
