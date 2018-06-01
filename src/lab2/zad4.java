package lab2;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(min(scanner.nextInt(), scanner.nextInt()));
        }
    }

    static int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }
}
