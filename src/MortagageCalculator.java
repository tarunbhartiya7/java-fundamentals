import java.text.NumberFormat;
import java.util.Scanner;

public class MortagageCalculator {
    // Ask te user for the principal amount, interest rate, and number of years
    // Calculate the monthly payment using the formula
    // M = P[r(1 + r)^n] / [(1 + r)^n – 1]
    // where M is the monthly payment, P is the principal amount, r is the monthly
    // interest rate, and n is the number of payments

    public static void main(String[] args) {
        int principal = (int) readInput("Enter the principal amount (between 1K and 1M): ", 1000, 1_000_000);
        float annualInterestRate = readInput("Enter the annual interest rate (between 1 and 30): ", 1, 30);
        int years = (int) readInput("Enter the number of years (between 1 and 30): ", 1, 30);

        double monthlyPayment = calculateMoratage(principal, annualInterestRate, years);
        String formattedMonthlyPayment = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.printf("Your monthly payment is: %s\n", formattedMonthlyPayment);
    }

    public static float readInput(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        float value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max) {
                break;
            }
        }
        return value;
    }

    public static double calculateMoratage(double principal, float annualInterestRate, int years) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        double monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return monthlyPayment;
    }
}
