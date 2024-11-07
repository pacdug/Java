package Introduction_Java;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year:");
        int year = sc.nextInt();

        String a ;
        if(year%4==0 && year%100!=0 || year%400==0 && year%100 == 0){
            a = "leap year";
        } else {
            a = "not leap year";
        }

        System.out.println(a);
    }
}
