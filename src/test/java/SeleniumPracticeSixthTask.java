import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class SeleniumPracticeSixthTask extends InitDriver {

    @Test
    public void seleniumPracticeSixthTask() {
        webDriver.get("https://savkk.github.io/selenium-practice/");
        webDriver.findElement(By.id("alerts")).click();

        webDriver.findElement(By.cssSelector("#content > button.get")).click();

        String alertMessage = webDriver.switchTo().alert().getText();
        String[] passwordText = alertMessage.split(" ");
        String password = passwordText[passwordText.length - 1];
        webDriver.switchTo().alert().accept();

        webDriver.findElement(By.cssSelector("#content > button.set")).click();
        webDriver.switchTo().alert().sendKeys(password);
        webDriver.switchTo().alert().accept();

        String afterEnterPasswordMessage = webDriver.findElement(By.cssSelector("#content > label")).getText();
        Assert.assertTrue(afterEnterPasswordMessage.contains("Great!"));

        webDriver.findElement(By.cssSelector("#content > button.return")).click();
        webDriver.switchTo().alert().accept();













        /*
        WebElement buttonClickMe = webDriver.findElement(By.id("first"));
        buttonClickMe.click();

        String buttonClickResult = webDriver.findElement(By.xpath("/html/body/div/div/div/label[2]")).getText();
        Assert.assertTrue(buttonClickResult.contains("Excellent!"));

        WebElement buttonClickMeToo = webDriver.findElement(By.cssSelector("input[class='button-primary']"));
        boolean buttonClickMeTooEnable = buttonClickMeToo.isDisplayed();
        Assert.assertTrue(buttonClickMeTooEnable);
        buttonClickMeToo.click();

        WebElement buttonClickMeTooResult = webDriver.findElement(By.xpath("//*[@id='back']/a"));
        String buttonClickMeTooResultText = buttonClickMeTooResult.getText();
        Assert.assertTrue(buttonClickMeTooResultText.contains("Great! Return to menu"));
        buttonClickMeTooResult.click();

         */

    }

}
