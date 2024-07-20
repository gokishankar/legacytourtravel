package org.stepdefinition;


import java.util.List;
import java.util.Map;

import org.help.forgotpojolegacy;
import org.help.samplebase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;

public class forgottenstepdefinition extends samplebase {
	
	@Given("User have to launch the legacytour travel application through chrome browser")
	public void user_have_to_launch_the_legacytour_travel_application_through_chrome_browser() {
		
		browserlaunch();
		launchurl("https://legacytourtravel.com/Secure/User/Login");
	}

	@When("User have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() {
		forgotpojolegacy f=new forgotpojolegacy();
		WebElement user=f.getForgotpass();
		user.click();
	    
	}

	@When("User have to enter invalid email")
	public void user_have_to_enter_invalid_email() {
		forgotpojolegacy f=new forgotpojolegacy();
		WebElement email=f.getEmail();
		email.sendKeys("senthil@123");
	}

	@When("User have to click reset password button")
	public void user_have_to_click_reset_password_button() {
		forgotpojolegacy f=new forgotpojolegacy();
		WebElement reset=f.getReset();
		reset.click();
		
	    
	}

	@Then("User have to reach reset password page")
	public void user_have_to_reach_reset_password_page() {
		WebElement txt=driver.findElement(By.xpath("//label[text()='The specified e-mail address is not a valid account.']"));
		String msg=txt.getText();
		Assert.assertTrue(msg.contains("not a valid account"));
		System.out.println("not a valid account");
	   
	}
	@When("User have to enter Invalid email")
	public void user_have_to_enter_Invalid_email(io.cucumber.datatable.DataTable d) {

		
		//1d MAP...WITH HEADER
		Map<String,String> mp=d.asMap(String.class, String.class);
		String username=mp.get("fruits");
		String password=mp.get("flower");
		
		forgotpojolegacy f=new forgotpojolegacy();
		WebElement email=f.getEmail();
		email.sendKeys(username);
	}

		
		
	@When("User have to enter valid email")
	public void user_have_to_enter_valid_email(io.cucumber.datatable.DataTable t) {
		
		//2D Map  WITH HEADER
		List<Map<String,String>> li=t.asMaps();
		String username=li.get(0).get("EMAIL");
		
		forgotpojolegacy f=new forgotpojolegacy();
		WebElement email=f.getEmail();
		email.sendKeys(username);
		
	}
	    
		
		
		
		
		
		
		
		
		
		
		
		
}
