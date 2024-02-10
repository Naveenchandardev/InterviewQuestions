import java.util.HashMap;
import java.util.Map;

public class StringManipulation {
    //Given input is : a1b2c3a2b3g5i7
    // Output is : a3b5c3g5i7
    public static void main(String[] args) {
        String input = "a1b2c3a2b3g5i7";
        String manipulationString = manipulationString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + manipulationString);
    }
    private static String manipulationString(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        StringBuilder compressedString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                charCountMap.putIfAbsent(currentChar, 0);
            } else {
                int count = Character.getNumericValue(currentChar);
                System.out.println("check: "+charCountMap.get(input.charAt(i - 1)) );//ref;
                charCountMap.put(input.charAt(i - 1), charCountMap.get(input.charAt(i - 1)) + count);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            compressedString.append(entry.getKey()).append(entry.getValue());
        }

        return compressedString.toString();
    }
}