import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SaucedemoPositiveTest extends InitDriver {

    @Test
    public void saucedemoPositive() {
        webDriver.get("https://www.saucedemo.com/");
        WebElement searchInputLogin = webDriver.findElement(By.xpath("//*[@id='user-name']"));
        searchInputLogin.sendKeys("standard_user");
        WebElement searchInputPassword = webDriver.findElement(By.xpath("//*[@id='password']"));
        searchInputPassword.sendKeys("secret_sauce");
        WebElement searchInputSubmit = webDriver.findElement(By.xpath("//*[@id='login-button']"));
        searchInputSubmit.click();
        String headerText = webDriver.findElement(By.xpath("//*[@id='inventory_filter_container']/div")).getText();
        Assert.assertTrue(headerText.contains("Products"));
    }
}
