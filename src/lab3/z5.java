package lab3;

public class z5 {
    public static void main(String[] args) {
        int[][] arr = new int[7][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = -5 + (int) (Math.random() * 11);
            }
        }
        for (int[] str : arr) {
            for (int num : str) {
                if (num < 0) {
                    System.out.print(" " + num);
                } else {
                    System.out.print("  " + num);
                }
            }
            System.out.println();
        }
        int max = 0, temp = 1, index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                temp *= arr[i][j];
            }
            if (Math.abs(temp) >= max) {
                max = Math.abs(temp);
                index = i;
            }
            temp = 1;
        }
        System.out.println("  " + (index + 1));
    }
}