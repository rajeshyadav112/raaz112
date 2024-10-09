package stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hp\\eclipse-workspace\\11weekdaysbatch\\src\\test\\resources\\featurefile\\LoginTestdemo.feature",
glue= {"stepdefination"},
plugin= {"pretty","html:target/cucumber-reports/login3.html"},
tags ="@login or @logout",
monochrome = true


)
public class TestRunner {
	
	
	  

}
