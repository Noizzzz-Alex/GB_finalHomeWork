package classes;

public class Main {
    public static void main(String[] args) {
        DB database = new DB();
        Menu menu = new Menu(database);
        menu.displayMenu();
    }
}
