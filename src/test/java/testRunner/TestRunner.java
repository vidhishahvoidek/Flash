package testRunner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "E:/demo/Cucumber/CucumberDemo/Features/Demo.feature",
        features = "C:/Users/princ/eclipse-workspace/CucumberDemo-master/Features/multi.feature",
        glue="stepDefinition",
        plugin = { "pretty", "json:target/Cucumber.json" },
        monochrome = true
       
)

	public class TestRunner {
	
	
	
	
	
	
}
