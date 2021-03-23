import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumPracticeFourthTask extends InitDriver {
    @Test
    public void seleniumPracticeFourthTask() {
        webDriver.get("https://savkk.github.io/selenium-practice/");
        webDriver.findElement(By.id("form")).click();

        webDriver.findElement(By.cssSelector("#testform > div:nth-child(1) > input[type=text]")).sendKeys("Олег");
        webDriver.findElement(By.cssSelector("#testform > div:nth-child(2) > input[type=text]")).sendKeys("Василишвили");
        webDriver.findElement(By.cssSelector("#testform > div:nth-child(3) > input[type=email]")).sendKeys("superoleg@mail.ru");
        webDriver.findElement(By.cssSelector("#testform > div:nth-child(4) > input[type=radio]:nth-child(2)")).click();
        webDriver.findElement(By.cssSelector("#testform > div:nth-child(5) > input[type=text]")).sendKeys("Северное шоссе, 144");
        webDriver.findElement(By.cssSelector("#testform > div:nth-child(6) > input[type=file]")).sendKeys("c:/ForTest.txt");
        webDriver.findElement(By.cssSelector("#testform > div:nth-child(7) > textarea")).sendKeys("Мог бы что-то красивое написать, но не буду");
        webDriver.findElement(By.cssSelector("#testform > input[type=submit]")).click();

        WebElement buttonClickMeTooResult = webDriver.findElement(By.xpath("//*[@id='back']/a"));
        String buttonClickMeTooResultText = buttonClickMeTooResult.getText();
        Assert.assertTrue(buttonClickMeTooResultText.contains("Great! Return to menu"));
        buttonClickMeTooResult.click();

    }
}
