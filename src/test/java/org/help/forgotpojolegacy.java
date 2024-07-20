package org.help;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgotpojolegacy extends samplebase {
	public forgotpojolegacy() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Click here if you have forgotten your password']")
	private WebElement forgotpass;
	@FindBy(xpath="//input[@name='Email']")
	private WebElement email;
	@FindBy(xpath="//input[@value='Reset Password']")
	 private WebElement reset;
	public WebElement getForgotpass() {
		return forgotpass;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getReset() {
		return reset;
	}
	 
	 

}
