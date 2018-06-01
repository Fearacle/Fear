package lab6;


@SuppressWarnings("ALL")
public class dog extends pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + getWeight() +
                ", sex=" + getSex() +
                ", age=" + getAge() +
                ", name='" + name + '\'' +
                '}';
    }
}