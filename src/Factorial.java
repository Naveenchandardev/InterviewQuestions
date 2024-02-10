public class Factorial {
    //formula:  n*(n-1)
    public static void main(String[] args) {
        int number = 5; // Example: Calculate factorial of 5
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
    private static long factorial(int number) {
         if (number == 0) {
            return 1;
        }
         return number * factorial(number - 1);
    }
}
