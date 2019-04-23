package br.com.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", 
monochrome = true, 
snippets = SnippetType.CAMELCASE, 
dryRun = false, strict = false, 
features = "src/test/resources/Feature/alugar_filme.feature", 
glue = "br.com.steps", 
tags = {})

public class Runner {

}
