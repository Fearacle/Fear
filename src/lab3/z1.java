package lab3;

public class z1 {
    public static void main(String[] args) {
        int[] arr = new int[18 / 2 + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 2;
        }
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println();
        for (int anArr : arr) {
            System.out.println(anArr);
        }
    }
}
