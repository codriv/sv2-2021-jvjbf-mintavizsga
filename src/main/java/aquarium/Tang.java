package aquarium;

public class Tang extends Fish{

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        setMemoryLoss();
    }

    public void feed() {
        setWeight(1);
    }
}