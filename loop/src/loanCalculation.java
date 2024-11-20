import java.util.Scanner;

public class loanCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of loan :");
        double amount = sc.nextDouble();

        System.out.println("Enter the month :");
        int month = sc.nextInt();

        System.out.println("Enter annual interest rate in percentage:");
        double interestRate = sc.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += amount * (interestRate/100)/12 * month;
        }

        System.out.println("Total of interest: " + totalInterest);
    }
}
