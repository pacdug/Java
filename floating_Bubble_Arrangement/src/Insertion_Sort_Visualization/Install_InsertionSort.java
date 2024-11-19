package Insertion_Sort_Visualization;

public class Install_InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Mảng ban đầu:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(array);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
