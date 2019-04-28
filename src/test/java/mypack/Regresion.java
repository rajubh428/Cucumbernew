package mypack;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features = {"~@target\\file.txt"},
							format= {"json:target\\Destination\\cucumber.json","pretty","html:target\\regresres"},monochrome=true,
							tags= {"@Smoketest"})
public class Regresion {

}

