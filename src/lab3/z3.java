package lab3;


public class z3 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
        int counter = 0;
        for (int anArr : arr) {
            if (anArr % 2 != 1) counter++;
        }
        System.out.println("\n" + counter);

    }
}