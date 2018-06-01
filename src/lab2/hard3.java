package lab2;

import java.util.Scanner;

public class hard3 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        try {
            x = sc.nextInt();
            y = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
        } finally {
            if (x == 0 | y == 0) {
                System.out.println("Точка находится на оси");
            }
            if (x > 0 & y > 0) System.out.println("1");
            if (x > 0 & y < 0) System.out.println("4");
            if (x < 0 & y > 0) System.out.println("2");
            if (x < 0 & y < 0) System.out.println("3");
        }
    }
}