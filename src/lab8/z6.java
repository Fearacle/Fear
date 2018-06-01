package lab8;

import java.util.HashMap;


public class z6 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();

        map.put("key 0", "value 0");
        map.put("key 1", new Integer("1"));
        map.put("key 2", 2);
        map.put("key 3", new Double("3.0"));
        map.put("key 4", 4.0);
        map.put("key 5", '5');
        map.put("key 6", new Long("6"));
        map.put("key 7", 7L);
        map.put("key 8", new Float("8.0"));
        map.put("key 9", new z6());

        map.forEach((s, o) -> System.out.format("%s - %s\n", s, o));
    }
}