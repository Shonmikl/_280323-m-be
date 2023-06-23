package org.example._2023_06_23.ex1;

import java.util.List;

public class A implements Inter1, Inter2, Inter3 {
    String[] s;
    List<A> list;
    public void get() {}

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}

class B extends A {
    public static void main(String[] args) {

    }
}

interface Inter1 {
    void m1();
}
interface Inter2 {
    void m2();
}

interface Inter3 {
    void m3();
}