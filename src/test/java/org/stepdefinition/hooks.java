package org.stepdefinition;

import java.io.IOException;

import org.help.samplebase;

import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends samplebase{
	@Before
	public void browseropen() {
		browserlaunch();
		launchurl("https://legacytourtravel.com/Secure/User/Login");
	    
	}
	@After
	public void browserclose(Scenario s) throws IOException {
		
		if (s.isFailed()) {
           TakesScreenshot tk=(TakesScreenshot)driver;	
           byte[] screen=tk.getScreenshotAs(OutputType.BYTES);
           s.embed(screen,"image/png");
		}
		//String name=s.getName();
		//String sname= name.replace("_", "_");
		//screenshots(sname);
		
		driver.close();


		
	

}
}