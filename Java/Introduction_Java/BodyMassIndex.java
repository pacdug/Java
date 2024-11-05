package Introduction_Java;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width : ");
        int weight = sc.nextInt();
        System.out.println("Enter height : ");
        int height = sc.nextInt();

        float bmi = weight / (height * height);

        String mess;
        if (bmi < 18.5) {
            mess = "underweight";
            System.out.println(mess);
        } else if (bmi >= 18.5 && bmi < 25) {
            mess = "normal";
            System.out.println(mess);
        } else if (bmi >= 25 && bmi < 30) {
            mess = "Overweight";
            System.out.println(mess);
        }else if (bmi >= 30) {
            mess = "Obese";
            System.out.println(mess);
        }

    }
}
