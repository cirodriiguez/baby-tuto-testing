package page;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccesoriosFiltradosPage extends Base {
    public AccesoriosFiltradosPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".items.lst-vertical  .merchant-name")
    WebElement accesorios;

    @FindBy(css = ".items.lst-vertical  .merchant-name")
    List<WebElement> ctrAccesoriosBBpro;

    public List<String> accesoriosFiltrados(){
        explicitWait(accesorios, 10);
        List<String> marcas = new ArrayList<String>();

        for (WebElement accesorio : ctrAccesoriosBBpro) {
            marcas.add(getText(accesorio));
        }
        return marcas;
    }
}
