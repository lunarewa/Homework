package org.example.first;

public class Animal {
    String name;
int a=0;
    Animal(String name){
        this.name=name;

    }

    public void run(int length) {
        System.out.println(name + " бежит "+length );
        a++;
    }
    public void swim(int length){
            System.out.println(name + "проплыл" + length + "м");
        }
}


