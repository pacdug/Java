package max_element_matrix;

public class MaxElementMatrix {
    public static void main(String[] args) {
        double[][] matrix = {
                {1.0, 2.5, 3.0},
                {4.7, 5.0, 6.4},
                {7.0, 8.8, 9.5}
        };

        double maxValue = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxRow = i;
                    maxCol = j;
                    maxValue = matrix[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất là: " + maxValue + " tại tọa độ (" + maxRow + ", " + maxCol + ")");
    }
}
