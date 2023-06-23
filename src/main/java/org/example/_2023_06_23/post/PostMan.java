package org.example._2023_06_23.post;

import javax.swing.*;
import java.util.Date;

public class PostMan implements FlyAble {
    double height;

    public void bringPost(Post post) {

    }

    @Override
    public void fly() {
        System.out.println("5000 m");
    }
}

class Post implements FlyAble {

    @Override
    public void fly() {
        System.out.println("1000 m");
    }
}

interface FlyAble {
    void fly();
}
