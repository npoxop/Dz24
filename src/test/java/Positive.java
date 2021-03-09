import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positive {
    WebDriver webDriver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\npoxop\\IdeaProjects\\DZ24\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void saucedemoPositive() {
        webDriver.get("https://www.saucedemo.com/");
        WebElement searchInputLogin = webDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        searchInputLogin.sendKeys("standard_user");
        WebElement searchInputPassword = webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        searchInputPassword.sendKeys("secret_sauce");
        WebElement searchInputSubmit = webDriver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        searchInputSubmit.click();

        String headerText = webDriver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/div")).getText();
        Assert.assertTrue(headerText.contains("Products"));
        }

    @After
    public void closeDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}

