package day9.Task1;

public class Human {
    private String name;

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
