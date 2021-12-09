package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OwlCounter {

    private List<String> owls;

    public List<String> readFromFile(Path path) {
        try {
            owls = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.");
        }
        return owls;
    }

    public int getNumberOfOwls(String county) {
        for (String line: owls) {
            String nameOfCounty = line.split("=")[0];
            int numberOfOwls = Integer.parseInt(line.split("=")[1]);
            if (nameOfCounty.equals(county)) {
                return numberOfOwls;
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }

    public int getNumberOfAllOwls() {
        int numberOfAllOwls = 0;
        for (String line: owls) {
            int numberOfOwls = Integer.parseInt(line.split("=")[1]);
            numberOfAllOwls += numberOfOwls;
        }
        return numberOfAllOwls;
    }
}