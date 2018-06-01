package lab8;

import java.util.HashMap;


public class z45 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("key 0", "value 0");
        map.put("key 1", "value 1");
        map.put("key 2", "value 2");
        map.put("key 3", "value 3");
        map.put("key 4", "value 4");
        map.put("key 5", "value 5");
        map.put("key 6", "value 6");
        map.put("key 7", "value 7");
        map.put("key 8", "value 8");
        map.put("key 9", "value 9");

        // T4 keys
        map.keySet().forEach(System.out::println);

        // T5 values
        map.values().forEach(System.out::println);
    }
}