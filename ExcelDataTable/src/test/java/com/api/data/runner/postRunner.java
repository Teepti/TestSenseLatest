package com.api.data.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.api.data.stepdfn" },
				 features = {"classpath:com/api/data/feature/SellStocks.feature"},
				 dryRun=false
		           )

public class postRunner {

}
