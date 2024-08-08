package org.example.Lesson_10;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal {
    private static final int MAX_RUN_LENGTH = 200;
    @Getter
    private static int catCount = 0;
    int foodCount;
    private boolean isFull;
    int minimumFood = 25;

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

    public void eat(int foodCount){
        if (foodCount < 0){
            throw new IllegalArgumentException("Количество еды не может быть отрицательным!");
        }
        if (foodCount < minimumFood){
            System.out.println("Не хватило еды для " + name);
            return;
        }
        isFull = true;
        System.out.println(name + " накормлен ");
    }
}
