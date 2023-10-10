package classes;

public class bullock extends draftAnimals{
    public bullock(String name, String date) {
        super(name, date);
    }
    @Override
    public String toString() {
        return "Camel {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
