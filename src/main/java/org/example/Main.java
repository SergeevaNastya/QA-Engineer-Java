package org.example;

import org.example.Lesson_10_Task1.Animal;
import org.example.Lesson_10_Task1.Cat;
import org.example.Lesson_10_Task1.Dog;
import org.example.Lesson_10_Task1.FoodBowl;
import org.example.Lesson_10_Task2.Circle;
import org.example.Lesson_10_Task2.Rectangle;
import org.example.Lesson_10_Task2.Triangle;

public class Main {
    public static void main(String[] args) {
        // 1 задание
        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Багет"),
                new Cat("Мурзик"),
                new Cat("Василий"),
                new Cat("Снежок"),
                new Cat("Персик")
        };
        System.out.println("Количество созданных котов: " + Cat.getCatCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
        System.out.println("Количество созданных животных: " + Animal.getAnimalCount());
        FoodBowl foodBowl = new FoodBowl(50);
        foodBowl.addFood(100);
        for (Cat cat : cats) {
            foodBowl.reduceFood(Cat.MIN_FOOD);
            cat.eat(Cat.MIN_FOOD);
            System.out.println(cat.getName() + " сытость: " + cat.isFull());
        }
        System.out.println("Оставшееся количество еды в миске: " + foodBowl.getFoodCount());
        // 2 задание
        Triangle triangle = new Triangle("красный", "черный", 10, 15, 20);
        Rectangle rectangle = new Rectangle("желтый", "черный", 20, 5);
        Circle circle = new Circle("синий", "фиолетовый", 25);
        triangle.printCalculation();
        rectangle.printCalculation();
        circle.printCalculation();
    }
}