import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPracticeThirdTask extends InitDriver {

    @Test
    public void seleniumPracticeThirdTask() {
        webDriver.get("https://savkk.github.io/selenium-practice/");
        webDriver.findElement(By.id("select")).click();

        Select hero = new Select(webDriver.findElement(By.className("u-full-width")));
        hero.selectByVisibleText("Dennis Ritchie");

        Select language = new Select(webDriver.findElement(By.xpath("//*[@id='content']/select[2]")));
        language.selectByVisibleText("Python");

        webDriver.findElement(By.id("go")).click();

        String getResultHero = webDriver.findElement(By.xpath("//*[@id='content']/label[2]")).getText();
        Assert.assertTrue(getResultHero.contains("Dennis Ritchie"));

        String getResultLanguage = webDriver.findElement(By.xpath("//*[@id='content']/label[4]")).getText();
        Assert.assertTrue(getResultLanguage.contains("Python"));

        WebElement buttonClickMeTooResult = webDriver.findElement(By.xpath("//*[@id='back']/a"));
        String buttonClickMeTooResultText = buttonClickMeTooResult.getText();
        Assert.assertTrue(buttonClickMeTooResultText.contains("Great! Return to menu"));
        buttonClickMeTooResult.click();

    }
    }
