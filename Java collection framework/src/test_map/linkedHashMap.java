package test_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>(16, 0.75f, true);

        map.put("dung",21);
        map.put("vuong",30);
        map.put("manh",24);

        System.out.println("\nThe age for " + "Lewis is " + map.get("vuong"));
    }
}
