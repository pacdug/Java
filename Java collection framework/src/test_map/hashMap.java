package test_map;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("dung",21);
        map.put("vuong",30);
        map.put("manh",24);

        System.out.println("Display entries in HashMap");
        System.out.println(map + "\n");
    }
}
