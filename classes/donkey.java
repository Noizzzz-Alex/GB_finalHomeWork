package classes;

public class donkey extends draftAnimals {

    public donkey(String name, String date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Donkey {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
