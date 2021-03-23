import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumPracticeSecondTask extends InitDriver {

    @Test
    public void seleniumPracticeSecondTask() {
        webDriver.get("https://savkk.github.io/selenium-practice/");
        webDriver.findElement(By.id("checkbox")).click();

        webDriver.findElement(By.id("one")).click();
        webDriver.findElement(By.id("two")).click();
        webDriver.findElement(By.id("go")).click();
        String buttonGetResultsResult = webDriver.findElement(By.id("result")).getText();
        Assert.assertTrue(buttonGetResultsResult.contains("one two"));

        webDriver.findElement(By.id("radio_three")).click();
        webDriver.findElement(By.id("radio_go")).click();
        String buttonGetResultsRadioResult = webDriver.findElement(By.id("radio_result")).getText();
        Assert.assertTrue(buttonGetResultsRadioResult.contains("three"));

        WebElement buttonClickMeTooResult = webDriver.findElement(By.xpath("//*[@id='back']/a"));
        String buttonClickMeTooResultText = buttonClickMeTooResult.getText();
        Assert.assertTrue(buttonClickMeTooResultText.contains("Great! Return to menu"));
        buttonClickMeTooResult.click();

}
}
