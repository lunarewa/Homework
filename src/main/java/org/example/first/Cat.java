package org.example.first;

public class Cat extends Animal {
    boolean sit;

    public Cat(String name, boolean sit) {
        super(name);
        this.sit = sit;
    }

    @Override
    public void run(int length) {
        if (length<=200) {
            System.out.println(name + " пробежал "+ length  + " м");
        }
        else {
            System.out.println(name + " не пробежал");
        }
    }

    public void eat(int por) {
        if (Miska.feedCat(por)) {  // Кот ест 10 единиц еды
            sit = true;
            System.out.println("Кот поел и сыт");
        } else {
            System.out.println("В миске недостаточно еды");
        }
    }

}