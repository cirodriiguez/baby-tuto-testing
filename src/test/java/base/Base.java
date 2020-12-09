package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Base {
    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver connectionChromeDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public void get(String url){
        driver.get(url);
    }

    public void explicitWait(WebElement element, int sec){
        WebDriverWait wait = new WebDriverWait(driver, sec);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click(WebElement element){
        element.click();
    }

    public void actionMoveToElement(WebElement element){
        Actions builder = new Actions(driver);
        Actions seriesOfActions = builder.moveToElement(element);
        seriesOfActions.perform();
    }

    public String getText(WebElement element) {
        return element.getText();
    }
}
