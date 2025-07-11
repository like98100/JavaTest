package org.example;

public class Bird implements Flyable, Walkable {

    // method
    @Override
    public void fly()
    {
        System.out.println("새가 날아갑니다.");
    }

    @Override
    public void walk()
    {
        System.out.println("새가 걸어갑니다.");
    }

    public static void main(String[] args)
    {
        Bird bird = new Bird();

        bird.fly();
        bird.walk();
    }
}
