package org.example;

public class Main {
        public static void Arraysize(String[][] array) throws MyArraySizeException {
            if (array == null) {
                throw new MyArraySizeException("Массив не может быть null");
            }

            if (array.length != 4) {
                throw new MyArraySizeException("Количество строк должно быть 4, но в массиве " + array.length);
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i].length != 4) {
                    throw new MyArraySizeException("Количество столбцов в строке " + (i + 1) +
                            " должно быть 4, но в массиве " + array[i].length);
                }
            }
        }

        public static int Arraysum(String[][] array) throws MyArraySizeException, MyArrayDataException {
            Arraysize(array);

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    String currentValue = array[i][j];
                    try {
                        int number = Integer.parseInt(currentValue);
                        sum += number;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j, currentValue);
                    }
                }
            }
            return sum;
        }
        public static void ArrayException(String[][] array) {
            try {
                int sum = Arraysum(array);
                System.out.println("Сумма: " + sum);
            } catch (MyArraySizeException e) {
                System.out.println("Ошибка размера массива: " + e.getMessage());
            } catch (MyArrayDataException e) {
                System.out.println("Ошибка в данных массива: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            System.out.println("1. Проверка размера массива");
            String[][] correctArray = {
                    {"6", "6", "6", "6"},
                    {"5", "5", "5"},
                    {"1", "1", "1", "1"},
                    {"3", "4", "5", "6"}
            };
            ArrayException(correctArray);

            System.out.println("\n2: Проверка данных массива");
            String[][] wrongDataArray = {
                    {"1", "1", "1", "1"},
                    {"2", "2", "2", "2"},
                    {"3", "3", "3", "3"},
                    {"4", "4", "4", "4"}
            };
            ArrayException(wrongDataArray);
        }
    }