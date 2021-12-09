package aquarium;

public class Tang extends Fish{

    private int growth = 1;

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        setMemoryLoss();
    }

    public void feed() {
        setWeight(growth);
    }
}
