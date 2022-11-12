import org.junit.jupiter.api.*;

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
        String name = "Vasya";
        String number = "+7 912 345 67 89";
        Assertions.assertTrue(phoneBook.add(name, number));
    }

    @Test
    public void testFindByNumber() {
        phoneBook.add("Vasya", "+7 912 345 67 89");
        String name = "Vasya";
        String number = "+7 912 345 67 89";
        Assertions.assertEquals(name, phoneBook.findByNumber(number));
    }

}
