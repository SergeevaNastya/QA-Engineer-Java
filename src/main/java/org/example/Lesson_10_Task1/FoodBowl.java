package org.example.Lesson_10_Task1;

import lombok.Data;

@Data
public class FoodBowl {
    private int foodCount;

    public FoodBowl(int foodCount) {
        this.foodCount = foodCount;
    }

    public void addFood(int addCount) {
        if (addCount < 0) {
            throw new IllegalArgumentException("Количество добавляемой еды не может быть отрицательным!");
        }
        foodCount += addCount;
        System.out.println("в миске " + foodCount + " единиц еды.");
    }

    public void reduceFood(int reduceCount) {
        if (foodCount < reduceCount) {
            throw new IllegalArgumentException("Не хватает еды в миске!");
        }
        foodCount -= reduceCount;
    }
}