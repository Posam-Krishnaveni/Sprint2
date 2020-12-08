package runners; 

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="Feature999", glue={"stepDefinitions"},

plugin = {"json:target/cucumber.json"},

tags={"@Successful_login"})

public class TestRunner1 extends AbstractTestNGCucumberTests {

}
