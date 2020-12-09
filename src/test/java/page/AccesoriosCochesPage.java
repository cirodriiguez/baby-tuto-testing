package page;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccesoriosCochesPage extends Base {
    public AccesoriosCochesPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='BBpro']")
    WebElement ckbBBpro;

    public void filtrarPorMarca(){
        explicitWait(ckbBBpro, 10);
        click(ckbBBpro);
    }
}
