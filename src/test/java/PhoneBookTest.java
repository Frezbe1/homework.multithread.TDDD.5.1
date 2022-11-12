import org.junit.jupiter.api.*;

import java.util.List;

public class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeAll
    public static void startTests() {
        System.out.println("Начало тестов");
    }

    @BeforeEach
    public void createBook() {
        System.out.println("test start");
        phoneBook = new PhoneBook();
        phoneBook.add("Sasha", "+7 012 345 67 89");
        phoneBook.add("Stas", "+7 952 543 76 98");
    }

    @AfterEach
    public void deleteBook() {
        System.out.println("test completed");
        phoneBook = null;
    }

    @AfterAll
    public static void endTests() {
        System.out.println("Конец тестов");
    }

    @Test
    public void testAdd() {
        String name = "Nikita";
        String number = "+7 912 345 65 12";
        Assertions.assertTrue(phoneBook.add(name, number));
    }

    @Test
    public void testFindByNumber() {
        String name = "Sasha";
        String number = "+7 012 345 67 89";
        Assertions.assertEquals(name, phoneBook.findByNumber(number));
    }

    @Test
    public void testFindByName() {
        String name = "Sasha";
        String number = "+7 012 345 67 89";
        Assertions.assertEquals(number, phoneBook.findByName(name));
    }

    @Test
    public void testPrintAllNames() {
        String name1 = "Sasha";
        String name2 = "Stas";
        List<String> expected = List.of(name1, name2);
        Assertions.assertEquals(expected, phoneBook.printAllNames());
    }
}
