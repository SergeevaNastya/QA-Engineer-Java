package org.example.Lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private final int parkSite;
    private final List<Attraction> attractions;

    public Park(int parkSite, List<Attraction> attractions) {
        this.parkSite = parkSite;
        this.attractions = attractions;
    }

    public class Attraction {
        private final String name;
        private final String workHours;
        private final int price;

        public Attraction(String name, String workHours, int price) {
            this.name = name;
            this.workHours = workHours;
            this.price = price;
        }

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