package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    // method
    public static void main(String[] args)
    {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("World");
//        System.out.println(list);
//        for(int i = 0; i < list.size(); i++)
//        {
//            System.out.println(i + "번째 아이템: " + list.get(i));
//        }
//
//        List<Animal> animalList = new ArrayList<>();
//        animalList.add(new Cat());
//        animalList.add(new Dog());
//        for (Animal animal : animalList) {
//            animal.sound();

        createIntList(9);

    }

    public static void createIntList(int num)
    {
        List<Integer> intList = new ArrayList<>();

        for(int i = 0; i < num; i++)  intList.add(i+1);                     // 1 ~ num(9) 저장

        System.out.println(intList);                                        // 리스트 전체 출력
        for(int i = 0; i < num; i++) System.out.println(intList.get(i));    // for문 사용하여 출력
    }

    }
