package step_Defination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_Loginsteps {
	public static WebDriver driver;
	@Given("user open browser")
	public void user_open_browser() {
		
		driver=new ChromeDriver();
		
	}

	@And("user open the application")
	public void user_open_the_application() {
		
		driver.get("https://adactinhotelapp.com/index.php");
	 
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("Saketh1008");
	  driver.findElement(By.id("password")).sendKeys("Saketh1008@");
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.id("login")).click();
	   
	}

	@Then("user should succussfully completed the login functionality")
	public void user_should_succussfully_completed_the_login_functionality() {
	   
	}

	@And("user should naviagated into Search Hotel page")
	public void user_should_naviagated_into_search_hotel_page() {
		
		String Exp_title=driver.getTitle();
		String Act_title="Adactin.com - Search Hotel";
		
		if(Exp_title.equals(Act_title)) {
			Assert.assertTrue(true);
			System.out.println("test case passed");
		}
			else {
				System.out.println("test case failed");
				Assert.assertTrue(false);
				
			}
	
	  
	}


	}

