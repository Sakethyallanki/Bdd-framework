package test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "C:\\Users\\Hello\\eclipse-workspace\\Bdd_frameWork\\src\\test\\java\\features\\Adactin_Login.feature",
		glue="step_Defination",
		tags = "@Smoke",
		plugin= {"pretty",
				"html:Reports/newreport3.html",
				"json:Reports/newreport3.json",
				"rerun:target/rerun.txt",    //Mandatory to capture failures
		}
		)


public class Test_Runner {

}
