package stepDefinitions;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.DemoWorkshopMethods;
import pageObjects.Add_to_cart_page;


public class AddtoCartSteps {
     WebDriver driver;
     Add_to_cart_page objweb;
     
     //Add_to_cart process
     
    @Given("^User is on home page$")
public void user_is_on_home_page() throws Throwable {
		objweb = new Add_to_cart_page(driver);
		driver=DemoWorkshopMethods.openBrowser();
		driver.navigate().to("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("psrkr@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("krishna123");
        objweb = PageFactory.initElements(driver,Add_to_cart_page.class );
	
}

    //Click on book link
    
@When("^User clicks on books link$")
public void user_clicks_on_books_link() throws Throwable {
	objweb.clickBooks();
    }

    //Select books and then add to cart

@When("^selects a book to add to cart$")
public void selects_a_book_to_add_to_cart() throws Throwable {
	objweb.clickFiction();
   
	  }

@When("^click on Add to cart$")
public void click_on_Add_to_cart() throws Throwable {
	objweb.clickAddToCart();
    }

    //Message displaying when book added to cart

@Then("^item is added to cart successfully$")
public void item_is_added_to_cart_successfully() throws Throwable {
    System.out.println("The product has been added to your shopping cart");
    Thread.sleep(3000);
    driver=DemoWorkshopMethods.closeBrowser();
    }


}
