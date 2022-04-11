package sprint2test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSprint {

	WebDriver driver;

	@When("user launch the chrome browser")
	public void user_launch_the_chrome_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");

	}

	@When("user open the url{string}")
	public void user_open_the_url(String url) throws Exception {
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(5000);
	}

	@When("user click on log in button")
	public void user_click_on_log_in_button() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();

	}

	@When("user enter email as{string} and password{string}")
	public void user_enter_email_as_and_password(String Email, String Password) throws Exception {
		driver.findElement(By.cssSelector("input#Email")).sendKeys("javedirfan123@gmail.com");
		driver.findElement(By.cssSelector("input#Password")).sendKeys("123456789");
		Thread.sleep(1000);
	}

	@When("click on login button")
	public void click_on_login_button() throws Exception {

		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(1000);
	}

	@When("page should be {string}")
	public void page_should_be(String Title) {
		driver.getTitle();

	}

	@When("click on the  search bar")
	public void click_on_the_search_bar() throws Exception {
		driver.findElement(By.id("small-searchterms")).sendKeys("Book");
		Thread.sleep(2000);
	}

	@When("search the product {string}")
	public void search_the_product(String string) throws Exception {
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		Thread.sleep(2000);
	}

	@Then("add the product to the cart")
	public void add_the_product_to_the_cart() throws Exception {
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
		Thread.sleep(3000);
	}

}
