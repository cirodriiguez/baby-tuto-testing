package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/java/features/filtrar_producto.feature"},
        glue = {"steps"},
        snippets = SnippetType.CAMELCASE
)

public class FiltrarProductoRunner {
}
