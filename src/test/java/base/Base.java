package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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

    public void explicitWait(By id, int sec){
        WebDriverWait wait = new WebDriverWait(driver, sec);
        wait.until(ExpectedConditions.visibilityOfElementLocated(id));
    }

    public void click(By id){
        driver.findElement(id).click();
    }

    public void actionMoveToElement(By id){
        Actions builder = new Actions(driver);
        Actions seriesOfActions = builder.moveToElement(driver.findElement(id));
        seriesOfActions.perform();
    }

    public List<WebElement> findElements(By id) {
        return driver.findElements(id);
    }

    public String getText(WebElement element) {
        return element.getText();
    }
}
