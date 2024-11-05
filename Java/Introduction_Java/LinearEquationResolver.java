package Introduction_Java;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        int a , b , c , x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a :");
        a = sc.nextInt();
        System.out.println("Enter b :");
        b = sc.nextInt();
        System.out.println("Enter c :");
        c = sc.nextInt();

        if (b==c){
            x = 0 ;
        } else {
            x = (c-b) / a ;
        }

        System.out.println("x = " + x);

    }
}
