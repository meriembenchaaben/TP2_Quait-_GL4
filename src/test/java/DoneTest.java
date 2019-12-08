

import org.junit.Test;
import org.junit.Before;
import org.junit.After;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.*;

public class DoneTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void done() {
        try {
            driver.get("https://www.mytek.tn/");
            driver.manage().window().setSize(new Dimension(1920, 1040));
            driver.findElement(By.linkText("Connexion")).click();
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).sendKeys("fareselkahla@gmail.com");
            Thread.sleep(500);
            driver.findElement(By.id("passwd")).click();
            driver.findElement(By.id("passwd")).sendKeys("apzoeiru");
            Thread.sleep(500);
            driver.findElement(By.id("SubmitLogin")).click();
            Thread.sleep(500);
            driver.findElement(By.id("search_query_top")).click();
            Thread.sleep(500);
            driver.findElement(By.id("search_query_top")).sendKeys("test");
            Thread.sleep(500);
            driver.findElement(By.id("search_query_top")).sendKeys(Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.linkText("Testeur Électrique VoltAlert 1AC-D")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".exclusive > span")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".btn-warning > span")).click();
            Thread.sleep(500);
            driver.findElement(By.cssSelector(".standard-checkout > span")).click();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
