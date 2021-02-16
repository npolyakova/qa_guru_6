import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchYandexTest {

    private String url = "https://yandex.ru";

    @Test
    void selenideSearchTest() {
        open(url);
        $("#text").val("Selenide").pressEnter();
        $(withText("selenide.org")).shouldBe(Condition.exist);
    }
}