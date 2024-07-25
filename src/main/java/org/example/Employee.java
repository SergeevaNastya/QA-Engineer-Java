package org.example;

public class Employee {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final int salary;
    private final int age;

    public Employee(String lastName, String firstName, String middleName, String position, String email, String phoneNumber, int salary, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfoEmployee() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName + "\nПозиция: " + position +
                "\nЭлектронный адрес: " + email + "\nНомер телефона: " + phoneNumber + "\nЗарплата: " + salary +
                "\nВозраст: " + age);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Сергеев", "Сергей", "Сергеевич", "Инженер", "sergey@gmail.com", "+37533458795", 2000, 35);
        employee.printInfoEmployee();
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Виноградова", "Татьяна", "Владимировна", "Инженер", "vinogradova@gmail.com", "+375298105735", 3000, 25);
        empArray[1] = new Employee("Иванов", "Иван", "Иванович", "Менеджер", "ivanov@gmail.com", "+375339246378", 2700, 35);
        empArray[2] = new Employee("Крылов", "Максим", "Викторович", "Экономист", "krylov@gmail.com", "+375456932485", 2500, 25);
        empArray[3] = new Employee("Кузюк", "Ирина", "Александровна", "Бухгалтер", "irina@gmail.com", "+375452369633", 1700, 22);
        empArray[4] = new Employee("Корзун", "Александр", "Сергеевич", "Инженер", "korzun@gmail.com", "+375425897585", 2000, 45);
    }
}
