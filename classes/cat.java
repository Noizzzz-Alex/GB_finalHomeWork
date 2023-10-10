package classes;

public class cat extends homeAnimals{
    public cat(String name, String date) {
        super(name, date);
    }
    @Override
    public String toString() {
        return "Cat {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
