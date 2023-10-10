package classes;

public class draftAnimals extends animal {
    public draftAnimals(String name, String date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Draft Animal {" +
        "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}

