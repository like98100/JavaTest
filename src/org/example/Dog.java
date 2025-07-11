package org.example;

public class Dog extends Animal {

    // method
    @Override
    void sound() {
        System.out.println("멍멍");
        //super.sound();
    }

    public static void main(String[] args){
        Animal myDog = new Dog();

        myDog.sound();
    }
}
