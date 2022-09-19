package stepdefinations;
//package stepdefinations;
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import com.pages.Add_on_service;
//import com.pages.CologneSelection;
//import com.pages.HomePage;
//import com.pages.LoginPage;
//import com.pages.ProductStore;
//import com.pages.ProductlistPage;
//import com.pages.SignupPage;
//
//import appHooks.ApplicationHooks;
//import cucumberAutomation.Base;
//import io.cucumber.java.en.And;
//
////import com.qa.factory.DriverFactory;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//public class CologenStepDef {
//	
//	public WebDriver driver;
//	LoginPage l;
//	CologneSelection c;
//	HomePage h;
//	
//	
//	@Given("^user is in landing page$")
//	public void user_is_in_landing_page() throws Throwable
//	{
//		System.out.println("User is in landing page");
//		
//		Base base = new Base();
//		driver= base.getDriver();
//		driver.manage().window().maximize();
//	Thread.sleep(3000);
//	
//	}
//	
//	
//	  
//	   
//	   @When("^user enters valid username$")
//	  
//	    public void user_enters_valid_Username() throws Throwable {
//	        
//	    	
//   l=new LoginPage(driver);
//   l.enter_username().sendKeys("jibutest@getnada.com");
////	  
//	    	Thread.sleep(3000);
//	    	
//	    }
//	   
//	   @When("^user enters vaid  password$")
//		  
//	    public void user_enters_valid_password() throws Throwable {
//	        
//	    	
//  l=new LoginPage(driver);
//  l.enterpassword().sendKeys("etail_1202");
// 
// 	Thread.sleep(3000);
//	    	
//	    }
//	   
//	   @And("^clicks on Sign-in button$")
//		  
//	    public void known_user_clicks_signin() throws Throwable {
//	        
//	    	
//   l=new LoginPage(driver);
//   l.Rememberme().click();
//  l.clicksignIn().click();
//
//	    	Thread.sleep(5000);
//	    	
//	    }
//	@Then("^user select Bookit from dashboard$")
//	public void user_select_Bookit_from_dashboard() throws Throwable
//	{	
//		WebElement Source = driver.findElement(By.id("dashboard-toggle"));
//		  Select dd1=new Select(Source);
//		  dd1.selectByValue("bookit_only");
//		Thread.sleep(5000);
//		 System.out.println("Passed!");
//	
//	}
//	 @Then("^user click on booking tab$")
//	    public void user_clicks_signinlink() throws Throwable {
//	        
//	    
//	    h=new HomePage(driver);
//     h.user_click_booking().click();	  
//	    	Thread.sleep(3000);
//	    	
//	    }
//	
//	 @Then("^user click on Configuration$")
//	    public void  user_click_on_Configuration() throws Throwable {
//	        
//	    
//	    h=new HomePage(driver);
//     h.user_click_configuration().click();	  
//	    	Thread.sleep(7000);
//	    	
//	    }
//	
//	@Then("^user clicks on cologne selection$")
//	public void user_clicks_on_cologne_selection() throws Throwable {
//		
//		System.out.println("User clicks on the link Cologne Selection");
//		Thread.sleep(3000);
//		c = new  CologneSelection(driver);
//		c.selectCologne().click();
//		Thread.sleep(3000);
//		
//	}
//		
//
//	@Then("^verify user can create new cologne selection$")
//	public void verify_user_can_create_new_cologne_selection() throws Throwable {
//		
//		System.out.println("Verify whether user can create a new cologne selection");
//		c = new CologneSelection(driver);
//		c.createNew().click();
//		Thread.sleep(1000);
//		c.enterCologneName().sendKeys("PetLogix AUT");
//		Thread.sleep(3000);
//		c.enterIndex().sendKeys("5");
//		c.addCologne().click();
//		if(c.popupMessage().getText().equalsIgnoreCase("Cologne added successfully")) {
//			System.out.println("Cologne added successfully");
//			System.out.println("Passed!");
//		}
//		else {
//			System.out.println("Cologne already exist with name PetLogix AUT_48");
//			System.out.println("Failed!");
//		}
//		
//		Thread.sleep(3000);
//	}
//	
//
//	@Then("^verify user can create cologne selection with existing name$")
//	public void verify_user_can_create_cologne_selection_with_existing_name() throws Throwable {
//		
//		
//		System.out.println("Verify whether user can create cologne selection with existing name");
//		String name="PetLogix AUT_48";
//		String msg="Cologne already exist with name "+name;
//		c = new CologneSelection(driver);
//		c.createNew().click();
//		Thread.sleep(1000);
//		c.enterCologneName().sendKeys(name);
//		Thread.sleep(1000);
//		c.addCologne().click();
//		Thread.sleep(3000);
//		if(c.popupMessage().getText().equalsIgnoreCase("Cologne already exist with name "+name)){
//			System.out.println("Cologne already exist with name "+name);
//			System.out.println("Passed!");
//		}
//		else {
//			System.out.println("Cologne added successfully");
//			System.out.println("Failed!");
//		}
//		Thread.sleep(3000);
//	
//	}
//	
//	@Then("^verfiy user can serach from cologne selection page$")
//	public void user_searche_the_cologne_selection() {
//		
//		System.out.println("Verify whether user can serach from the cologne selection listing page");
//		c = new CologneSelection(driver);
//		String name="PetLogix AUT_48";
//		c.selectCologne().click();
//		c.searchCologne().sendKeys(name);
//		c.enterSubmit().click();
//		
////		for(WebElement item : c.selectCologneItem()) {
////			Assert.assertEquals(item.getText(), name);
////			System.out.println("The cologne"+name+"is found");
////			break;
////		}
////		
//	}
//	
//	@Then("^verify user can inactive from cologne selection$")
//	public void verify_user_can_inactive_from_cologne_selection() throws Throwable {
//		
//		System.out.println("Verify whether user is able to inactive from the cologne selections listing page");
//		c = new CologneSelection(driver);
//		String msg ="Cologne updated successfully";
//		Thread.sleep(1000);
//		if(driver.findElement(By.xpath("//div[@class='active-area mb-3']")).getText().equalsIgnoreCase("Active")) {
//			c.clickToggle().click();
//			c.clickSave().click();
//			WebDriverWait w = new WebDriverWait(driver,5);
//			String actualmsg = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Toastify__toast-body']"))).getText();
//			Assert.assertEquals(actualmsg, msg);
//		}
//		else {
//			System.out.println("Failed!");
//		}
//	}
//	
//	@Then("^verify user can active from cologne selection$")
//	public void verify_user_can_active_from_cologne_selection() throws Throwable {
//		
//		System.out.println("Verify whether user is able to active from the cologne selections listing page");
//		c = new CologneSelection(driver);
//		String msg ="Cologne updated successfully";
//		
//		c.selectCologne().click();
//		c.searchCologne().sendKeys("testtDogss");
//		c.enterSubmit().click();
//		Thread.sleep(1000);
//		if(driver.findElement(By.xpath("//div[@class='active-area mb-3']")).getText().equalsIgnoreCase("Inactive")) {
//			c.clickToggle().click();
//			c.clickSave().click();
//			WebDriverWait w = new WebDriverWait(driver,5);
//			String actualmsg = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Toastify__toast-body']"))).getText();
//			Assert.assertEquals(actualmsg, msg);
//		}
//		else {
//			System.out.println("Failed!");
//		}
//		
//		
//	}
//	
//	@Then("^verify user can delete a cologne selection$")
//	public void verify_user_can_delete_a_cologne_selection() throws Throwable {
//		
//		System.out.println("Verify whether user can delete a cologne selection");
//		c = new CologneSelection(driver);
//		String msg ="Cologne removed successfully";
//		
//		c.searchCologne().sendKeys("PetLogix AUT_48");
//		c.enterSubmit().click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[text()='Delete']")).click();
//		
//		driver.findElement(By.xpath("//button[text()='Yes']")).click();
//		
//		WebDriverWait w = new WebDriverWait(driver,5);
//		String actualmsg = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Toastify__toast-body']"))).getText();
//		Assert.assertEquals(actualmsg, msg);
//		c.resetFilters().click();
//		Thread.sleep(3000);
//		
//	}
//	
//	
//	@Then("^verify user can delete a cologne selection with appointment$")
//	public void verify_user_can_delete_a_cologne_selection_with_appointment() throws Throwable {
//		
//		System.out.println("Verify whether user can delete a cologne selection with appointment");
//		c = new CologneSelection(driver);
//		String msg ="Cologne is used in an appointment";
//		
//		c.searchCologne().sendKeys("NEW COLGNE");
//		c.enterSubmit().click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[text()='Delete']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[text()='Yes']")).click();
//	
//		WebDriverWait w = new WebDriverWait(driver,5);
//		String actualmsg = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Toastify__toast-body']"))).getText();
//		Assert.assertEquals(actualmsg, msg);
//		Thread.sleep(1000);
//		c.closeAlert().click();
//		c.resetFilters().click();
//		Thread.sleep(3000);
//	}
//	
//
//	
//	
//	
//}
