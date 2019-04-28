package mypack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features = "@target\\file.txt",
							format= {"json:target\\Destination\\cucumber.json","pretty","html:target\\rerestres"},monochrome=true)
public class Retesting {

}

