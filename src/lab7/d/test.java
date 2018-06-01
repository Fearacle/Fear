package lab7.d;


public class Test {
    public static void main(String[] args) {

        cow cow = new cow();
        cow.printName();
        print(cow);


        whale whale = new whale();
        whale.printName();
        print(whale);


        cat cat = new cat();
        cat catChild = cat.getChild();
        print(cat);
        print(catChild);


        dog dog = new dog();
        dog dogChild = dog.getChild();
        print(dog);
        print(dogChild);

    }

    private static void print(Object object) {
        System.out.println(object.getClass().getSimpleName());
    }
}