public class Cat extends Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " running");
    }

    public void speak() {
        System.out.println(name + " meowing");
    }
}