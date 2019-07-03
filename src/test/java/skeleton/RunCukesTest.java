package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/skeleton/Register.feature","src/test/resources/skeleton/Login.feature","src/test/resources/skeleton/Search.feature","src/test/resources/skeleton/Final.feature"},
//glue="skeleton",
plugin="json:target/jsonreport.json")
public class RunCukesTest {
}
