package classes;

public class horse extends draftAnimals{
    public horse(String name, String date) {
        super(name, date);
    }
    @Override
    public String toString() {
        return "Horse {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
