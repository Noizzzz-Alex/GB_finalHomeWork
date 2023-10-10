package classes;

public class dog extends homeAnimals{
    public dog(String name, String date) {
        super(name, date);
    }
    @Override
    public String toString() {
        return "Dog {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}

