package word_frequency;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scanner.nextLine();

        Map<String, Integer> map = new TreeMap<>();
        String[] words = s.toLowerCase().split("\\s+");

        for (String word : words) {
            if (map.containsKey(word)) {// wordMap.containsKey(word) kiểm tra xem từ word đã có trong TreeMap wordMap hay chưa.
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Frequency of occurrence of words : ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}
