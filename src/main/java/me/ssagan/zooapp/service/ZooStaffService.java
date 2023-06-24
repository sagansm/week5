package me.ssagan.zooapp.service;

import me.ssagan.zooapp.model.Bear;
import me.ssagan.zooapp.model.Shark;
import me.ssagan.zooapp.model.Snake;
import me.ssagan.zooapp.model.ZooStaff;

public class ZooStaffService {
    public static void demo(){

        Snake snake = new Snake();
        Shark shark = new Shark();
        Bear bear = new Bear();

        ZooStaff.makeMove(snake);
        ZooStaff.feed(snake);
        System.out.println("");
        ZooStaff.makeMove(shark);
        ZooStaff.feed(shark);
        System.out.println("");
        ZooStaff.makeMove(bear);
        ZooStaff.feed(bear);
    }
}
