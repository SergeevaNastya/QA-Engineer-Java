package org.example.lesson10Task1;

import lombok.Setter;

@Setter
public class Dog extends Animal {
    private static final int MAX_RUN_LENGTH = 500;
    private static final int MAX_SWIM_LENGTH = 10;
    public static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
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
        if (obstacleLength <= MAX_SWIM_LENGTH) {
            System.out.println(name + " проплыл " + obstacleLength + " метров.");
        } else {
            System.out.println(name + " не может проплыть " + obstacleLength +
                    " метров. Максимальная дистанция: " + MAX_SWIM_LENGTH + " метров.");
        }
    }
}