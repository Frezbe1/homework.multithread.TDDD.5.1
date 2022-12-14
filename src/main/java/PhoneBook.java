import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private static Map<String, String> book = new TreeMap<>();

    public boolean add(String name, String number) {
        return book.putIfAbsent(name, number) == null;
    }

    public String findByNumber(String number) {
        String name = "Такого номера нет в списке ваших контактов";
        for (Map.Entry<String, String> entry : book.entrySet()) {
            if (entry.getValue().equals(number)) {
                name = entry.getKey();
            }
        }
        return name;
    }

    public String findByName(String name) {
        return book.get(name) == null ? "Контакт не найден" : book.get(name);
    }

    public List<String> printAllNames() {
        return new ArrayList<>(book.keySet());
    }
}
