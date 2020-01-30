package cucumbercs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\casestudy\\product.feature",glue="cucumbercs",plugin="html:target/htmlreport")

public class runner {
	
	

}
