public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vasya", "+7 912 345 67 89");

        System.out.println(phoneBook.findByNumber("+7 912 345 67 89"));

        System.out.println(phoneBook.findByName("Vasya"));
    }
}
