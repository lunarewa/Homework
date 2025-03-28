package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        task5(1, 7);
        task6(-9);
        task7(-9);
        task8("Мяу", 3);
        System.out.println(task9(100));
        task10();
        task11();
        task12();
        task13();
        task14(5, 7);
    }

    //1
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    //2
    public static void checkSumSign() {
        int a = 9;
        int b = -9;
        if (a + b >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    //3
    public static void printColor() {
        int value = 9;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //4
    public static void compareNumbers() {
        int a = 4;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a<b");
        }
    }

    //5
    public static void task5(int a, int b) {
        if (a + b >= 10 & a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //6
    public static void task6(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    //7
    public static void task7(int a) {
        if (a >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    //8
    public static void task8(String a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    //9
    public static boolean task9(int a) {
        if (a % 4 == 0 || a == 100) {
            return true;
        }
        return false;
    }

    //10
    public static void task10() {
        int a[] = {1, 0, 1, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++)
            if (a[i] == 0)
                a[i] = 1;
            else
                a[i] = 0;
        System.out.println(Arrays.toString(a));
    }

    //11
    public static void task11() {
        int[] a = new int[100];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = i + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //12
    public static void task12() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] b = new int[a.length];
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    //13
    public static void task13() {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            a[i][a.length - i - 1] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][i] = 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //14
    public static int[] task14(int len, int initialValue) {
        int b[] = new int[len];
        for (int i = 0; i < b.length; i++) {
            b[i] = initialValue;
            System.out.print(b[i] + " ");
        }
        return b;
    }
}





