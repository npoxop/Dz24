import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumPracticeSeventhTask extends InitDriver {

    @Test
    public void seleniumPracticeSeventhTask() {
        webDriver.get("https://savkk.github.io/selenium-practice/");
        webDriver.findElement(By.id("table")).click();

        List<WebElement> initialCount = webDriver.findElements(By.tagName("tr"));
        int initialCountSize = initialCount.size();

        webDriver.findElement(By.cssSelector("#customers > tbody > tr:nth-child(2) > td:nth-child(1) > input[type=checkbox]")).click();
        webDriver.findElement(By.cssSelector("#customers > tbody > tr:nth-child(6) > td:nth-child(1) > input[type=checkbox]")).click();
        webDriver.findElement(By.cssSelector("#content > input[type=button]")).click();
        webDriver.findElement(By.cssSelector("#content > div > form > div:nth-child(1) > input[type=text]")).sendKeys("IP Danilov");
        webDriver.findElement(By.cssSelector("#content > div > form > div:nth-child(2) > input[type=text]")).sendKeys("Innokentiy Danilov");
        webDriver.findElement(By.cssSelector("#content > div > form > div:nth-child(3) > input[type=text]")).sendKeys("Russia");
        webDriver.findElement(By.cssSelector("#content > div > form > input[type=button]")).click();

        List<WebElement> changeCount = webDriver.findElements(By.tagName("tr"));
        int changeCountSize = changeCount.size();

        boolean checkSizeChange = initialCountSize > changeCountSize;
        Assert.assertTrue(checkSizeChange);

        WebElement buttonClickMeTooResult = webDriver.findElement(By.xpath("//*[@id='back']/a"));
        String buttonClickMeTooResultText = buttonClickMeTooResult.getText();
        Assert.assertTrue(buttonClickMeTooResultText.contains("Great! Return to menu"));
        buttonClickMeTooResult.click();

    }
}

