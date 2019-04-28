package mypack;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gmailmethods {
public WebDriver driver;
public Scenario s;
@Before
public void method1(Scenario s)
{
	this.s=s;
}
public void screenShot() {
	byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	s.embed(ss, "image/png");
}
@Given("^launch gmail site$")

	public void method2() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch365\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
@Then("^title is \"(.*)\" for homepage$")
public void method3(String d) throws Exception
{
	String at=driver.getTitle();
	System.out.println("title of the web page is "+at);
	if(d.equalsIgnoreCase(at))
	{
		s.write("test is passed");
	}
	else
	{
		s.write("test failed");
		this.screenShot();
	}
}
	@And("^close site$")
	public void method4() throws Exception
	{
		driver.close();
		Thread.sleep(5000);
	}
@Then("^userid field is displyed$")
public void method5()
{
	try {
		if(driver.findElement(By.name("identifier")).isDisplayed())
			{
		s.write("test is passed for user id display");
			}
		}
	catch(Exception ex)
	{
		s.write("test is interupted");
		this.screenShot();
		Assert.fail();

	}
		
}
@When("^enter user id as \"(.*)\"$")
public void method6(String uid) throws Exception {
	driver.findElement(By.name("identifier")).sendKeys(uid);
Thread.sleep(5000);
}

@And("^click userid next$")
public void method7() throws Exception
{
	driver.findElement(By.id("identifierNext")).click();
	Thread.sleep(5000);
}
@Then("^validate output for \"(.*)\" criteria$")
public void method8(String c) throws Exception
{
	try {
		if(c.equalsIgnoreCase("valid") && driver.findElement(By.name("password")).isDisplayed())
		{
			s.write(" Test case passed for valid user id");	
		}
		else if(c.equalsIgnoreCase("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'Enter an email') or contains(text(),'find your Google Account')])[2] ")).isDisplayed())
		{
			s.write("Test case is passed for invalid userid");
		}
		else
		{
			s.write("Test case is failed for user id field");
			this.screenShot();
			Assert.fail();

		}
		}
	catch(Exception ex)
	{
		s.write("Test is interrrupted");
		this.screenShot();
		Assert.fail();

	}
}
@When("^enter password as \"(.*)\"$")
public void method9(String p) throws Exception
{
	driver.findElement(By.name("password")).sendKeys(p);
	Thread.sleep(5000);
}
@And("^click password next$")
public void method10() throws Exception
{
	driver.findElement(By.id("passwordNext")).click();
	Thread.sleep(5000);
}	
@Then("^validate result for \"(.*)\" criteria$")
public void method11(String pc) throws Exception
{
	try {
	if(pc.equalsIgnoreCase("valid") && driver.findElement(By.xpath("//*[text()='COMPOSE']")).isDisplayed())
	{
		s.write("Test case is passed for valid password");
	}
	else if(pc.equalsIgnoreCase("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'Enter a password') or contains(text(),'wrong password')])[2]")).isDisplayed())
	{
		s.write("Test case is passed for invalid password");
	}
	
	else
	{
		s.write("Test case is failed for invalid pasword");
		
		this.screenShot();
		Assert.fail();
	}
	
	}
	catch(Exception ex)
	{
		s.write("test case is interrupted");
		this.screenShot();
		Assert.fail();

	}
	
}


}

