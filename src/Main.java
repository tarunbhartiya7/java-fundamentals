import java.util.Arrays;
import java.util.Date;

public class Main {
    public void main() {
        // byte age = 25;
        // String name = "John Doe";
        // System.out.println("Hello, " + name + "! You are " + age + " years old.");
        // System.out.println("Hello, World!");
        // int viewsCount = 3_000_000;
        // long viewsCount2 = 4_000_000_000L;
        // float price = 10.99F;
        // double price2 = 10.99;
        // char letter = 'A';
        // boolean isEligible = true;

        // Date now = new Date();
        // System.out.println("Current date and time: " + now);
        // System.out.println("Current time: " + now.getTime());

        // int[] numbers = new int[5];
        // // numbers = [1, 2, 3, 4, 5];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // // numbers[20] = 3; // This will cause an ArrayIndexOutOfBoundsException
        // System.out.println("The array is: " + Arrays.toString(numbers));

        // int[] numbers = { 1, 2, 3, 4, 5 }; // New syntax for array initialization
        // System.out.println("The array is: " + Arrays.toString(numbers));
        // Arrays.sort(numbers);
        // System.out.println("The sorted array is: " + Arrays.toString(numbers));

        // String x = "Hello";
        // String y = "Hello";
        // // x = "Sam";
        // System.out.println("x: " + x);
        // System.out.println("y: " + y);
        // System.out.println(x == "Hello");
        // System.out.println(x != "quit");
        // System.out.println(x.equals("Hello"));

        // String[] fruits = { "Apple", "Banana", "Cherry" };
        // for (String fruit : fruits) {
        // System.out.println(fruit);
        // }
        greetUser("Sam");
        greetUser("John");
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
