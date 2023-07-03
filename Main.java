public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat("Cookies", 3, "domestic", "orange");
        Cat catTwo = new Cat("Deniz", 1, "domestic", "striped");
        Dog dogOne = new Dog("Laika", 3, "mongrel", "black and white");
        Bird birdOne = new Bird("Woody", 2, "woodpecker", "black with red head");

        //тест вывода инфы
        System.out.println(catOne);

        // тест метода "есть"
        catOne.eat(5);
        catOne.eat(55);
        dogOne.eat(49);
        dogOne.eat(100);
        birdOne.eat(4);

        //тест других методов
        catOne.sleep();
        catTwo.giveAPaw();
        catTwo.voice();
        dogOne.giveAPaw();
        birdOne.voice();

        // получение породы
        System.out.println(catTwo.getBreed());

        //создание Ранчо, добавление жителей
        Ranch ranch = new Ranch();
        ranch.addToRanch(catOne);
        ranch.addToRanch(catTwo);
        ranch.addToRanch(dogOne);
        ranch.addToRanch(birdOne);

        //поиск по жителю
        System.out.println(ranch.getAnimal("Deniz"));

    }
}
