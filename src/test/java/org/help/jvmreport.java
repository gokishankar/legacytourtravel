package org.help;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
	import java.util.List;

	import net.masterthought.cucumber.Configuration;
	import net.masterthought.cucumber.ReportBuilder;

	public class jvmreport {
		 public static  void generateJvmReport(String jsonFilepath) {
			
			// 1.mention the taget folder location
			 
			//String prp=System.getProperty("user.dir");
				File f= new  File(System.getProperty("user.dir")+"\\target\\report1\\jvmreport");
				//2.add details to the report using configuration class
				
				Configuration con =new Configuration(f,"legacytravel");
				con.addClassifications("browser", "chrome");
				con.addClassifications("os", "windows 10");
				con.addClassifications("jvm", "masterthought");
				
				//3.Add json file path into list<String> (first complete 4th step)
				List<String> li=new ArrayList<String>();
				 
				 li.add(jsonFilepath);
				
				
				
				//4.create object for report builder class and using the create object  call generatereports()
			       ReportBuilder r= new ReportBuilder(li, con) ;
			       r.generateReports();

		}

	}



