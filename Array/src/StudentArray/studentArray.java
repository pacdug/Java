package StudentArray;

import java.util.Scanner;

public class studentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Student = {"manh" , "son" , "Vuong" , "huy" ,"phu" , "long"};

        System.out.println("Enter a name's student :");
        String input_name = sc.nextLine();

        boolean check = false;
        for (int i = 0; i < Student.length; i++) {
            if (input_name.equals(Student[i])) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Student not found");
        }
    }
}
