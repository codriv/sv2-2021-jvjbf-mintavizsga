package aquariumWithoutAbstract;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> fishes = new ArrayList<>();
    public static final int CAPACITY = 20;

    public void addFish(Fish fish) {
        if ((fishes.size() + 1) * Fish.VOLUME_REQUIRED <= CAPACITY) {
            fishes.add(fish);
        } else {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
    }

    public void feed() {
        for (Fish fish: fishes) {
            fish.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> fishesOverWeight =  new ArrayList<>();
        for (Fish fish: fishes) {
            if (fish.getWeight() > maxWeight) {
                fishesOverWeight.add(fish);
            }
        }
        fishes.removeAll(fishesOverWeight);
    }

    public List<String> getStatus() {
        List<String> status =  new ArrayList<>();
        for (Fish fish: fishes) {
            status.add(fish.getStatus());
        }
        return status;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int fishesWithMemoryLoss =  0;
        for (Fish fish: fishes) {
            if (fish.hasMemoryLoss()) {
                fishesWithMemoryLoss++;
            }
        }
        return fishesWithMemoryLoss;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish fish: fishes) {
            if(fish.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish smallestFish = fishes.get(0);
        for (Fish fish: fishes) {
            if (fish.getWeight() < smallestFish.getWeight()) {
                smallestFish = fish;
            }
        }
        return smallestFish;
    }
}
