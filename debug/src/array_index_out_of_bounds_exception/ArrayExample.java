package array_index_out_of_bounds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();

        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n vui long nhap mot phan tu bat ky : ");
        int x = scanner.nextInt();

        try {
            System.out.println("gia tri cua phan tu co chi so 5 " + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("chi so vuot qua gioi han cua mang !");
        }
    }
}
