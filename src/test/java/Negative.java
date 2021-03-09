import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Negative {

    WebDriver webDriver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\npoxop\\IdeaProjects\\DZ24\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void saucedemoNegative() {
        webDriver.get("https://www.saucedemo.com/");
        WebElement searchInputLogin = webDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        searchInputLogin.sendKeys("standard_user");
        WebElement searchInputPassword = webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        searchInputPassword.sendKeys("123");
        WebElement searchInputSubmit = webDriver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        searchInputSubmit.click();

        String errorText = webDriver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3")).getText();
        Assert.assertTrue(errorText.contains("Epic sadface"));

    }

    @After
    public void closeDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
