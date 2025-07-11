package org.example;

// 다른 디렉토리(패키지) 내에 있는 참조 파일 선언
import org.example.top.Flyable;

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
