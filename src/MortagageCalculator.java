import java.text.NumberFormat;
import java.util.Scanner;

public class MortagageCalculator {
    // Ask te user for the principal amount, interest rate, and number of years
    // Calculate the monthly payment using the formula
    // M = P[r(1 + r)^n] / [(1 + r)^n – 1]
    // where M is the monthly payment, P is the principal amount, r is the monthly
    // interest rate, and n is the number of payments

    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        int principal;
        float annualInterestRate;
        int years;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the principal amount (between 1K and 1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            }
        }

        while (true) {
            System.out.print("Enter the annual interest rate (between 0 and 30): ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= 0 && annualInterestRate <= 30) {
                break;
            }
        }

        while (true) {
            System.out.print("Enter the number of years (between 1 and 30): ");
            years = scanner.nextInt();
            if (years >= 1 && years <= 30) {
                break;
            }
        }

        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        String formattedMonthlyPayment = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.printf("Your monthly payment is: %s\n", formattedMonthlyPayment);
    }
}
