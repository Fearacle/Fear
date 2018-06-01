package lab8;

import java.util.HashMap;


public class z3 {
    public static void main(String[] args) {
        HashMap<String, Cat> cats = new HashMap<>();


        cats.put("дыня", new Cat("дыня"));
        cats.put("ежевика", new Cat("ежевика"));
        cats.put("банан", new Cat("банан"));
        cats.put("арбуз", new Cat("арбуз"));
        cats.put("груша", new Cat("груша"));
        cats.put("картофель", new Cat("картофель"));
        cats.put("земляника", new Cat("земляника"));
        cats.put("ирис", new Cat("ирис"));
        cats.put("вишня", new Cat("вишня"));
        cats.put("жень-шень", new Cat("жень-шень"));


        cats.forEach((s, cat) -> System.out.format("key: %15s  value: %s\n", s, cat));
    }

}

final class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat[" + name + ']';
    }
}