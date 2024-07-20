package org.help;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class legacypojo extends samplebase{
	
	public legacypojo() {
		
		PageFactory.initElements(driver, this);

}
@FindBy(xpath="//input[@name='Email']")
private WebElement username;
	
@FindBy(xpath="//input[@name='Password']")
private WebElement password;

@FindBy(xpath="//input[@class='LoginButton']")
private WebElement login;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}