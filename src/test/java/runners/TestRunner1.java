package runners; 
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="Feature999", glue={"stepDefinitions"},
plugin = {"json:target/cucumber.json"},
tags={"@Add_to_cart,@Successful_login"})
//tags={"@Successful_login,@Unsuccessful_login"}
//tags={"@Successful_Registration,@first_name_field_validation,@last_name_field_validation,@email_field_validation,@password_field_validation,@confirm_password_field_validation"}
public class TestRunner1 extends AbstractTestNGCucumberTests {

}