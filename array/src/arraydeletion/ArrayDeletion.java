package arraydeletion;

import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        System.out.println("Nhập số phần tử của mảng:");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là phần tử cần xoá
        System.out.println("Nhập phần tử cần xoá:");
        int X = scanner.nextInt();

        // Bước 3: Tìm X xem có xuất hiện trong mảng không
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        // Kiểm tra nếu phần tử không tồn tại trong mảng
        if (index_del == -1) {
            System.out.println("Phần tử không tồn tại trong mảng.");
        } else {
            // Bước 4: Thực hiện xoá phần tử X khỏi mảng
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Bước 5: In ra mảng sau khi xoá
            System.out.println("Mảng sau khi xoá phần tử " + X + ":");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

