package page;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "pa-deny-btn")
    WebElement btnNoAhoraAlerta;

    @FindBy(css = "#newsletter .close")
    WebElement btnCloseNewsletter;

    @FindBy(xpath = "//a[text() = 'Coches'][1]")
    WebElement btnCoches;

    @FindBy(css = "a[href=\"/categoria/accesorios-para-coches\"]")
    WebElement linkAccesoriosCoches;

    public void seleccionarCategoria(){
        explicitWait(btnNoAhoraAlerta, 15);
        click(btnNoAhoraAlerta);
        click(btnCloseNewsletter);
        actionMoveToElement(btnCoches);
        explicitWait(linkAccesoriosCoches, 15);
        click(linkAccesoriosCoches);
    }
}
