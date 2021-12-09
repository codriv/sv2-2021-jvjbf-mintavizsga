package aquarium;

public class Kong extends Fish{

    private int growth = 2;

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    public void feed() {
        setWeight(growth);
    }
}