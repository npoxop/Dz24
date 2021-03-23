import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumPracticeFifthTask extends InitDriver {

    @Test
    public void seleniumPracticeFifthTask() {
        webDriver.get("https://savkk.github.io/selenium-practice/");
        webDriver.findElement(By.id("iframe")).click();

        webDriver.switchTo().frame("code-frame");
        WebElement codeFrame = webDriver.findElement(By.id("code"));

        String getCode = codeFrame.getText();
        String[] codeText = getCode.split(" ");
        String code = codeText[codeText.length - 1];

        webDriver.switchTo().defaultContent();
        webDriver.findElement(By.cssSelector("#content > input[type=text]:nth-child(4)")).sendKeys(code);
        webDriver.findElement(By.cssSelector("#content > input[type=button]:nth-child(5)")).click();

        WebElement buttonClickMeTooResult = webDriver.findElement(By.xpath("//*[@id='back']/a"));
        String buttonClickMeTooResultText = buttonClickMeTooResult.getText();
        Assert.assertTrue(buttonClickMeTooResultText.contains("Great! Return to menu"));
        buttonClickMeTooResult.click();

    }
}
