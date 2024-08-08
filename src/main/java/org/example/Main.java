package org.example;

import org.example.Lesson_10.Animal;
import org.example.Lesson_10.Cat;
import org.example.Lesson_10.Dog;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.example.Lesson_4.Lesson_4.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Cat cat2 = new Cat("Барсик");
        cat.run(100);
        cat.swim(50);
        Dog dog = new Dog("Шарик");
        dog.run(200);
        dog.run(600);
        dog.swim(100);
        cat.eat(10);
        System.out.println(cat.isFull());
        System.out.println("Количество созданных котов: " + Cat.getCatCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
        System.out.println("Количество созданных животных: " + Animal.getAnimalCount());
    }
}