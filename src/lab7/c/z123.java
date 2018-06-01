package lab7.c;


public class z123 {

    static void print(int i) {
        System.out.println(i);
    }

    static void print(Integer i) {
        System.out.println(i);
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(double d) {
        System.out.println(d);
    }

    static void print(char c) {
        System.out.println(c);
    }

    static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        print(0);
        print(new Integer(1));
        print("3");
        print(4.0);
        print('5');
        print(new z123());
    }
}