import java.util.Scanner;

public class Convert_money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the USD you want to convert :");
        double USD = sc.nextDouble();

        double VND = USD * 25000;

        System.out.println("The USD you want to convert is : " + VND);
    }
}
