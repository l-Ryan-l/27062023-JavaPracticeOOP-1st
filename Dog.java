public class Dog extends Animal {

    public Dog(String name, int age, String breed, String color) {
        super(name, age, breed, color);
    }

    @Override
    void voice() {
        System.out.println("Woof-woof!");
    }

    @Override
    void eat(int bites) {
        int limit = 50;
        if (bites < limit)
            System.out.println("More more foood!");
        else System.out.println("I'm full");
    }

    @Override
    void sleep() {
        System.out.println("Sleeping...");
    }

    @Override
    void giveAPaw() {
        System.out.println("Hold it tight!");
    }
}
