package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccesoriosFiltradosPage extends Base {
    private By ctrAccesoriosBBpro = By.cssSelector(" .items.lst-vertical  .merchant-name");

    public AccesoriosFiltradosPage(WebDriver driver){
        super(driver);
    }

    public List<String> accesoriosFiltrados(){
        explicitWait(ctrAccesoriosBBpro, 10);
        List<String> marcas = new ArrayList<String>();

        for (WebElement accesorio : findElements(ctrAccesoriosBBpro)) {
            marcas.add(getText(accesorio));
        }
        return marcas;
    }
}
