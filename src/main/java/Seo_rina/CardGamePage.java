package Seo_rina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import io.qameta.allure.Step;

public class CardGamePage {
    private final WebDriver driver;
    private final By cardGamePage = By.cssSelector("h1");
    private final By cardGameName = By.cssSelector("h2");
    private final By buttonBackToMain = By.cssSelector("button.ant-btn-primary[type='button']");
    
    public CardGamePage(WebDriver driver) {
        this.driver = driver;
    }
    
    @Step("Is card game page open")
    public void isCardGamePageOpen() {
        $(cardGamePage).shouldBe(visible).shouldHave(exactText("Game Page"));
    }

    @Step("Get name of opened game's card")
    public String getCardGameName() {
        return $(cardGameName).getText();
    }

    @Step("Click on button back to main page")
    public void clickButtonBackToMain() {
        $(buttonBackToMain).shouldBe(visible).click();
    }
}
