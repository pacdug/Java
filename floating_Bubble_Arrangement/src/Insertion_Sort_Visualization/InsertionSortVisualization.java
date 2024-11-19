package Insertion_Sort_Visualization;

public class InsertionSortVisualization {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Di chuyển các phần tử của array[0..i-1], nếu lớn hơn key, về phía sau một vị trí
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;

            // In mảng sau mỗi bước chèn
            printArray(array, i);
        }
    }

    // Hàm in mảng
    public static void printArray(int[] array, int step) {
        System.out.print("Bước " + step + ": ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Mảng ban đầu:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        insertionSort(array);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}



