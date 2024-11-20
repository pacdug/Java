package arrayinsertion;

import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        System.out.println("Nhập số phần tử của mảng:");
        int N = scanner.nextInt();
        int[] array = new int[N + 1]; // Khởi tạo mảng có kích thước N+1 để chứa phần tử mới

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là số cần chèn
        System.out.println("Nhập phần tử cần chèn:");
        int X = scanner.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.println("Nhập vị trí cần chèn:");
        int index = scanner.nextInt();

        // Bước 4: Kiểm tra nếu index <= -1 và index >= array.length – 1
        if (index <= -1 || index >= N) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            // Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
            for (int i = N; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;

            // Bước 6: In ra mảng
            System.out.println("Mảng sau khi chèn phần tử " + X + ":");
            for (int i = 0; i < N + 1; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

