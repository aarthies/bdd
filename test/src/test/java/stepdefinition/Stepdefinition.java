package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
	public WebDriver driver;
	@Before
	public void setdriver() throws Throwable{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@After
	public void closebrowser() throws InterruptedException
	{
		
		Thread.sleep(1000);
		driver.close();
		
	}
	
	@Given("^user navigates profile page$")
	public void user_navigates_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
	}
        
                
        
	

	@When("^user enters source destination date$")
	public void user_enters_source_destination_date() throws Throwable {		
	    // Write code here that turns the phrase above into concrete actions
		WebElement x = driver.findElement(By.xpath("//input[@id = \"src\"]"));
		x.sendKeys("Chennai");

		//driver.findElement(By.xpath("//li[@data-id=\"123\"]")).click();
		WebElement z = driver.findElement(By.xpath("//input[@id = \"dest\"]"));
		z.sendKeys("Bangalore");
		Actions action = new Actions(driver);
		action.moveToElement(x).build().perform();
		WebElement x1 =driver.findElement(By.xpath("//li[contains(@data-id,'123')]"));
		x1.click();

		// action.moveToElement(z).build().perform();
		// WebElement z1 =driver.findElement(By.xpath("//li[@data-id=\"122\"]"));
		//driver.findElement(By.xpath("//i[@class=\"icon solr-icon icon-ic-city\"]")).click();
		WebElement k = driver.findElement(By.xpath("//span[@class=\"fl icon-calendar_icon-new icon-onward-calendar icon\"]"));
		k.click();

		//driver.findElement(By.xpath("//*[@id=rb-calendar_onward_cal]/table/tbody/tr[4]/td[3]")).click();

		List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		String R;
        
        for(WebElement e:dates)
        {
       		  R = e.getText();
        if(R.equalsIgnoreCase("9"))
        {
       	 e.click();
       	 break;
        }
        
        }
        Thread.sleep(4000);
        WebElement y = driver.findElement(By.xpath("//button"));
        y.click();
        
        Thread.sleep(4000);
        
   }
	
	
	

	

	@Then("^buses available page sucessfully displayed$")
	public void buses_available_page_sucessfully_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Chennai to Bangalore (Bengaluru) Bus Tickets Booking, Save upto 25% - redBus", driver.getTitle());
	
	}
	@When("^user click on available buses$")
	public void user_click_on_available_buses() throws Throwable {
		WebElement e = driver.findElement(By.xpath("//div[@class=\"onward-modify-btn g-button clearfix fl\"]"));
		e.click();
		WebElement e1 = driver.findElement(By.xpath("//input[@id=\"src\"]"));
		e1.clear();
		Thread.sleep(2000);
		e1.sendKeys("Bangalore");
		WebElement e2 = driver.findElement(By.xpath("//input[@id=\"dest\"]"));
		e2.clear();
		Thread.sleep(2000);
		e2.sendKeys("Chennai");
		driver.findElement(By.xpath("//button[@class=\" button ms-btn\"]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
	
	
	@Given("^user on payment page$")
	public void user_on_payment_page() throws Throwable {
		Thread.sleep(2000);
		driver.get("https://www.redbus.in/Pay/PaymentDetails");
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	
	}

	@When("^Page error$")
	public void enter_credit_card_details() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
	    
	    {
	    System.out.println("Page is not loaded");}}
	
	
	
	

	

	
	


}
