package org.example.first;

public class Miska {
    private static int foodmiska;

    public Miska(int initialAmount) {
        this.foodmiska = initialAmount;
    }

    // Метод для добавления еды в миску
    public void addFood(int amount) {
        if (amount > 0) {
            foodmiska += amount;
            System.out.println("В миску добавлено " + amount);
        }
    }

    // Метод для кормления кота
    public static boolean feedCat(int amount) {
        if (foodmiska >= amount) {
            foodmiska -= amount;
            return true;
        }
        return false;
    }

    // Геттер для количества еды
    public int getFoodAmount() {
        return foodmiska;
    }
}
