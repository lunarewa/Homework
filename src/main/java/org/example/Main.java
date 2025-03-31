package org.example;

public class Main {
    public static void main(String[] args) {
        Product pro = new Product("Мяч", "31.03.2025", "Балахна", "Россия", 500, "Забронировано");
        pro.getInfo();

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Кружка", "29.03.2025", "Городец", "Россия", 400, "Без брони");
        productsArray[1] = new Product("Ложка", "29.03.2025", "Городец", "Россия", 400, "Без брони");
        productsArray[2] = new Product("Крабик", "29.03.2025", "Городец", "Россия", 400, "Без брони");
        productsArray[3] = new Product("Наполнитель", "29.03.2025", "Городец", "Россия", 400, "Без брони");
        productsArray[4] = new Product("Гель для душа", "31.03.2025", "Балахна", "Россия", 500, "Забронировано");
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
