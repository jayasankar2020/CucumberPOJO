package com.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue = {"com\\stepdefinition1"},monochrome = true, plugin = {"json:src\\test\\resources\\Reporting\\cucumber.json"})
public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {

		JVMReport.generateJVMReport(System.getProperty("user.dir") +"\\src\\test\\resources\\Reporting\\cucumber.json");
		
	}
	
}
