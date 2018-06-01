package lab6;


public class pegasus extends horse {
    public pegasus(String name) {
        super(name);
    }


    public void fly() {
        System.out.println(getName() + " fly!");
    }
}