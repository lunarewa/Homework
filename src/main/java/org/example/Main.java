package org.example;

import org.example.first.Cat;
import org.example.first.Dog;
import org.example.first.Miska;
import org.example.second.Krug;
import org.example.second.Pryam;
import org.example.second.Trey;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
       Cat[] cat = new Cat[] {new Cat("Барсик", false),new Cat("Кок", false), new Cat("Тим", false)};
       cat[0].run(50);
       cat[1].run(100);
       cat[2].run(70);
        Dog[] dog = new Dog[] {new Dog("Боб"), new Dog("Кеша"), new Dog("Микки"), new Dog("Юра")};
        dog[0].run(300);
        dog[1].run(50);
        dog[2].run(400);
        dog[3].run(250);
        dog[0].swim(5);
        dog[3].swim(7);
        System.out.println("Количество кошек: " + cat.length);
        System.out.println("Количество собак: " + dog.length);

        Miska miska=new Miska(100);
        cat[0].eat(10);
        cat[1].eat(10);
        cat[2].eat(100);

        System.out.println("Осталось еды: " + miska.getFoodAmount());
        miska.addFood(20);
        System.out.println("Осталось еды: " + miska.getFoodAmount());

        System.out.println("Задание 2");

        Krug krug = new Krug(5,"Зеленый", "Желтый");
        Pryam pryam = new Pryam(5,6,"Синий", "Фиолетовый");
        Trey trey = new Trey(5,4,2,"Белый", "Красный");
        krug.info();
        pryam.info();
        trey.info();
    }


}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
