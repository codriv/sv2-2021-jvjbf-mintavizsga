package aquarium;

public class Clownfish extends Fish{

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
    }

    public void feed() {
        setWeight(1);
    }
}