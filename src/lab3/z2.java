package lab3;

public class z2 {
    public static void main(String[] args) {
        int[] array = new int[98 / 2 + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i * 2) + 1;
        }
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
    }
}