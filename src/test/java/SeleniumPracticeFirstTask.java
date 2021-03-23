import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumPracticeFirstTask extends InitDriver {

    @Test
    public void seleniumPracticeFirstTask() {
        webDriver.get("https://savkk.github.io/selenium-practice/");
        webDriver.findElement(By.id("button")).click();

        webDriver.findElement(By.id("first")).click();

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

    }
}
