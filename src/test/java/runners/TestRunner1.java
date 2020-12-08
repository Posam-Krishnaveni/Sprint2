package runners; 


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class) 

@CucumberOptions(features="Feature999", glue={"stepDefinitions"},
//tags={"@Unsuccessful_Registration,@Successful_Registration"})
//tags={"@first_name_field_validation,@last_name_field_validation,@email_field_validation,@password_field_validation"})
//tags={"@Successful_login"})
tags={"@Add_to_cart"})
public class TestRunner1 extends AbstractTestNGCucumberTests {

}