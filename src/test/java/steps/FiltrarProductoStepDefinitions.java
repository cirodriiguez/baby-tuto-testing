package steps;

import org.junit.Assert;
import page.AccesoriosCochesPage;
import page.AccesoriosFiltradosPage;
import page.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static steps.Hook.driver;

public class FiltrarProductoStepDefinitions {
    private HomePage homePage;
    private AccesoriosCochesPage accesoriosCochesPage;
    private AccesoriosFiltradosPage accesoriosFiltradosPage;

    @Given("^quiero econtrar accesorios para coches$")
    public void quieroEcontrarAccesoriosParaCoches(){
        homePage = new HomePage(driver);
        homePage.seleccionarCategoria();
    }

    @When("^filtro por la marca BBPRO$")
    public void filtroPorLaMarcaBBPRO(){
        accesoriosCochesPage = new AccesoriosCochesPage(driver);
        accesoriosCochesPage.filtrarPorMarca();
    }

    @Then("^deberia ver accesorios pertenecientes a la marca BBRPO$")
    public void deberiaVerAccesoriosPertenecientesALaMarcaBBPRO(){
        accesoriosFiltradosPage = new AccesoriosFiltradosPage(driver);
        int cantidadAccesoriosBBpro = 0;

        for (String marca: accesoriosFiltradosPage.accesoriosFiltrados()) {
            if (marca.toUpperCase().equals("BBPRO")){
                cantidadAccesoriosBBpro++;
            }
        }

        Assert.assertEquals(cantidadAccesoriosBBpro, accesoriosFiltradosPage.accesoriosFiltrados().size());
    }
}
