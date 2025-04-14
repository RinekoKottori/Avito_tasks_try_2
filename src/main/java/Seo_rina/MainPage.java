package Seo_rina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.attributeMatching;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement;

import static Seo_rina.EnvConfig.BASE_URL;
import io.qameta.allure.Step;

public class MainPage {
    private final WebDriver driver;
    private final By mainPage = By.className("ant-col");
    private final By listItemLocatorTemplate = By.xpath("(//li[@class='ant-list-item'])");
    private final By randomGameCard = By.className("_card_vlg32_1");
    private final By paginationItems = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/ul/li");

    
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
     @Step("Open browser")
    public void openBrowser() {
        open(BASE_URL);
    }

    @Step("Check is main page is visible")
    public void checkIsMainPageIsOpen() {
        $(mainPage).shouldHave(exactText("Main Page"));
    }

    @Step("Check is game card is visible")
    public void checkIsGameCardIsVisible() {
        $(randomGameCard).shouldBe(visible);
    }

    @Step("Get all game cards")
    public ElementsCollection getGameCards() {
        ElementsCollection cards = $$(listItemLocatorTemplate);
        return cards;    
    }

    @Step("Get one game card")
    public SelenideElement getGameCardByIndex(int index) {
        ElementsCollection cards = getGameCards();
        return cards.get(index);
    }

    @Step("Get name game card")
    public String getNameGameCardByIndex(int index) {
        return getGameCardByIndex(index).$("h1").getText();
    }

    @Step("Click on card")
    public void clickOnCard(int index) {
        getGameCardByIndex(index).shouldBe(visible).click();
    }

    @Step("Get numbers of page items")
    public ElementsCollection getNumberOfPageItems() {
        return $$(paginationItems).filterBy(attributeMatching("class", ".*ant-pagination-item-.*"));
    }

    @Step("Click on pagination number-item")
    public void clickOnPaginationNumberItem(String title) {
       getNumberOfPageItems().findBy(attribute("title", title)).shouldBe(visible).click();
      }

    @Step("Check is new page open")
    public void checkIsNewPageOpen(String title) {
        getNumberOfPageItems().findBy(attribute("title", title)).shouldHave(attributeMatching("class", ".*ant-pagination-item-active.*"));
    }

}