package cofre;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Luciano Rovanni <luciano at luciano.rovanni>
 */
@RunWith(Cucumber.class)
@CucumberOptions(        
        plugin = {"pretty", "html:target/cucumber"},
        features = {"src/main/resources"}
        )
public class Cucumber01Test {
    

    @Test
    public void test01() {
    
    }
}
