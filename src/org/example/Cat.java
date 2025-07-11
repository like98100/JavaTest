package org.example;

public class Cat extends Animal{

    // method
    @Override
    void sound() {
        System.out.println("야옹");
        //super.sound();
    }

    public static void main(String[] args){
        Animal myCat = new Cat();

        myCat.sound();
    }

}
