package Seo_rina;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;

public class MainPageParameterizedCardsShowTest {
    private static WebDriver driver;

    public static DriverRule factory = new DriverRule();

    @BeforeAll
     static void setup() {
        driver = factory.getDriver();
        new MainPage(driver).openBrowser();
        new MainPage(driver).checkIsMainPageIsOpen();
       
    }

    
    @ParameterizedTest
    @DisplayName("Check is cards amount on page changed")
    @MethodSource("testOpenDifferentAmountOfCards")
    void testCardsAmountIsChanged(String id, int expectedAmountOfCards) {
        new MainPage(driver).clickOnChangerOfCardsAmount();
        new MainPage(driver).clickOnSomeAmountOfCards(id);
        new MainPage(driver).checkThatAmountOfCardsIsChanged(expectedAmountOfCards);
    }

    private static Stream<Arguments> testOpenDifferentAmountOfCards() {
        return Stream.of(
                Arguments.of("rc_select_3_list_0", 10),
                Arguments.of("rc_select_3_list_1", 20),
                Arguments.of("rc_select_3_list_2", 50),   
                Arguments.of("rc_select_3_list_3", 100)
        );
    }
    
}
