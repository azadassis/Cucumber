package StepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefs"}, monochrome = true)
public class TestRunner {

}

//monochrome = true

//plugin = { "pretty", "html:target/reports"}
//plugin = { "pretty", "json:target/reports/cucumber.json"}
//plugin = { "pretty",  "junit:target/reports/cucumber.xml"}

//tags="@smoketest"