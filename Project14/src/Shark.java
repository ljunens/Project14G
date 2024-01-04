public class Shark extends Animal {
    private String name;

    public Shark(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(name + " swimming");
    }

    public void speak() {
        System.out.println(name + " nothing :D");
    }
}