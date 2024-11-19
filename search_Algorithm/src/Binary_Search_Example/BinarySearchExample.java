package Binary_Search_Example;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khởi tạo một mảng bất kì với các giá trị được nhập vào từ bàn phím
        System.out.println("Nhập kích thước của mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp lại mảng theo thứ tự từ bé đến lớn
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Bước 3: Khai báo hàm binarySearch và thực hiện tìm kiếm
        System.out.println("Nhập giá trị cần tìm:");
        int value = scanner.nextInt();
        int result = binarySearch(array, 0, array.length - 1, value);

        // Kết quả tìm kiếm
        if (result == -1) {
            System.out.println("Giá trị " + value + " không tồn tại trong mảng.");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí " + result);
        }

        scanner.close();
    }

    // Bước 3: Khai báo hàm binarySearch
    public static int binarySearch(int[] array, int left, int right, int value) {
        // Bước 8: Lặp lại các bước cho đến khi left > right
        while (left <= right) {
            // Bước 4: Khai báo biến middle và gán giá trị cho nó
            int middle = left + (right - left) / 2;

            // Bước 5: Nếu array[middle] = value thì trả về middle
            if (array[middle] == value) {
                return middle;
            }

            // Bước 6: value > array[middle] thì tìm phía bên phải
            if (array[middle] < value) {
                left = middle + 1;
            }

            // Bước 7: value < array[middle] thì tìm phía bên trái
            else {
                right = middle - 1;
            }
        }

        // Nếu không tìm thấy, trả về -1
        return -1;
    }
}

