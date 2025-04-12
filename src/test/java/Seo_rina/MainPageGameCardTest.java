package Seo_rina;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;




public class MainPageGameCardTest {
    private static WebDriver driver;

    public static DriverRule factory = new DriverRule();

    @BeforeAll
     static void setup() {
        driver = factory.getDriver();
        new MainPage(driver).openBrowser();
        new MainPage(driver).checkIsMainPageIsOpen();
    }

    
    @ParameterizedTest
    @DisplayName("Test that correct game card is opened based on the index")
    @ValueSource(ints={0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    public void testIsGameCardIsOpen(int index) {

        String mainPageCardName = new MainPage(driver).getNameGameCardByIndex(index);
        
        new MainPage(driver).clickOnCard(index);
        
        new CardGamePage(driver).isCardGamePageOpen();
        String cardGameName = new CardGamePage(driver).getCardGameName();
        
        new CardGamePage(driver).clickButtonBackToMain();

        assertEquals(mainPageCardName, cardGameName);
        
    }

}
