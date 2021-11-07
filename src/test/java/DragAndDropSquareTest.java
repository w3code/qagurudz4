import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropSquareTest {

    @Test
    void dragAndDropSquareMove(){
        //Открываем страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //Двигаем квадрат А на место квадрата В
        $("#column-a").dragAndDropTo("#column-b");

        //Проверяем поменялись ли квадраты местами
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }
}
