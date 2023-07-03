public class Cat extends Animal{
    public Cat(String name, int age, String breed, String color) {
        super(name, age, breed, color);
    }

    @Override
    void voice() {
        System.out.println("Meeeeow!");
    }
    @Override
    void eat(int bites) {
        int limit = 10;
        if (bites < limit)
            System.out.println("Feed me! I've never eaten food!");
        else System.out.println("I'm full");
    }

    @Override
    void sleep() {
        System.out.println("Sleeping...");
    }

    @Override
    void giveAPaw() {
        System.out.println("Nah! Am I a dog to you?!");
    }


}
