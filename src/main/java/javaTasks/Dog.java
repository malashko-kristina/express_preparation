package javaTasks;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    public void fetch() {
        System.out.println("Собака приносит палку");
    }
}
