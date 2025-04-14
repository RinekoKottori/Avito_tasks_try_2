package Seo_rina;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class MainPagePaginationTest {
    private static WebDriver driver;

    public static DriverRule factory = new DriverRule();

    @BeforeAll
    static void setup() {
        driver = factory.getDriver();
        new MainPage(driver).openBrowser();
        new MainPage(driver).checkIsMainPageIsOpen();
    }

    @AfterEach
    public void returnToDefaultPage() {
        new MainPage(driver).clickOnPaginationNumberItem("1");
    }

    @Test
    @DisplayName("Check is click on double arrow right is open next 5 page")
    public void testPaginationRightDoubleArrow() {
        new MainPage(driver).clickOnRightDoubleArrow();
        new MainPage(driver).checkIsNewPageOpen("6");
        
    }

    @Test
    @DisplayName("Check is click on double arrow left is open previos 5 page")
    public void testPaginationLeftDoubleArrow() {
        new MainPage(driver).clickOnPaginationNumberItem("5");
        new MainPage(driver).clickOnPaginationNumberItem("7");
        new MainPage(driver).clickOnLeftDoubleArrow();
        new MainPage(driver).checkIsNewPageOpen("2");
        
    }

    @Test
    @DisplayName("Check is click on arrow right is open next page")
    public void testPaginationRightArrow() {
        new MainPage(driver).clickOnRightArrow();
        new MainPage(driver).checkIsNewPageOpen("2");
        
    }

    @Test
    @DisplayName("Check is click on arrow left is open prev page")
    public void testPaginationLeftArrow() {
        new MainPage(driver).clickOnPaginationNumberItem("3");
        new MainPage(driver).clickOnLeftArrow();
        new MainPage(driver).checkIsNewPageOpen("2");
        
    }

    @Test
    @DisplayName("Check is click on arrow right when last page open do not clickable")
    public void testPaginationRightArrowDoNotClickable() {
        new MainPage(driver).clickOnPaginationNumberItem("41");
        new MainPage(driver).clickOnRightArrow();
        new MainPage(driver).clickOnArrowRightOnLastPage();
        new MainPage(driver).checkIsNewPageOpen("41");
        
    }

    @Test
    @DisplayName("Check is click on arrow left when first page open do not clickable")
    public void testPaginationLeftArrowDoNotClickable() {
        new MainPage(driver).clickOnLeftArrow();
        new MainPage(driver).clickOnArrowLeftOnFirstPage();
        new MainPage(driver).checkIsNewPageOpen("1");
        
    }

    @Test 
    @DisplayName("Check that select menu of cards that shows on page is opened when click on button")
    public void testOpenChangerAmountOfCards(){
        new MainPage(driver).clickOnChangerOfCardsAmount();
        new MainPage(driver).checkThatSelectMenuIsOpened();
    }
}
