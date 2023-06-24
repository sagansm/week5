package me.ssagan.zooapp.model;

public class Bear extends Animal{

    @Override
    void move(){
        System.out.println("I'm bear. I walk.");
    }

    @Override
    void eat(){
        super.eat();
        System.out.println("I also eat berries.");
    }
}
