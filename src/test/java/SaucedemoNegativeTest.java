import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SaucedemoNegativeTest extends InitDriver{

    @Test
    public void saucedemoNegative() {
        webDriver.get("https://www.saucedemo.com/");
        WebElement searchInputLogin = webDriver.findElement(By.xpath("//*[@id='user-name']"));
        searchInputLogin.sendKeys("standard_user");
        WebElement searchInputPassword = webDriver.findElement(By.xpath("//*[@id='password']"));
        searchInputPassword.sendKeys("123");
        WebElement searchInputSubmit = webDriver.findElement(By.xpath("//*[@id='login-button']"));
        searchInputSubmit.click();
        String errorText = webDriver.findElement(By.xpath(".//h3")).getText();
        Assert.assertTrue(errorText.contains("Username and password do not match any user in this service"));
    }
}
