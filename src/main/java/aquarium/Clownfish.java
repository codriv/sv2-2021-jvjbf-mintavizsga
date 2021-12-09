package aquarium;

public class Clownfish extends Fish{

    private int growth = 1;

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
    }

    public void feed() {
        setWeight(growth);
    }
}