package org.example.lesson10Task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal {
    private static final int MAX_RUN_LENGTH = 200;
    public static final int MIN_FOOD = 25;
    public static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength <= MAX_RUN_LENGTH) {
            System.out.println(name + " пробежал " + obstacleLength + " метров.");
        } else {
            System.out.println(name + " не может пробежать " + obstacleLength +
                    " метров. Максимальная дистанция: " + MAX_RUN_LENGTH + " метров.");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(int foodCount) {
        if (foodCount < 0) {
            throw new IllegalArgumentException("Количество еды не может быть отрицательным!");
        }
        if (foodCount < MIN_FOOD) {
            System.out.println("Не хватило еды для " + name);
            return;
        }
        isFull = true;
        System.out.println(name + " накормлен ");
    }
}