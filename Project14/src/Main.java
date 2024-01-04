public class Main {
    public static void main(String[] args) {
        HomeAnimal<Dog> dogHome = new HomeAnimal<>(new Dog("dog"));
        HomeAnimal<Cat> catHome = new HomeAnimal<>(new Cat("cat"));

        try {
            HomeAnimal<Shark> sharkHome = new HomeAnimal<>(new Shark("shark"));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        dogHome.getAnimal().run();
        dogHome.getAnimal().speak();
        dogHome.getAnimal().chaseTail();
        dogHome.showClassType();
        dogHome.sleepOnTheCouch();

        catHome.getAnimal().run();
        catHome.getAnimal().speak();
        catHome.showClassType();
        catHome.sleepOnTheCouch();

        HomeAnimal<Shark> sharkHome = new HomeAnimal<>(new Shark("shark"));
        sharkHome.getAnimal().swim();
        sharkHome.getAnimal().speak();
        sharkHome.showClassType();
        sharkHome.sleepInSea();
    }
}