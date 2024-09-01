package org.example.lesson5;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Park {
    private final int parkSite;
    private final List<Attraction> attractions;

    @Data
    public class Attraction {
        private final String name;
        private final String workHours;
        private final int price;

        public void printInfoAttraction() {
            System.out.println("Название: " + name + "\nЧасы работы: " + workHours + "\nСтоимость: " + price + "\nПлощадка: " + parkSite);
        }
    }

    public static void main(String[] args) {
        List<Attraction> attractions = new ArrayList<>();
        Park park = new Park(4, attractions);
        Attraction wheel = park.new Attraction("Колесо", "10:00 - 18:00", 15);
        attractions.add(wheel);
        for (Attraction attraction : park.attractions) {
            attraction.printInfoAttraction();
        }
    }
}