package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {
    By btnNoAhoraAlerta = By.id("pa-deny-btn");
    By btnCloseNewsletter = By.cssSelector("#newsletter .close");
    By btnCoches = By.xpath("//a[text() = 'Coches'][1]");
    By linkAccesoriosCoches = By.cssSelector("a[href=\"/categoria/accesorios-para-coches\"]");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void seleccionarCategoria(){
        explicitWait(btnNoAhoraAlerta, 15);
        click(btnNoAhoraAlerta);
        click(btnCloseNewsletter);
        actionMoveToElement(btnCoches);
        explicitWait(linkAccesoriosCoches, 15);
        click(linkAccesoriosCoches);
    }
}
