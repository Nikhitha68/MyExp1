package Testrunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features= {"C:\\Users\\uneet\\IdeaProjects\\MyExp1\\src\\test\\resources\\Feature\\login.Feature"},
        glue="StepDefinitions",
        plugin= {
                "pretty", "html:reports/myreport.html",
                "json:reports/myreport.json"
        },    //Mandatory to capture failures
        dryRun=false,
        monochrome=true,
        tags = "@sanity"	//Scenarios tagged with @sanity,

        	//Scenarios tagged with @sanity,
)

public class TestRunner {
}
