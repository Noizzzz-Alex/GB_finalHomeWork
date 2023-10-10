package classes;

public class hamster extends homeAnimals {
    public hamster(String name, String date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Hamster {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}