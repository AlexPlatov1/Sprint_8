import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Step("Успешный тест")
    @Test
    public void testValidName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Step("Отсутствует пробел")
    @Test
    public void testNoSpace() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Step("Два пробела")
    @Test
    public void testMultipleSpaces() {
        Account account = new Account("Тимоти  Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Step("Пробел в начале")
    @Test
    public void testSpaceAtStart() {
        Account account = new Account(" Тимоти Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Step("Пробел в конце")
    @Test
    public void testSpaceAtEnd() {
        Account account = new Account("Тимоти Шаламе ");
        assertFalse(account.checkNameToEmboss());
    }
    @Step("Мень 3 символов")
    @Test
    public void testTooShort() {
        Account account = new Account("Ти");
        assertFalse(account.checkNameToEmboss());
    }

    @Step("Больше 19 символов")
    @Test
    public void testTooLong() {
        Account account = new Account("Тимоти ШаламеТимотиШ");
        assertFalse(account.checkNameToEmboss());
    }
}