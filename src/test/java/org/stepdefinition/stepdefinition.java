package org.stepdefinition;

import java.util.List;

import org.help.legacypojo;

import org.help.samplebase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;

public class stepdefinition extends samplebase {
	@Given("To open the browser and launch legacytourtravel application")
	public void to_open_the_browser_and_launch_legacytourtravel_application() {
		
		browserlaunch();
		launchurl("https://legacytourtravel.com/Secure/User/Login");
	    
	}
	

	@When("User have to enter valid username and invalid password")
	public void user_have_to_enter_valid_username_and_invalid_password() {
		
		legacypojo l=new legacypojo();
		WebElement user=l.getUsername();
		user.sendKeys("dhruva@123");
		WebElement pass=l.getPassword();
		pass.sendKeys("12345");
		
		}
	    
	@When("user have to get current url")
	public void user_have_to_get_current_url() {
	String url=driver.getCurrentUrl();
	}
	    

	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
		
		legacypojo l=new legacypojo();
		WebElement login=l.getLogin();
		login.click();
		Thread.sleep(2000);
	    
	}

	@Then("To validate the user whether they get into login or not")
	public void to_validate_the_user_whether_they_get_into_login_or_not() {
		String actualurl=driver.getCurrentUrl();
		WebElement text=driver.findElement(By.xpath("//span[text()='Please correct the following errors:']"));
		String msg=text.getText();
		Assert.assertTrue(msg.contains("errors"));
		System.out.println("incorrect password");
		
		
	    
	}

	@When("User have to enter invalid username and invalid password")
	public void user_have_to_enter_invalid_username_and_invalid_password() {

		legacypojo l=new legacypojo();
		WebElement user=l.getUsername();
		user.sendKeys("goki!456");
		WebElement pass=l.getPassword();
		pass.sendKeys("12345");
	    
	}
	@When("User have to enter invalid username {string} and invalid password {string}")
	public void user_have_to_enter_invalid_username_and_invalid_password(String s1, String s2) {
		legacypojo l=new legacypojo();
		WebElement user=l.getUsername();
		user.sendKeys(s1);
		WebElement pass=l.getPassword();
		pass.sendKeys(s2);
	    
	}

@When("User have to enter Valid username and invalid password")
public void user_have_to_enter_Valid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
List<String> li=d.asList();
String Username=li.get(2);
String password=li.get(5);

legacypojo l=new legacypojo();       //1D...without header
WebElement username=l.getUsername();
username.sendKeys(Username);
WebElement pass=l.getPassword();
pass.sendKeys(password);

}
@When("User have to enter Valid username and valid password")
public void user_have_to_enter_Valid_username_and_valid_password(io.cucumber.datatable.DataTable da) {
	
	List<List<String>> li=da.asLists();
	String user=li.get(0).get(1);
	String password=li.get(1).get(2);
	
	legacypojo l=new legacypojo();       //1D...without header
	WebElement username=l.getUsername();
	username.sendKeys(user);
	WebElement pass=l.getPassword();
	pass.sendKeys(password);

	
	
	
	
	
}
}
