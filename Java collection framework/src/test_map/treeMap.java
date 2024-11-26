package test_map;

import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        map.put("dung",21);
        map.put("vuong",30);
        map.put("manh",24);

        System.out.println("Display entries in HashMap");
        System.out.println(map + "\n");
    }
}
