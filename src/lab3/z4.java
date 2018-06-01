package lab3;

public class z4 {
    public static void main(String[] args) {
        int[][] arr = new int[8][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (10 + (Math.random() * 90));
            }
        }
        for (int[] ints : arr) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}