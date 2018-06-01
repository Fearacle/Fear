package lab4;


import static lab4.z1.randRange;

public class z2 {
    public static void arrayPrint(int[] arr) {
        for (int num : arr
                ) {
            System.out.print(num + " ");

        }
    }

    public static void main(String[] args) {
        int a = (int) (Math.random() * 100), b = (int) (Math.random() * 100);
        System.out.println("a= " + a + ", b= " + b);
        int[][] mainArr = new int[5][10];
        for (int i = 0; i < 5; i++) {
            mainArr[i] = new int[10];
        }
        for (int i = 0; i < mainArr.length; i++) {
            for (int j = 0; j < mainArr[0].length; j++) {
                mainArr[i][j] = randRange(a, b);
            }
        }
        for (int[] str : mainArr
                ) {
            arrayPrint(str);
            System.out.println();

        }

    }
}