package Seo_rina;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
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

    
    @ParameterizedTest
    @DisplayName("Check is pagination by click on number of page is working")
    @MethodSource("IsClickOnNumberInPaginationCorrect")
    void checkIsPaginationIsWorking(String title) {
        new MainPage(driver).clickOnPaginationNumberItem(title);
        new MainPage(driver).checkIsNewPageOpen(title);
    }

    private static Stream<String> IsClickOnNumberInPaginationCorrect() {
        return Stream.of(
                "1",
                "2",
                "3",
                "1",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11",
                "12",
                "13",
                "14",
                "15",
                "16",
                "17",
                "18",
                "19",
                "20",
                "21",
                "22",
                "23",
                "24",
                "25",
                "26",
                "27",
                "28",
                "29",
                "30",
                "31",
                "32",
                "33",
                "34",
                "35",
                "36",
                "37",
                "38",
                "39",
                "40",
                "41"
        );
    }
}
