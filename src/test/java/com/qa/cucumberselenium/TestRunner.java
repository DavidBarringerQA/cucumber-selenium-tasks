package com.qa.cucumberselenium;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:"},
				 glue = {"classpath:com.qa.cucumberselenium"},
				 snippets = SnippetType.CAMELCASE,
				 plugin = {"summary",
						   "html:target/cucumber-reports/cucumber-html-report.html",
						   "junit:target/cucumber-reports/cucumber-junit-report.xml"
				 },
				 monochrome = true,
				 tags = "@selenium"
)
public class TestRunner {

}
