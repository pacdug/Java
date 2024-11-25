package reverse_string_using_stack;

import java.util.Stack;
import java.util.Scanner;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        Stack<String> stack = new Stack<>();
        String[] words = str.split(" ");

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());

            if(!stack.isEmpty()) {
                reversedStr.append(" ");
            }
        }

        System.out.println("Reversed String: " + reversedStr.toString());
        sc.close();
    }
}
