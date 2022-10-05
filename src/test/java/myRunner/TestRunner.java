 package myRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
       (
    		  
    		   features=".//Features/Login.feature",
    		   glue="StepDefinations",
    		   dryRun=false,
    		   monochrome=true,
    		   plugin= { "pretty",
    				   "json:target/MyReports/report.json",
    		            "html:target/MyReports/report.html",
    		            "junit:target/MyReports/report.xml"
    		   },
    		   
    		   publish=true
    		   )




public class TestRunner {

}
