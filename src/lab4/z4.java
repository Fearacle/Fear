package lab4;

import java.util.Date;

public class z4 {
    public static int recFib(int n) {

        if (n <= 2) return 2;
        return recFib(n - 1) + recFib(n - 2);
    }

    public static void main(String[] args) {

        long start, finish;
        int i = 2;
        while (true) {
            Date startdt = new Date();
            start = startdt.getTime();
            recFib(i);
            Date findt = new Date();
            finish = findt.getTime();
            long diff = (finish - start) / 1000;
            System.out.println("Значение i = " + i + ", затраченное время: " + diff + " c");
            i++;

            if (diff >= 60) {
                System.out.println("Превышение минуты при i = " + i);
                break;
            }

        }


    }
}