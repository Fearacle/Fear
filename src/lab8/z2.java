package lab8;

import java.util.HashMap;


public class z2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");


        map.forEach((k, v) -> System.out.format("%s - %s\n", k, v));
    }
}