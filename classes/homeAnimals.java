package classes;

public class homeAnimals extends animal {

    public homeAnimals(String name, String date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "homeAnimals {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}