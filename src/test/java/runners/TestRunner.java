package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/jewellery.feature"},
        glue={"steps"},
        plugin = {"pretty","html:target/report.html"}
       // tags = "@regression or  @ui"

)
public class TestRunner {


}
