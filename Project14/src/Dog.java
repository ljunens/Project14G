public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " running");
    }

    public void speak() {
        System.out.println(name + " barking");
    }

    public void chaseTail() {
        System.out.println(name + " playing games");
    }
}