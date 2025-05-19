public class Loops {
    public static void main(String[] args) {
        // Traditional for loop example
        for (int i = 0; i < 5; i++) {
            System.out.println("Traditional for loop iteration: " + i);
        }

        // Enhanced for loop example
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int num : numbers) {
            System.out.println("Enhanced for loop iteration: " + num);
        }

        // While loop example
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // Do-while loop example
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k < 5);
    }

}
