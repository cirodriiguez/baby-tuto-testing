package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccesoriosCochesPage extends Base {
    By ckbBBpro = By.xpath("//span[text()='BBpro']");
    public AccesoriosCochesPage(WebDriver driver){
        super(driver);
    }

    public void filtrarPorMarca(){
        explicitWait(ckbBBpro, 10);
        click(ckbBBpro);
    }
}
