package TestRunner;
import FileWrappers.ConfigReader;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Pattern.feature"},
        glue = {"StepDef", "ReastAssurtTest", "BaseForEachRequest", "FileWrappers","TestRunner"},
        plugin = {"pretty"},
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
