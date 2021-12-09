package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Text is null.");
        }
        List <Character> uniqueChars = new ArrayList<>();
        for (char character: input.toCharArray()) {
            if (!uniqueChars.contains(character)) {
                uniqueChars.add(character);
            }
        }
        return uniqueChars;
    }
}
