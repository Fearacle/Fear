package lab6;


public class cat extends pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + getWeight() +
                ", sex=" + getSex() +
                ", age=" + getAge() +
                ", name='" + name + '\'' +
                '}';
    }
}