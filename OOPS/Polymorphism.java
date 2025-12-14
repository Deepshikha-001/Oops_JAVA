package com.OOPS;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("meow meow");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("Roar");
        }
    }
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();

        d.speak();
        c.speak();
        l.speak();
    }
}
