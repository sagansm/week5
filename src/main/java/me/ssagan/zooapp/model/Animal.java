package me.ssagan.zooapp.model;

public abstract class Animal {
    abstract void move();

    void eat(){
        System.out.println("I eat fish.");
    }
}
