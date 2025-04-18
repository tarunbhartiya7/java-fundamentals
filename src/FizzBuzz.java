import java.util.Scanner;

public class FizzBuzz {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or 'quit' to exit): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting the program.");
                break;
            }
            try {
                int number = Integer.parseInt(input);
                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (number % 5 == 0) {
                    System.out.println("Fizz");
                } else if (number % 3 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
