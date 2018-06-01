package lab2;

import java.util.Scanner;

import static lab2.zad4.min;


public class hard2 {

    public static int min4(int a, int b, int c, int d) {
        return (min(min(a, b), min(c, d)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0;
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
        } finally {
            System.out.println(min4(a, b, c, d));
        }
    }
}
