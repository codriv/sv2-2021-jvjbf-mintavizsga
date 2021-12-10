package aquarium;

public class Kong extends Fish{

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    public void feed() {
        setWeight(2);
    }
}