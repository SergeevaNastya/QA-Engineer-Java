package org.example;

public class Park {
    private final int parkSite;
    public Park(int parkSite) {
        this.parkSite = parkSite;
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
        Park park = new Park(4);
        Attraction wheel = park.new Attraction("Колесо", "10:00 - 18:00", 15);
        wheel.printInfoAttraction();
    }
}
