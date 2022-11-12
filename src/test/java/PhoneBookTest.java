import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @BeforeAll
    public static void startTests() {
        System.out.println("Начало тестов");
    }

    @AfterAll
    public static void endTests() {
        System.out.println("Конец тестов");
    }

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Vasya";
        String number = "+7 912 345 67 89";
        Assertions.assertTrue(phoneBook.add(name, number));
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Vasya";
        String number = "+7 912 345 67 89";
        Assertions.assertEquals(phoneBook.findByNumber(number), name);
    }

}
