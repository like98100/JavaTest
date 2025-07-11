package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    // method
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(i + "번째 아이템: " + list.get(i));
        }

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        System.out.println(intList);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat());
        animalList.add(new Dog());
        for (Animal animal : animalList) {
            animal.sound();
        }

    }
}
