package dop_lab;

import java.util.Scanner;

public class dlab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        StringBuilder y = new StringBuilder();
        if (x % 3 == 0) y.append("Fizz");
        if (x % 5 == 0) y.append("Buzz");
        System.out.println(y);
        if (prime(x)) System.out.println("prostoe");
        else System.out.println("ne prostoe");

    }

    private static boolean prime(int x) {
        for (int i = 2; i < Math.sqrt(x) + 1; i++)
            if (x % i == 0) return false;
        return true;

    }
}
