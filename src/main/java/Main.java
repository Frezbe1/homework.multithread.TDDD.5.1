public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Sasha", "+7 012 345 67 89");
        phoneBook.add("Stas", "+7 952 543 76 98");

        System.out.println(phoneBook.findByNumber("+7 012 345 67 89"));

        System.out.println(phoneBook.findByName("Sasha"));

        System.out.println(phoneBook.printAllNames());
    }
}
