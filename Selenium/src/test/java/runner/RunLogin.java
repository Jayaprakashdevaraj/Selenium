package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features",
				 glue = "steps",  //Step definition package name
				 monochrome = true , //remove junk char
				 //tags = {"@regression"}, //to execute the scenario with @smoke annotation
				 //tags = {"@smoke,@regression"}, //working based on OR condition
				 //tags = {"@smoke","@regression"}, //working based on AND condition
				 tags = {"~@smoke"},  // execute all tage without smoke tag
				 
				 plugin = {"html:Reports"}
				 //snippets = SnippetType.CAMELCASE  // remove_ in method
				 )

public class RunLogin extends AbstractTestNGCucumberTests{

}
