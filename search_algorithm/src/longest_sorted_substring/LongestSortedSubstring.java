package longest_sorted_substring;

import java.util.Scanner;

public class LongestSortedSubstring {

    // Hàm tìm chuỗi con được sắp xếp có độ dài lớn nhất
    public static String longestSortedSubstring(String input) {
        int maxLength = 0;
        int start = 0;
        int maxStart = 0;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) >= input.charAt(i - 1)) {
                if (i - start + 1 > maxLength) {
                    maxLength = i - start + 1;
                    maxStart = start;
                }
            } else {
                start = i;
            }
        }
        return input.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi:");
        String input = scanner.nextLine();

        String result = longestSortedSubstring(input);

        System.out.println("Chuỗi con được sắp xếp có độ dài lớn nhất:");
        System.out.println(result);
    }
}
