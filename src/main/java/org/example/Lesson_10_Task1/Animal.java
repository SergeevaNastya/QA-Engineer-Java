package org.example.Lesson_10_Task1;

import lombok.Data;
import lombok.Getter;

@Data
abstract public class Animal {
    String name;
    int obstacleLength;
    @Getter
    public static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int obstacleLength);

    public abstract void swim(int obstacleLength);
}
