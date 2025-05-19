public class Variables {
    public static void main(String[] args) {
        final double PI = 3.14;
        int a = 5;
        char b = 'a'; // You cannot use double quotes for char
        boolean isAdmin = true;
        var c = "dfdfds"; // var is a keyword in Java 10 and later for dynamic typing
        String name = "John Doe";
        // PI = 3.1; // This will cause a compilation error
        System.out.print("Hello world!");
        System.out.print("Cool!");
        System.out.println(!isAdmin);
    }
}