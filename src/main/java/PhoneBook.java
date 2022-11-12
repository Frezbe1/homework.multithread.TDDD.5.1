import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private static Map <String, String> book = new TreeMap<>();
    public boolean add(String name, String number){
        return book.putIfAbsent(name, number) == null;
    }
}
