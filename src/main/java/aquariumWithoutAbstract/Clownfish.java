package aquariumWithoutAbstract;

public class Clownfish extends Fish{

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
        setGrowth(1);
    }
}