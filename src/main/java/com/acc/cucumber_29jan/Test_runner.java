package com.acc.cucumber_29jan;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"},
		features= "Feature03"
		,glue= {"step_definition03"}
		
		)

public class Test_runner {

}
