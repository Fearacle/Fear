package lab4;


import static java.lang.Float.min;

public class z1 {

    public static int randRange(int a, int b) {
        return (int) (min(a, b) + (Math.random() * Math.abs(b + 1 - a)));
    }

    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        System.out.println("a= " + a + ", b= " + b);
        int[] arr = new int[20];
        for (int num : arr) {
            num = randRange(a, b);
            System.out.print(num + " ");
        }

    }
}