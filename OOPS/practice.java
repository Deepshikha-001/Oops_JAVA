package com.OOPS;


class A {
    private A() {
        System.out.println("Private Constructor");
    }
    public static void createInstance() {
        new A();
    }
}
public class practice {
    public static void main(String[] args) {
        A.createInstance();
    }
}

