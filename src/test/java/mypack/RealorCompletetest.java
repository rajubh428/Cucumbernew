package mypack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features = {"D:\\batch365\\Cucumber\\adwize2\\src\\test\\resources\\feature\\f2.feature"},
							format= {"json:target\\Destination\\cucumber.json","pretty","html:target\\09122017","rerun:target\\file.txt"},monochrome=true
			)
public class RealorCompletetest {

}
