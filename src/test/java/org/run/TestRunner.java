package org.run;


import java.io.IOException;

import org.help.jvmreport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\cucumberlegacy\\src\\test\\resources\\Feature"
                ,glue="org.stepdefinition",monochrome=true,dryRun=false,tags= {"@morning and @regression"},plugin= {"html:target\\report1",
                		
               "junit:target\\report1\\tour.xml","json:target\\report1\\legacy.json","rerun:src\\test\\resources\\rerun\\failed.txt"})

public class TestRunner  {
	
@AfterClass

public static  void pullreport() {
	jvmreport.generateJvmReport(System.getProperty("user.dir")+"\\target\\report1\\legacy.json");


}

	
	
}
