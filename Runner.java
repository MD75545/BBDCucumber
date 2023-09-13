package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "D:\\ActualCucumber\\src\\test\\resources\\Features\\AddCampaign.feature" }

		, glue = "StepDefination", dryRun = false,
		plugin = {"pretty","html:D:\\ActualCucumber\\Reports\\loginReport.html"}
				


)

public class Runner {

}
