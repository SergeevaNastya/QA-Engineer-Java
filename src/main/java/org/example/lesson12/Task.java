package org.example.lesson12;

public class Task {
    public static int sum = 0;

    public static void checkSize(String[][] array) throws MyArraySizeException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Ожидался массив размером 4x4");
        }
    }

    public static int sumArray(String[][] array) throws MyArrayDataException {
        for (String[] strings : array) {
            for (String string : strings) {
                try {
                    sum += Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Преобразование не удалось. Некорректный символ: " + string);
                }
            }
        }
        return sum;
    }

    public static void validateArray(String[][] array) {
        try {
            checkSize(array);
            sum = sumArray(array);
            System.out.println("Массив корректного размера. Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}