import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JUnit5CodeCheck {

    @Test
    void findJUnit5Code() {

        //Открываем url
        open("https://github.com/selenide/selenide");

        //Кликаем на таб Wiki
        $("#wiki-tab").click();

        //Раскрываем блок Pages
        $(".wiki-more-pages-link button").click();

        //Проверяем наличие ссылки на страницу SoftAssertions и кликаем на нее
        $x("//a[contains(text(),'SoftAssertions')]")
                .shouldHave(attribute("href", "https://github.com/selenide/selenide/wiki/SoftAssertions")).click();

        //Проверяем наличие блока с кодом для JUnit5
        $(byText("Using JUnit5 extend test class:")).parent().sibling(0).shouldHave(text("@ExtendWith"));

    }

}
