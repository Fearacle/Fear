package lab2;


import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            int m = reader.nextInt();
            int n = reader.nextInt();

            StringBuilder builder = new StringBuilder();
            for (; n > 0; n--) builder.append('8');
            for (; m > 0; m--) System.out.println(builder);
        }
    }
}