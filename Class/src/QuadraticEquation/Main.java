package QuadraticEquation;
import com.sun.xml.internal.fastinfoset.util.QualifiedNameArray;

import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 2 : ax^2 + bx + c = 0");
        System.out.println("nhập a :");
        int a = in.nextInt();
        System.out.println("nhập b :");
        int b = in.nextInt();
        System.out.println("nhập c :");
        int c = in.nextInt();

        quadraticEquation quadraticEquation = new quadraticEquation(a,b,c);

        if(quadraticEquation.Delta() > 0 ){
            System.out.println("Phương trình có 2 nghiệm :" + "x1 = " + quadraticEquation.getRoot1() + "x2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.Delta() == 0){
            double x = -b/(2.0*a);
            System.out.println("phương trình có nghiệm kép :" + "x1 = x2 = " + x );
        }else{
            System.out.println("Phương trình vô nghiệm !");
        }
    }
}
