package steps;

import base.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hook {
    static WebDriver driver;
    private Base base;
    private String url = "https://www.babytuto.com/";

    @Before
    public void BeforeScenario(Scenario scenario){
        System.out.println("Inicio: " + scenario.getName());
        base = new Base(driver);
        driver = base.connectionChromeDriver();
        base.get(url);
    }

    @After
    public void AfterScenario(Scenario scenario){
        driver.quit();
        System.out.println("Fin: " + scenario.getName());
    }
}
