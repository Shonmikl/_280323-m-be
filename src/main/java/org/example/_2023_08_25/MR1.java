package org.example._2023_08_25;

public class MR1 {
    public static void main(String[] args) {
        m1(() -> {
            System.out.println("/////");
            System.out.println("-----");
        });

    }

    public static void m1(R r) {
        System.out.println("####");
        r.get();
    }
}

@FunctionalInterface
interface R {
    void get();
}