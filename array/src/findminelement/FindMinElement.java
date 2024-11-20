package findminelement;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo mảng số nguyên với SIZE phần tử
        System.out.println("Nhập kích thước của mảng:");
        int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < SIZE; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
        int minValue = array[0];

        // Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mảng
        for (int i = 1; i < SIZE; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        // Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minValue);

        scanner.close();
    }
}

