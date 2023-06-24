package me.ssagan.zooapp.model;

public class Snake extends Animal {
    @Override
    void move() {
        System.out.println("I'm snake. I crawl.");
    }

    @Override
    void eat() {
        System.out.println("I eat mouse.");
    }

}
