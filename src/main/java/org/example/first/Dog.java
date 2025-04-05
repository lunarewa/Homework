package org.example.first;

public class Dog extends Animal {

     public Dog(String name) {
        super(name);

    }

    @Override
    public void run(int length) {
        if (length<=500) {
            System.out.println(name + " пробежал " + length + " м");
        }
        else {
            System.out.println(name + " не пробежал");
        }
    }

@Override
    public void swim(int length) {
            if (length<=10) {
                System.out.println(name + " проплыл " + length + " м");
            } else {
                    System.out.println(name + " не проплыл");
                }
            }
     }

