public class Bird extends Animal{
    public Bird(String name, int age, String breed, String color) {
        super(name, age, breed, color);
    }

    @Override
    void voice() {
        System.out.println("*you hear the melody*");
    }

    @Override
    void eat(int bites) {
        int limit = 5;
        if (bites < limit)
            System.out.println("*tks-tsk-tsk*");
        else System.out.println("*too much food*");
    }

    @Override
    void sleep() {
        System.out.println("Hiding head above the wing");
    }

    @Override
    void giveAPaw() {
        System.out.println("Strange but ok");
    }
}
