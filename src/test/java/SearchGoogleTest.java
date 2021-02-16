import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class SearchGoogleTest {

    // Добавляю этот тест вместо searchingTests, потому что класс должен быть с большой буквы
    private String url = "https://www.google.com/";

    @Test
    void selenideSearchTest() {
        open(url);
        $(byName("q")).val("Selenide").pressEnter();
        $("#search").shouldHave(text("selenide.org"));
    }
}