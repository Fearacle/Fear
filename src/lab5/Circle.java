package lab5;


@SuppressWarnings("ALL")
public class Circle {

    private double x, y, r;

    public Circle() {
        this(0, 0, 1.0);
    }

    //T3
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    //T1
    public double circumference() {
        return 2.0 * Math.PI * r;
    }

    //T2
    public void randomPos() {
        x = random(-99, 99);
        y = random(-99, 99);
    }

    //T4
    public double distance(Circle circle) {
        double tx = x - circle.x;
        double ty = y - circle.y;

        return Math.sqrt(tx * tx + ty * ty);
    }

    //T5
    public boolean contactInOnePoint(Circle circle) {
        double dist = distance(circle);

        return r + circle.r == dist || Math.abs(r - circle.r) == dist;
    }

    private static double random(double min, double max) {
        return Math.random() * (max - min) + min;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.randomPos();
        System.out.println(c);
    }

}