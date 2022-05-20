package RunnerTest;
import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\saich\\eclipse-workspace\\CucumberFramework\\features",
glue="DefinationsStep",monochrome=true,dryRun=false,plugin= {"pretty","html:reports/report.html"})
public class runnerTest {

}
