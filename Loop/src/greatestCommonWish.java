import java.util.Scanner;

public class greatestCommonWish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        a= Math.abs(a);
        b= Math.abs(b);

        if(a==0 || b==0){
            System.out.println("No greatest common factor");
        }

        while (a!=b){
            if(a>b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        System.out.println("The greatest common factor is "+a);
    }
}
