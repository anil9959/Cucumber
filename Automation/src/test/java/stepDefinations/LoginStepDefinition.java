package stepDefinations;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition{
	
	ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	 //WebDriver driver;
	public WebDriver getDriver() {
		return webDriver.get();
	}
	 
	 @Given("^user is already on Login Page \"([^\"]*)\"$")
	 public void user_already_on_login_page(String browser){
		 
		 switch (browser) {

	        case "chrome":
	            //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
	        	WebDriverManager.chromedriver().setup();
	            webDriver.set(new ChromeDriver());
	            
	            break;
	            
	        case "firefox":
	           // System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
	        	WebDriverManager.firefoxdriver().setup();
	            DesiredCapabilities dc = new DesiredCapabilities();
	            dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
	            webDriver.set(new FirefoxDriver(dc));
	            break;
	        }

		 
//	 System.setProperty("webdriver.chrome.driver","C:\\Users\\TT094\\Desktop\\Cucumber-TestNG-master\\Drivers\\chromedriver.exe");
//	 driver = new ChromeDriver();
		 webDriver.get().get("https://www.makemytrip.com"); 
		 webDriver.get().manage().window().maximize();
	 }
	
	 @And("^clicking on flight tab$")
	 public void clicking_on_flight_tab() throws InterruptedException{
	 Thread.sleep(5000);
	 webDriver.get().findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal ']")).click();
	 Thread.sleep(5000);
	 webDriver.get().findElement(By.xpath("//span[text()='Flights' and @class='chNavText darkGreyText']")).click();
	 }
	 
	 @And("^I entered source \"([^\"]*)\" and destination \"([^\"]*)\"$")
	 public void i_entered_source_and_destination(String source,String destination) throws InterruptedException{
	 Thread.sleep(5000);
	 webDriver.get().findElement(By.xpath("//*[@id='fromCity']")).click();
	 Thread.sleep(5000);
	 webDriver.get().findElement(By.xpath("//input[@placeholder='From']")).sendKeys(source);
	 Thread.sleep(5000);
	 webDriver.get().findElement(By.xpath("//*[@class='react-autosuggest__suggestions-list']/li[@id='react-autowhatever-1-section-0-item-0']")).click();
	 Thread.sleep(5000);
//	 driver.findElement(By.xpath("//*[@id='toCity']")).click();
	 webDriver.get().findElement(By.xpath("//input[@placeholder='To']")).sendKeys(destination);
	 Thread.sleep(5000);
	 webDriver.get().findElement(By.xpath("//*[@class='react-autosuggest__suggestions-list']/li[@id='react-autowhatever-1-section-0-item-0']")).click();
	 Thread.sleep(5000);
	 webDriver.get().findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--today']")).click();
	 }
	 
	 @When("^I click on search button$")
	 public void i_click_on_search_button() throws InterruptedException{
		 Thread.sleep(5000);
		 webDriver.get().findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
	//span[@class="actual-price"]
	 }
	 
	 @Then("^flights should be displayed and Book Cheapest Flight$")
	 public void flights_should_be_displayed_and_Book_Cheapest_Flight() throws InterruptedException{
	 Thread.sleep(10000);
	 List<WebElement> webelement=webDriver.get().findElements(By.xpath("//div[@class='fli-list-body-section']//span[@class='actual-price']"));
	 int minprice=Integer.MAX_VALUE;
	 String Minval="";
	 for(int i=0;i<=webelement.size()-1;i++)
	 {
		 if(minprice>Integer.parseInt(webelement.get(i).getText().split("\\s+")[1].replace(",","")))
		 {
			 Minval=webelement.get(i).getText().split("\\s+")[1];
		 }
	 }
	 System.out.println("Min Price:"+Minval);
	 
	 webDriver.get().findElement(By.xpath("//div[@class='dept-options-section clearfix']//span[contains(text(),'"+Minval+"')]/../../..//button[@class='ViewFareBtn  text-uppercase ']")).click();
	 Thread.sleep(2000);
	 webDriver.get().findElement(By.xpath("//span[contains(text(),'"+Minval+"')]/../../..//button[@class='btn fli_primary_btn text-uppercase ']")).click();
	 Thread.sleep(5000);
	 
//	 while(webelement.hasNext())
//	 {
//		 String flightchargs=webelement.next().getText().split("\\s+")[1].replace(",","");
//		 System.out.println(flightchargs);
//	 }
	 }
	
	 @And("^Close the browser$")
	 public void close_the_browser(){
		 webDriver.get().quit();
	 }
	
	
	

}
