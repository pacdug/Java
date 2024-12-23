package maxinarray;

import java.util.Scanner;

public class maxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        int[] array;

        do{
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("The array is too large.");
            }
        }while(size > 20);

        System.out.println("Enter the elements of the array: ");
        array = new int[size];
        int i = 0 ;
        while(i < array.length){
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
