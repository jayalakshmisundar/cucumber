package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\resources\\login\\Login.feature"},
glue= {"StepDefinition"},plugin = {"html:Result/TestNG.html"})
public class Testrunner extends AbstractTestNGCucumberTests {

}
