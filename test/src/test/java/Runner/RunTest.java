package Runner;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\bdd_framework\\test\\src\\test\\java\\FeatureFile\\Log.feature",glue="stepdefinition", tags={"@Sample1"})
public class RunTest {
	@Test
    public void exampleOfTestNgMaven() {
        System.out.println("This is TestNG-Maven Example");
    }
}
