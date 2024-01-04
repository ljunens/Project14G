public class HomeAnimal<T extends Animal> {
    private T animal;

    public HomeAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void showClassType() {
        System.out.println("Animal name " + animal.getClass().getSimpleName());
    }

    public void sleepOnTheCouch() {
        System.out.println(animal.getClass().getSimpleName() + " sleeping on soft something");
    }

    public void sleepInSea() {
        System.out.println(animal.getClass().getSimpleName() + " sleeping in sea");
    }
}