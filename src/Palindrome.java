import java.util.stream.IntStream;
public class Palindrome {
    public static void main(String[] args) {
        String input = "Deified";
        System.out.println("Division method:: "+palindromeCheck(input.toLowerCase()));//normal method
        System.out.println("StreamApi method:: "+usingStreamApi(input.toLowerCase())); //using stream api;
        System.out.println("Traditional method:: "+traditionalMethod(input.toLowerCase())); //using stream api;
    }
    private static boolean traditionalMethod(String lowerCase) {
        StringBuilder reversed = new StringBuilder();
        for (int i = lowerCase.length() - 1; i >= 0; i--) {
            reversed.append(lowerCase.charAt(i));
        }
        String reversedStr = reversed.toString();
        return lowerCase.equals(reversedStr);
    }

    private static boolean usingStreamApi(String input)  {
        String reversed = IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(input.length() - i - 1))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        return input.equals(reversed);
    }
    private static Boolean palindromeCheck(String input) {
        Boolean result = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                result=false;
            }
        }
        return result;
    }
}
