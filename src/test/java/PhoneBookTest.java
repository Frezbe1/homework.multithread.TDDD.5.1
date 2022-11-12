import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Vasya";
        String number = "+7 912 345 67 89";
        Assertions.assertTrue(phoneBook.add(name, number));
    }
}
