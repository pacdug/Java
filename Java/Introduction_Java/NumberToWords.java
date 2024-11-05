package Introduction_Java;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
            return;
        }

        if (number == 0) {
            System.out.println("zero");
            return;
        }

        // Đọc số hàng trăm
        int hundreds = number / 100;
        int remainder = number % 100;

        if (hundreds > 0) {
            System.out.print(convertSingleDigit(hundreds) + " hundred");
            if (remainder > 0) {
                System.out.print(" and ");
            }
        }

        // Đọc số hàng chục và hàng đơn vị
        if (remainder < 10 && remainder > 0) {
            System.out.print(convertSingleDigit(remainder));
        } else if (remainder >= 10 && remainder < 20) {
            System.out.print(convertTeens(remainder));
        } else if (remainder >= 20) {
            int tens = remainder / 10;
            int ones = remainder % 10;

            System.out.print(convertTens(tens));
            if (ones > 0) {
                System.out.print(" " + convertSingleDigit(ones));
            }
        }

        System.out.println();
    }

    // Hàm chuyển đổi số có một chữ số thành chữ
    public static String convertSingleDigit(int number) {
        switch (number) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    // Hàm chuyển đổi các số từ 10 đến 19 thành chữ
    public static String convertTeens(int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    // Hàm chuyển đổi hàng chục thành chữ
    public static String convertTens(int number) {
        switch (number) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
