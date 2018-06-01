package lab2;

import java.util.Scanner;

public class hard1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sc5_1 = sc.next();
        String sc5_2 = sc.next();
        if (sc5_1.equals(sc5_2)) {
            System.out.println("Имена одинаковые");
        } else {
            if ((sc5_1.length()) == (sc5_2.length())) {
                System.out.println("Длины имен равны");
            }
        }
    }
}
