package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String jsonFile) {
		
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting");
		
		Configuration con = new Configuration(loc,"Adactin Automation");
		
		con.addClassifications("os", "windoes 10");
		con.addClassifications("BrowserName", "chrome");
		con.addClassifications("version", "79");
		con.addClassifications("sprint", "20");
		
		List<String>jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, con);
		builder.generateReports();
		

	}

}
